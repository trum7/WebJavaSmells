package proyecto1

class Usuario {

	int acceso
	Persona persona
	String usuario
	String password
	
    static constraints = {
		password size: 5..15, blank: false
    }
	
}
