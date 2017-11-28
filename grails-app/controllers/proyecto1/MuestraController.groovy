package proyecto1



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class MuestraController {

    static allowedMethods = [save: "POST", update: "PUT", dele: "DELETE"]

    def index(Integer max) {
		if( session.role < 2 ){
			flash.message = "Authentication needed!"
			redirect (controller: "user", action: 'index')
		}else{
           params.max = Math.min(max ?: 10, 100)
           respond Muestra.list(params), model:[muestraInstanceCount: Muestra.count()]
		}
    }

    def show(Muestra muestraInstance) {
		if( session.role < 2 ){
		   flash.message = "Authentication needed!"
		   redirect (controller: "user", action: 'index')
		}else{
           respond muestraInstance
		}
    }

    def create() {
		if( session.role < 2 ){
		   flash.message = "Authentication needed!"
		   redirect (controller: "user", action: 'index')
		}else{
           respond new Muestra(params)
		}   
    }

	def creation() {
		if( session.role < 2 ){
		   flash.message = "Authentication needed!"
		   redirect (controller: "user", action: 'index')
		}
	}

	
	@Transactional
	def insert() {
		if( session.role < 2 ){
		   flash.message = "Authentication needed!"
		   redirect (controller: "user", action: 'index')
		}else{
		   Cliente cos = Cliente.findByNombre( params.cliente )
		   String name = params.nombre
		   double density = Double.parseDouble( params.api );
		   Muestra muestra = new Muestra( );
		   muestra.costumer = cos;
		   muestra.nombre = name;
		   muestra.api =  density;
		   muestra.save  flush:true
		   
		   session.muestra = muestra
		   redirect( controller: 'Fraccion', action: 'creation' )
		
		}
	}
	
	def select(  ){
		if( session.role < 1 ){
			flash.message = "Authentication needed!"
			redirect (controller: "user", action: 'index')
		 }
	}
		
	def assign(  ){
		
		Muestra instancia = Muestra.findByNombre( params.nombre )
		session.muestra = instancia;
		redirect( controller: 'Fraccion' , action: 'modify' )
	}
	
	@Transactional
	def eliminate(  ){
		
		Muestra instancia = Muestra.findByNombre( params.nombre )
		if( instancia != null ){
			
			def fracciones = []
			fracciones = Fraccion.findAllByMuestra( instancia );
			for( int i = 0; i < fracciones.size( ); i++ ){
				
				fracciones.get( i ).delete flush : true
				
			}
			AnalisisFraccion analisis = AnalisisFraccion.findByMuestra( instancia )
			if( analisis != null ){
				
				analisis.delete flush : true
				
			}
			Solicitud sol = Solicitud.findByMuestra( instancia )
			sol.delete flush : true
			instancia.delete flush : true
			
		    //flash.message = "Muestra eliminada"
			//redirect( controller: "administrador", action : 'index' )
		}
		
		flash.message = "Muestra no encontrada"
		redirect( controller: "administrador", action : 'index' )
		
	}

	
	def requestDelete( ){
		
		if( session.role < 3 ){
			flash.message = "Authentication needed!"
			redirect( controller: 'user', action: 'index' )
		}
		
	}  
	
	
    @Transactional
    def save(Muestra muestraInstance) {
        if (muestraInstance == null) {
            notFound()
            return
        }

        if (muestraInstance.hasErrors()) {
            respond muestraInstance.errors, view:'create'
            return
        }

        muestraInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'muestra.label', default: 'Muestra'), muestraInstance.id])
                redirect muestraInstance
            }
            '*' { respond muestraInstance, [status: CREATED] }
        }
		session.muestra = muestraInstance
		
    }

    def edit(Muestra muestraInstance) {
        respond muestraInstance
    }

    @Transactional
    def update(Muestra muestraInstance) {
        if (muestraInstance == null) {
            notFound()
            return
        }

        if (muestraInstance.hasErrors()) {
            respond muestraInstance.errors, view:'edit'
            return
        }

        muestraInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Muestra.label', default: 'Muestra'), muestraInstance.id])
                redirect muestraInstance
            }
            '*'{ respond muestraInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Muestra muestraInstance) {

        if (muestraInstance == null) {
            notFound()
            return
        }

        muestraInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Muestra.label', default: 'Muestra'), muestraInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'muestra.label', default: 'Muestra'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
