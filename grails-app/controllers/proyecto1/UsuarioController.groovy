package proyecto1



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional
class UsuarioController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
		if( session.role < 3 ){
		   flash.message = "Authentication needed!"
		   redirect (controller: "user", action: 'index')
		}else{
           params.max = Math.min(max ?: 10, 100)
           respond Usuario.list(params), model:[usuarioInstanceCount: Usuario.count()]
		}
	}

    def show(Usuario usuarioInstance) {
		if( session.role < 3 ){
			flash.message = "Authentication needed!"
			redirect (controller: "user", action: 'index')
		 }else{
           respond usuarioInstance
		 }
    }

    def create() {
		if( session.role < 3 ){
			flash.message = "Authentication needed!"
			redirect (controller: "user", action: 'index')
		 }else{
           respond new Usuario(params)
		 }
    }
	
	def crear() {
		
		if( session.role < 3 ){
			flash.message = "Authentication needed!"
			redirect (controller: "user", action: 'index')
		 }
		 
	}
	
	@Transactional
	def crear2( ){
		if( session.role < 3 ){
			flash.message = "Authentication needed!"
			redirect (controller: "user", action: 'index')
		 }else{
		   
            String usuario = params.usuario;
			String pass = params.password;
			
			Persona persona = Persona.findByDocumento( params.persona )
			
			int acceso;
			
			acceso = Integer.parseInt( params.acceso );
			
			
			Usuario usu = new Usuario( );
			usu.usuario = usuario;
			usu.password = pass;
			usu.persona = persona;
			usu.acceso = acceso; 
			
			usu.save flush : true
			 redirect (controller: "administrador", action: 'index')
			
		 
		 }
		
		
	}
	
	def del( ){ 
		
		if( session.role < 3 ){
			flash.message = "Authentication needed!"
			redirect( controller: "user", action: 'index' )
		}
		
	}
	
	@Transactional
	def delet( ){
		String nombre = params.nombre
		Usuario user = proyecto1.Usuario.findByUsuario( nombre )
		
		if( user == null ){
		   flash.message "Wrong user"	
		   redirect( action: 'del' )	
		}else{
		   if( user.acceso > session.role ){
			   flash.message = "Authentication needed!"
			   redirect( action: 'del' )
		   }else{
		      user.delete flush : true
		   }
		
		}
		
		redirect( controller: "administrador", action: 'index' )
		
	}

    @Transactional(readOnly=false)
    def save(Usuario usuarioInstance) {
        if (usuarioInstance == null) {
            notFound()
            return
        }

        if (usuarioInstance.hasErrors()) {
            respond usuarioInstance.errors, view:'create'
            return
        }

        usuarioInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'usuario.label', default: 'Usuario'), usuarioInstance.id])
                redirect usuarioInstance
            }
            '*' { respond usuarioInstance, [status: CREATED] }
        }
    }

    def edit(Usuario usuarioInstance) {
		if( session.role < 3 ){
			flash.message = "Authentication needed!"
			redirect (controller: "user", action: 'index')
		 }else{
           respond usuarioInstance
		 }
		
    }

    @Transactional
    def update(Usuario usuarioInstance) {
        if (usuarioInstance == null) {
            notFound()
            return
        }

        if (usuarioInstance.hasErrors()) {
            respond usuarioInstance.errors, view:'edit'
            return
        }

        usuarioInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Usuario.label', default: 'Usuario'), usuarioInstance.id])
                redirect usuarioInstance
            }
            '*'{ respond usuarioInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Usuario usuarioInstance) {

        if (usuarioInstance == null) {
            notFound()
            return
        }

        usuarioInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Usuario.label', default: 'Usuario'), usuarioInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'usuario.label', default: 'Usuario'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
