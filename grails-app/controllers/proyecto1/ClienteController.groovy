package proyecto1



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class ClienteController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
		if( session.role < 2 ){
			flash.message = "Authentication needed!"
			redirect (controller: "user", action: 'index')
		}else{
           params.max = Math.min(max ?: 10, 100)
           respond Cliente.list(params), model:[clienteInstanceCount: Cliente.count()]
		}
    }

    def show(Cliente clienteInstance) {
		if( session.role < 2 ){
		   flash.message = "Authentication needed!"
		   redirect (controller: "user", action: 'index')
		}else{
           respond clienteInstance
		}
    }

    def create() {
		if( session.role < 3 ){
		   flash.message = "Authentication needed!"
		   redirect (controller: "user", action: 'index')
		}else{
           respond new Cliente(params)
		}
    }
	
	def crear() {
		if( session.role < 3 ){
		   flash.message = "Authentication needed!"
		   redirect (controller: "user", action: 'index')
		}else{
		   respond new Cliente(params)
		}
	}
	
	@Transactional
	def creation( ){
		
		String nombre = params.nombre
		String rut = params.rut
		String correo = params.correo
		String direccion = params.direccion
		String telefono = params.telefono
		
		String pass = params.password
		
		Cliente cli = new Cliente( );
		cli.nombre = nombre;
		cli.rut = rut;
		cli.correo = correo;
		cli.direccion = direccion;
		cli.telefono = Long.parseLong( telefono );
		cli.password = pass;
		cli.save flush : true
		

		
		redirect( controller:"user" , action:'goTo' )
	}
	
	def home() {
		if( session.role < 1 ){
		   flash.message = "Authentication needed!"
		   redirect (controller: "user", action: 'index')
		 }
		 
		
	}
	
	def assign() {
		if( session.role < 1 ){
		   flash.message = "Authentication needed!"
		   redirect (controller: "user", action: 'index')
		 }else{
		 
		    Muestra instancia = Muestra.findByNombre( params.nombre )
		    session.muestra = instancia;
			redirect( controller: "ViewReport", action: 'graphics')
		 }
		 
		
	}
	
	

    @Transactional
    def save(Cliente clienteInstance) {
        if (clienteInstance == null) {
            notFound()
            return
        }

        if (clienteInstance.hasErrors()) {
            respond clienteInstance.errors, view:'create'
            return
        }

        clienteInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'cliente.label', default: 'Cliente'), clienteInstance.id])
                redirect clienteInstance
            }
            '*' { respond clienteInstance, [status: CREATED] }
        }
    }

    def edit(Cliente clienteInstance) {
        respond clienteInstance
    }

    @Transactional
    def update(Cliente clienteInstance) {
        if (clienteInstance == null) {
            notFound()
            return
        }

        if (clienteInstance.hasErrors()) {
            respond clienteInstance.errors, view:'edit'
            return
        }

        clienteInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Cliente.label', default: 'Cliente'), clienteInstance.id])
                redirect clienteInstance
            }
            '*'{ respond clienteInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Cliente clienteInstance) {

        if (clienteInstance == null) {
            notFound()
            return
        }

        clienteInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Cliente.label', default: 'Cliente'), clienteInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'cliente.label', default: 'Cliente'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
