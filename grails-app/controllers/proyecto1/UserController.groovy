package proyecto1

class UserController {

	
	def index() { }
	
	def login = {
		String userna = params.username
		String pass = params.password
		Usuario buscado = Usuario.findByUsuario(userna)

		if( buscado != null ){
		   if( buscado.password.equals( pass ) ){
			   session.user = buscado.usuario
			   session.role = buscado.acceso
			   switch( buscado.acceso ){
			      case 1:
				     redirect (controller: "cliente", action: 'home')
				     break;
			      case 2:
					 redirect (controller: "ingeniero", action: 'index')
				     break;
			      case 3:
			         redirect (controller: "administrador", action: 'index')
			         break;
			      case 4:
			         redirect (controller: "administrador", action: 'index')
			         break;
					  
			   }
			   
		   }else{
		   
		      flash.message = "Login failed"
		      redirect (controller: 'user' ,action: 'index')
		   
		   }
		   
		}else{
		   Cliente buscado2 = Cliente.findByNombre(userna)
		   if( buscado2 != null ){
		      
			  if( buscado2.password.equals( pass ) ){
				  session.user = buscado2.nombre
				  session.role = 1
				  redirect (controller: "cliente", action: 'home')
		      }
			   
			   
		   }else{
		      flash.message = "Login failed"
		      redirect (controller: 'user' ,action: 'index')
		   }
		   
		}
		
		
	} 
	
	def goTo( ){
		
		switch( session.role ){
			case 1:
			   redirect (controller: "cliente", action: 'home')
			   break;
			case 2:
			   redirect (controller: "ingeniero", action: 'index')
			   break;
			case 3:
			   redirect (controller: "administrador", action: 'index')
			   break;
			case 4:
			   redirect (controller: "administrador", action: 'index')
			   break;
				
		 }
		
	}
	
	def logout = {
		session.user = null
		session.role = 0
		redirect (action: 'index')
	}
	
}
