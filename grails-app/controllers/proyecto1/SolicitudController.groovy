package proyecto1



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class SolicitudController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
		if( session.role < 3 ){
			
			flash.message = "Authentication needed!"
		    redirect (controller: "user", action: 'index')
			
		 }else{
           params.max = Math.min(max ?: 10, 100)
           respond Solicitud.list(params), model:[solicitudInstanceCount: Solicitud.count()]
		 }
    }

    def show(Solicitud solicitudInstance) {
		if( session.role < 3 ){
			
			flash.message = "Authentication needed!"
			redirect (controller: "user", action: 'index')
			
		 }else{
            respond solicitudInstance
		 }
    }

    def create() {
		if( session.role < 2 ){
			
			flash.message = "Authentication needed!"
			redirect (controller: "user", action: 'index')
			
		 }else{
            respond new Solicitud(params)
			
		 }
    }
	
	@Transactional
	def insert() {
		if( session.role < 2 ){
			
			flash.message = "Authentication needed!"
			redirect (controller: "user", action: 'index')
			
		 }else{
		    Muestra instancia = Muestra.findByNombre( params.nombre )
			Muestra muestra = instancia;
			String descrip = params.description
			Solicitud soli = new Solicitud( );
			soli.muestra = muestra;
			soli.description = descrip;
			soli.save flush : true
			redirect( controller: "ingeniero", action: 'index')
		 }
	}

    @Transactional
    def save(Solicitud solicitudInstance) {
        if (solicitudInstance == null) {
            notFound()
            return
        }

        if (solicitudInstance.hasErrors()) {
            respond solicitudInstance.errors, view:'create'
            return
        }

        solicitudInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'solicitud.label', default: 'Solicitud'), solicitudInstance.id])
                redirect solicitudInstance
            }
            '*' { respond solicitudInstance, [status: CREATED] }
        }
    
	}

    def edit(Solicitud solicitudInstance) {
		if( session.role < 3 ){
			
			flash.message = "Authentication needed!"
			redirect (controller: "user", action: 'index')
			
		 }else{
            respond solicitudInstance
		 }
    }

    @Transactional
    def update(Solicitud solicitudInstance) {
        if (solicitudInstance == null) {
            notFound()
            return
        }

        if (solicitudInstance.hasErrors()) {
            respond solicitudInstance.errors, view:'edit'
            return
        }

        solicitudInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Solicitud.label', default: 'Solicitud'), solicitudInstance.id])
                redirect solicitudInstance
            }
            '*'{ respond solicitudInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Solicitud solicitudInstance) {

        if (solicitudInstance == null) {
            notFound()
            return
        }

        solicitudInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Solicitud.label', default: 'Solicitud'), solicitudInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'solicitud.label', default: 'Solicitud'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
