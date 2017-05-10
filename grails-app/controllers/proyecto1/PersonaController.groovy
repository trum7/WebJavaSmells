package proyecto1



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class PersonaController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
		if( session.role < 3 ){		
		   flash.message = "Authentication needed!"
		   redirect (controller: "user", action: 'index')
		}else{
		   params.max = Math.min(max ?: 10, 100)
		   respond Persona.list(params), model:[personaInstanceCount: Persona.count()]
		}   
    }

    def show(Persona personaInstance) {
		if( session.role < 3 ){
		   flash.message = "Authentication needed!"
		   redirect (controller: "user", action: 'index')
		}else{
           respond personaInstance
		}
    }

    def create() {
		if( session.role < 3 ){
			flash.message = "Authentication needed!"
			redirect (controller: "user", action: 'index')
		 }else{
           respond new Persona(params)
		 }
    }
	
	def crear() {
		if( session.role < 3 ){
			flash.message = "Authentication needed!"
			redirect (controller: "user", action: 'index')
		 }
	}
	
	@Transactional
	def crear2() {
		if( session.role < 3 ){
			flash.message = "Authentication needed!"
			redirect (controller: "user", action: 'index')
		 }else{
		   String nombre = params.nombre;
		   String correo = params.correo;
		   long documento = Long.parseLong( params.documento );
		   long telefono = Long.parseLong( params.telefono );
		   String direccion = params.direccion;
		   
		   Persona per = new Persona( );
		   per.nombre = nombre;
		   per.correo = correo;
		   per.documento = documento;
		   per.telefono = telefono;
		   per.direccion = direccion;
		   
		   per.save flush : true
		   
		   redirect( controller: "Administrador", action: 'index' )
		 }
		 
		 
	}

    @Transactional
    def save(Persona personaInstance) {
        if (personaInstance == null) {
            notFound()
            return
        }

        if (personaInstance.hasErrors()) {
            respond personaInstance.errors, view:'create'
            return
        }

        personaInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'persona.label', default: 'Persona'), personaInstance.id])
                redirect personaInstance
            }
            '*' { respond personaInstance, [status: CREATED] }
        }
    }

    def edit(Persona personaInstance) {
        respond personaInstance
    }

    @Transactional
    def update(Persona personaInstance) {
        if (personaInstance == null) {
            notFound()
            return
        }

        if (personaInstance.hasErrors()) {
            respond personaInstance.errors, view:'edit'
            return
        }

        personaInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Persona.label', default: 'Persona'), personaInstance.id])
                redirect personaInstance
            }
            '*'{ respond personaInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Persona personaInstance) {

        if (personaInstance == null) {
            notFound()
            return
        }

        personaInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Persona.label', default: 'Persona'), personaInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'persona.label', default: 'Persona'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
