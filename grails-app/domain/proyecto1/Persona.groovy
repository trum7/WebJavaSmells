package proyecto1

class Persona implements Comparable<Persona> {

	long documento
	String nombre
	long telefono
	String direccion
	String correo
	
	static constraints = {
		correo email: true, blank: false
		documento blank: false
		nombre blank: false
	}

	@Override
	public int compareTo(Persona o) {
			
		if( this.id == o.id ){
			return 0;
		}else{
			return 1;	
		}
		
	
	}
	
	
}
