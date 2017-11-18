public class Aseador extends Funcionario {
	//habitaciones en las qe�ue hace aseo
	private ArrayList<Habitacion> habitacionesACargo = new ArrayList<Habitacion>();
	//contructor
	public Aseador(String nombre, int edad, String identificacion) {
		super(nombre, edad, identificacion, "ASEADOR");
	}
	//setters y getters
	public ArrayList<Habitacion> getHabitacionesACargo() {
		return habitacionesACargo;
	}

	public void setHabitacionesACargo(ArrayList<Habitacion> habitacionesACargo) {
		this.habitacionesACargo = habitacionesACargo;
	}

}

public final class Bebida {

	private String marca;
	//constructor
	public Bebida(String marca){
		this.marca = marca;
	}
	//setter y getter
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
}
public class Botones extends Funcionario{

	public Botones(String nombre, int edad, String identificacion) {
		super(nombre, edad, identificacion, "BOTONES");

	}

}
public class Cama_doble extends Cama {


	public Cama_doble(){
		this.setAncho(150);
		this.setLargo(190);

	}
	@Override
	public String getClase(){
		String clase;
		clase = "Cama Doble";
		return clase;
	}

}


public class Cama_king extends Cama {


	public Cama_king(){
		this.setAncho(190);
		this.setLargo(215);

	}


	@Override
	public String getClase(){
		String clase;
		clase = "Cama King";
		return clase;
	}

}
public class Cama_queen extends Cama{
	public Cama_queen(){
		this.setAncho(180);
		this.setLargo(190);

	}


	@Override
	public String getClase(){
		String clase;
		clase = "Cama Queen";
		return clase;
	}

}
public class Cama_sencilla extends Cama{

	//constructor
	public Cama_sencilla(){
		//medidas cama sencilla por defecto
		this.setAncho(90);
		this.setLargo(190);

	}

	@Override
	public String getClase(){
		String clase;
		clase = "Cama Sencilla";
		return clase;
	}
}
public class Cama {

	private int ancho;
	private int largo;
	//setters y getters
	public int getAncho(){
		return this.ancho;
	}

	public int getLargo(){
		return this.largo;
	}

	public void setLargo(int largo){
		this.largo = largo;
	}

	public void setAncho(int ancho){
		this.ancho = ancho;
	}
	//metodo abstracto
	public abstract String getClase(){

  }

}
public class Cliente extends Persona {

	    private boolean Activo;
	    private Reserva reserva;
		//constructor
	    public Cliente(String nombre, int edad, String identificacion) {
		super(nombre, edad, identificacion);
		//default activo=false
		this.Activo = false;
		}


		public int getNumHabitacion(){
			int habitacion;
			if(this.reserva != null){
				habitacion = this.reserva.getHabitacion().getNum_Habitacion();
			}else{
				habitacion = 0;
			}

			return habitacion;
		}

		public void setActivo(boolean activo){
			this.Activo = activo;
		}

		public boolean getActivo(){
			return this.Activo;
		}




		public Factura getFactura() {
			if(this.reserva != null){
			return reserva.getFactura();
			} else{
				return null;
			}
		}

		public Reserva getReserva() {
			return this.reserva;
		}


		public void setFactura(Factura factura) {
			if(reserva != null){
			this.reserva.setFactura(factura);
			}
		}

		public void setReserva(Reserva reserva) {
			this.reserva = reserva;
		}


}
public final class Cocina {
		private int nevera;
		private int estufa;
		private int alacena;
		//constructor
		public Cocina(int nevera, int estufa, int alacena){
			this.nevera = nevera;
			this.estufa = estufa;
			this.alacena = alacena;

		}
		//setters y getters
		public void setNevera(int nevera){
			this.nevera = nevera;
		}

		public int getNevera(){
			return this.nevera;
		}
		public void setEstufa(int estufa){
			this.estufa = estufa;
		}

		public int getEstufa(){
			return this.estufa;
		}
		public void setAlacena(int alacena){
			this.alacena = alacena;
		}

		public int getAlacena(){
			return this.alacena;
		}
}

public final class Cuadro {
		private int precio;

		//setter y getter
		public void setPrecio(int precio){
			this.precio = precio;
		}


		public int getPrecio(){
			return this.precio;
		}
}
public class Doble extends Habitacion {
	//constructor

	public Doble(int banos, ArrayList<Minibar> minibar, ArrayList<Televisor> televisor, ArrayList<Cama> cama,
			int precio,int num_habitacion, boolean ocupado){
		super(banos,minibar,televisor,num_habitacion, ocupado,precio,cama);

	}
}
public class Factura {
	private String diaCheckin = (Test.diaGeneral[0]+"/"+Test.diaGeneral[1]+"/"+Test.diaGeneral[2]);
	private String diaCheckout =null;
	private int deuda;
	private ArrayList<Gasto> saldosAdicionales = new ArrayList<Gasto>();

	public ArrayList<Gasto> getSaldosAdicionales() {
		return saldosAdicionales;
	}
	//a�adir un gasto a la lista
	public void setSaldosAdicionales(Gasto adicional) {
		this.saldosAdicionales.add(adicional);
	}
	public String getDiaCheckin() {
		return diaCheckin;
	}
	//obtener el dia de salida
	public String getDiaCheckout() {
		String DiaCheckout = null;
		if(diaCheckout != null){
		DiaCheckout = this.diaCheckout;
		}
		return DiaCheckout;
	}
	//recibe el dia en un int[] y lo pasa a un strng
	public void setDiaCheckout(int[] diaCheckout) {
		this.diaCheckout = (diaCheckout[0]+"/"+diaCheckout[1]+"/"+diaCheckout[2]);
	}
	public int getDeuda() {
		return deuda;
	}
	//sumar un gasto a la deuda
	public void setDeuda(int deuda) {
		this.deuda += deuda;
	}

}

public abstract class Funcionario extends Persona {
	private boolean ocupado;
	private String cargo;
	//constructor
	public Funcionario(String nombre, int edad, String identificacion,String cargo) {
		//contructor persona
		super(nombre, edad, identificacion);
		//ocupado por default = false
		this.ocupado = false;
		this.cargo = cargo;
	}
	//setters y getters
	public String getCargo(){
		return this.cargo;
	}

	public void setOcupado(boolean ocupado){
		this.ocupado = ocupado;
	}

	public  boolean getOcupado(){
		return this.ocupado;
	}
}
public class Gasto {
		private String descripcion;
		private int precio;
		private String dia;
		//constructor
		public Gasto(String descripcion,int precio){
			this.descripcion = descripcion;
			this.precio = precio;
			this.dia = (business.Test.diaGeneral[0]+"/"+business.Test.diaGeneral[1]+"/"+business.Test.diaGeneral[2]);
			System.out.println("Dia: "+dia);
		}

		//setters y getters
		public String getDescripcion() {
			return descripcion;
		}
		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}
		public int getPrecio() {
			return precio;
		}
		public void setPrecio(int precio) {
			this.precio = precio;
		}


		public String getDia() {
			return dia;
		}
}
public abstract class  Habitacion {
		private int bao = 0;
		private ArrayList<Minibar> minibar = new ArrayList<Minibar>();;
		private ArrayList<Televisor> televisor  = new ArrayList<Televisor>();
		private Telefono telefono = new Telefono();
		private boolean ocupado;
		private int num_habitacion;
		private int precio;
		protected ArrayList<Cama> camas = new ArrayList<Cama>();
		private boolean mantenimiento = false;
		private boolean limpio;
		private boolean servicioHabitacion;
		private String pedido;

	//constructor
		public Habitacion(int baos,ArrayList<Minibar> minibar,ArrayList<Televisor> televisor
				,int num_habitacion,boolean ocupado,int precio, ArrayList<Cama> cama){
			this.bao = baos;
			this.camas = cama;
			this.minibar = minibar;
			this.televisor = televisor;
			this.ocupado = ocupado;
			this.num_habitacion = num_habitacion;
			this.precio = precio;
			this.limpio = true;
			this.servicioHabitacion = false;
		}


		//getters y setters
		public String getPedido() {
			return pedido;
		}



		public void setPedido(String pedido) {
			this.pedido = pedido;
		}



		public boolean getServicioHabitacion() {
			return servicioHabitacion;
		}

		public void setServicioHabitacion(boolean servicioHabitacion) {
			this.servicioHabitacion = servicioHabitacion;
		}
		public boolean getLimpio() {
			return limpio;
		}

		public void setLimpio(boolean limpio) {
			this.limpio = limpio;
		}

		public boolean getMantenimiento() {
			return mantenimiento;
		}
		public void setMantenimiento(boolean mantenimiento) {
			this.mantenimiento = mantenimiento;
		}
		public void setOcupado(boolean ocupado){
			this.ocupado = ocupado;
		}
		public boolean getOcupado(){
			return this.ocupado;
		}
		public int getNum_Habitacion(){
			return this.num_habitacion;
		}
		public void restarMinibarBebidas(){
			this.minibar.get(0).restarBebida();
		}
		public int getCantidadMiniBar(){
			return this.minibar.size();
		}
		public int getBebidas(){
			return this.minibar.get(0).getBebidas().size();
		}
		public void setBebidas(int cantidad){
			 this.minibar.get(0).setBebidas(cantidad);
		}
		public int getPulgadas(){
			return this.televisor.get(0).getPulgadas();
		}
		//este metoto ayuda no solo a asignar un televisor sino tanbi�n a quitarlos
		//esto se da si la cantidad es <0
		public void setTelevisor(int cantidad){
			if(cantidad<0){
				this.televisor.remove(this.televisor.size()-1);
			}
			if(cantidad>0){
				Televisor temporal = new Televisor("Sony");
				televisor.add(temporal);
			}
		}

		public int getCantidadTelevisor(){
			return this.televisor.size();
		}

		public int getPrecioTelefono(){
			return this.telefono.getPrecioTelefono();
		}

		public int getPrecio(){
			return this.precio;
		}

		public String[] getCamas(){
			String[] camas = new String[this.camas.size()];

			for(int i=0;i<this.camas.size();i++){
				camas[i] = this.camas.get(i).getClase();
			}
			return camas;
		}


}

public class Matrimonial extends Habitacion{
//constructor

	public Matrimonial(int banos, ArrayList<Minibar> minibar, ArrayList<Televisor> televisor
			, ArrayList<Cama> camas, int precio,int num_habitacion, boolean ocupado){
		super(banos,minibar,televisor,num_habitacion,ocupado,precio,camas);
	}

}
public class Mesero extends Funcionario{

	public Mesero(String nombre, int edad, String identificacion) {
		super(nombre, edad, identificacion, "SERVICIO A LA HABITACION");
	}

}

public final class Minibar {
		private ArrayList<Bebida> bebidas;
		//constructor con la cantidad de bebidas que posee
		public Minibar(int bebidas){
			this.bebidas = new ArrayList<Bebida>();
			for(int i=0;i<bebidas;i++){
				Bebida temporal = new Bebida("Cocacola");
				this.bebidas.add(temporal);
			}

		}

		public void setBebidas(int cantidad){
			for(int i=0;i<cantidad;i++){
				Bebida temporal = new Bebida("Cocacola");
				this.bebidas.add(temporal);
			}
		}

		public ArrayList<Bebida> getBebidas(){
			return this.bebidas;
		}
		//elimina bebidas
		public void restarBebida(){
			this.bebidas.remove(bebidas.size()-1);
		}
}
public class Reserva {
	private Habitacion habitacion;
	private Cliente cliente;
	private Factura factura;
	private int dias;
	private boolean activa;
	//getters y setters

	public boolean getActiva() {
		return activa;
	}
	public void setActiva(boolean activa) {
		this.activa = activa;
	}
	public int getDias() {
		return dias;
	}
	//aumenta los dias de reserva
	public void setDias(int dias) {
		this.dias += dias;
	}
	public Habitacion getHabitacion() {
		return habitacion;
	}
	public void setHabitacion(Habitacion habitacion) {
		this.habitacion = habitacion;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Factura getFactura() {
		return factura;
	}
	public void setFactura(Factura factura) {
		this.factura = factura;
	}
	//setter getter deuda por facilidad
	public void setDeuda(int deuda){
		this.factura.setDeuda(deuda);
	}
	public int getDeuda(){
		return this.factura.getDeuda();
	}
}
