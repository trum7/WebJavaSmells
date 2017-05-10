package proyecto1

class AdministradorController {

    def index() {
		
		if( session.role < 3 ){
			
			flash.message = "Authentication needed!"
			redirect (controller: "user", action: 'index')
			
		 }
		
	}

}
