public class BusquedaCliente {

	//comprueba si exite el id
	public static boolean verificarID(String id){
		for(Cliente cli: business.Test.clientes){
			if(cli.getID().equals(id)){
				return true;
			}
		}
			return false;
	}
	//devuelve la posicinn en la lista de clientes del id manadado
	public static int buscarClienteID(String id){
		int posicion = -1;
		boolean encontrado = false;
		for(int i=0; i<Test.clientes.size() && encontrado == false;i++){
			if(Test.clientes.get(i).getID().equals(id)== true){
				posicion = i;
				encontrado = true;
			}
		}
		return posicion;
	}
	//retorna la posicnn del cliente con hab en la lista de clientes de test
	public static int buscarClienteHab(int hab){
		int posicion = -1;
		boolean encontrado = false;
		for(int i=0; i<Test.clientes.size() && encontrado == false;i++){
			if(Test.clientes.get(i).getNumHabitacion() == hab){
				posicion = i;
				encontrado = true;
			}
		}
		return posicion;
	}

}


public class BusquedaFuncionario {


	//devuelve la posicinn de la lista donde  esta el funcionario con id
	public static int buscarFuncionario(String id){
		int posicion = -1;
		boolean encontrado = false;
		for(int i=0; i<Test.funcionarios.size() && encontrado == false;i++){
			if(Test.funcionarios.get(i).getID().equals(id)== true){
				posicion = i;
				encontrado = true;
			}
		}
		return posicion;
	}

	//retorna el primer botonoes desocupado
			public static int buscarBotones(){
			int posicion = -1;
			for(int i=0; i<Test.funcionarios.size();i++){
				if(Test.funcionarios.get(i).getCargo().equals("BOTONES")){
					if(Test.funcionarios.get(i).getOcupado() == false ){
						posicion = i;
					}
				}
			}
			return posicion;

		}




		//retorna la posicinn del primer aseador desocupado
		public static int buscarAseador(){
			int posicion = -1;
			for(int i=0; i<Test.funcionarios.size();i++){
				System.out.println(Test.funcionarios.get(i).getCargo());
				if(Test.funcionarios.get(i).getCargo().equals("ASEADOR")){
					if(Test.funcionarios.get(i).getOcupado() == false ){
						posicion = i;
					}
				}
			}
				System.out.println("encontrado: "+posicion);
				return posicion;
		}

		//imprime los funcionarios
		public static void mostrarFuncionarios(){
			for(Funcionario fun: Test.funcionarios){
				System.out.printf("%15s%15s%15s\n",fun.getName(),fun.getID(),fun.getCargo());
			}
		}


		//retorna la posicinn del primer servicio a la habitacinn que este disponible
		public static int buscarServicioHabitacion(){
			int posicion = -1;
			for(int i=0; i<Test.funcionarios.size();i++){
				if(Test.funcionarios.get(i).getCargo().equals("SERVICIO A LA HABITACION")){
					if(Test.funcionarios.get(i).getOcupado() == false ){
						posicion = i;
					}
				}
			}
				return posicion;
		}
}
public class BusquedaHabitacion {
	//devuelve la posicinn de la lista de sencillas donde hay una disponible
	public static int buscarSencillaDisponible(){
		int posicion=-1;
		boolean ocupada = true;
		boolean mantenimiento = true;
		for(int i=0; i<Test.sencillas.size() && ocupada == true && mantenimiento == true; i++){
			if(Test.sencillas.get(i).getMantenimiento() == false){
				if(Test.sencillas.get(i).getOcupado() == false){
					posicion = i;
					ocupada = false;
					mantenimiento = false;
				}
			}
		}
		return posicion;
	}
	//devuelve la posicinn de la lista de dobles donde hay una disponible
	public static int buscarDobleDisponible(){
		int posicion=-1;
		boolean ocupada = true;
		boolean mantenimiento = true;
		for(int i=0; i<Test.dobles.size() && ocupada == true; i++){
			if(Test.dobles.get(i).getMantenimiento() == false){
				if(Test.dobles.get(i).getOcupado() == false){
					posicion = i;
					ocupada = false;
					mantenimiento = false;
				}
			}
		}
		return posicion;
	}
	//devuelve la posicinn de la lista de matrimoniales donde hay una disponible
	public static int buscarMatrimonialDisponible(){
		int posicion=-1;
		boolean ocupada = true;
		boolean mantenimiento = true;
		for(int i=0; i<Test.matrimoniales.size() && ocupada == true; i++){
			if(Test.matrimoniales.get(i).getMantenimiento() == false){
				if(Test.matrimoniales.get(i).getOcupado() == false){
					posicion = i;
					ocupada = false;
					mantenimiento = false;
				}
			}
		}
		return posicion;
	}
	//=
	public static int buscarSuiteDisponible(){
		int posicion=-1;
		boolean ocupada = true;
		boolean mantenimiento = true;
		for(int i=0; i<Test.suites.size() && ocupada == true; i++){
			if(Test.suites.get(i).getMantenimiento() == false){
				if(Test.suites.get(i).getOcupado() == false){
					posicion = i;
					ocupada = false;
					mantenimiento = false;
				}
			}
		}
		return posicion;
	}
	//=
	public static int buscarSuiteJuniorDisponible(){
		int posicion=-1;
		boolean ocupada = true;
		boolean mantenimiento = true;
		for(int i=0; i<Test.suitesJunior.size() && ocupada == true; i++){
			if(Test.suitesJunior.get(i).getMantenimiento() == false){
				if(Test.suitesJunior.get(i).getOcupado() == false){
					posicion = i;
					ocupada = false;
					mantenimiento = false;
				}
			}
		}
		return posicion;
	}
	//=
	public static int buscarSuitePresidencialDisponible(){
		int posicion=-1;
		boolean ocupada = true;
		boolean mantenimiento = true;
		for(int i=0; i<Test.suitesPresidencial.size() && ocupada == true; i++){
			if(Test.suitesPresidencial.get(i).getMantenimiento() == false){
				if(Test.suitesPresidencial.get(i).getOcupado() == false){
					posicion = i;
					ocupada = false;
					mantenimiento = false;
				}
			}
		}
		return posicion;
	}
	//compara el numero de cada habitacinn y retorna la posicinn
	public static int buscarSencillaEspecifica(int hab){
		int posicion=-1;
		boolean encontrada = false;
		for(int i =0; i<Test.sencillas.size()&& encontrada == false;i++){
			if(Test.sencillas.get(i).getNum_Habitacion()==hab){
				posicion = i;
			}

		}
		return posicion;
	}
//=
	public static int buscarDobleEspecifica(int hab){
		int posicion=-1;
		boolean encontrada = false;
		for(int i =0; i<Test.dobles.size()&& encontrada == false;i++){
			if(Test.dobles.get(i).getNum_Habitacion()==hab){
				posicion = i;
			}

		}
		return posicion;
	}
	//=
	public static int buscarMatrimonialEspecifica(int hab){
		int posicion=-1;
		boolean encontrada = false;
		for(int i =0; i<Test.matrimoniales.size()&& encontrada == false;i++){
			if(Test.matrimoniales.get(i).getNum_Habitacion()==hab){
				posicion = i;
			}

		}
		return posicion;
	}
	//=
	public static int buscarSuiteEspecifica(int hab){
		int posicion=-1;
		boolean encontrada = false;
		for(int i =0; i<Test.suites.size()&& encontrada == false;i++){
			if(Test.suites.get(i).getNum_Habitacion()==hab){
				posicion = i;
			}

		}
		return posicion;
	}
	//=
	public static int buscarSuiteJuniorEspecifica(int hab){
		int posicion=-1;
		boolean encontrada = false;
		for(int i =0; i<Test.suitesJunior.size()&& encontrada == false;i++){
			if(Test.suitesJunior.get(i).getNum_Habitacion()==hab){
				posicion = i;
			}

		}
		return posicion;
	}
	//=
	public static int buscarSuitePresidencialEspecifica(int hab){
		int posicion=-1;
		boolean encontrada = false;
		for(int i =0; i<Test.suitesPresidencial.size()&& encontrada == false;i++){
			if(Test.suitesPresidencial.get(i).getNum_Habitacion()==hab){
				posicion = i;
			}

		}
		return posicion;
	}
	//busca entre las suites
	public static int buscarSuiteGeneral(int hab){
		GestionActualizarEstado.actualizarEstado();
		boolean encontrado = false;
		int posicion = -1;
		for(int i=0; i<Test.suiteGeneral.size() && encontrado == false;i++){
			if(Test.suiteGeneral.get(i).getNum_Habitacion() == hab){
				posicion = i;
				encontrado = true;
			}
		}

		return posicion;
	}
	//retorna la poscicinn de de la habitacinn llamando los metodos de arriba
	//la posicinn dentro del arreglo de cada sub clase
	public static int buscarHabitacionNumero(int hab){
		int posicion = -1;
		if(hab>99 && hab<121 ){
			posicion = buscarSencillaEspecifica(hab);
		}
		if(hab>199 && hab<221 ){
			posicion = buscarDobleEspecifica(hab);
		}
		if(hab>299 && hab<321 ){
			posicion = buscarMatrimonialEspecifica(hab);
		}
		if(hab>399 && hab<411 ){
			posicion = buscarSuiteEspecifica(hab);
		}
		if(hab>499 && hab<511 ){
			posicion = buscarSuiteJuniorEspecifica(hab);
		}
		if(hab>599 && hab<605 ){
			posicion = buscarSuitePresidencialEspecifica(hab);
		}

		return posicion;
	}
	//=
	public static int buscarHabitacionGeneral(int hab){
		GestionActualizarEstado.actualizarEstado();
		boolean encontrado = false;
		int posicion = -1;
		for(int i=0; i<Test.habitaciones.size() && encontrado == false;i++){
			if(Test.habitaciones.get(i).getNum_Habitacion() == hab){
				posicion = i;
				encontrado = true;
			}
		}

		return posicion;
	}

}
public class BusquedaReserva {
	//compra cada cliente de las reservas de la lista de reservas con el cliente del Id
	public static int buscarReserva(String id){
		int posicion = -1;
		boolean encontrado = false;
		posicion = BusquedaCliente.buscarClienteID(id);
		for(int i=0;i<Test.reservas.size() && encontrado ==false;i++){
			if(Test.reservas.get(i).getCliente().equals(Test.clientes.get(posicion))){
				posicion = i;
				encontrado = true;
			}

		}

		return posicion;
	}

}

public class Checkin {
	//asigna una habitacion dependiendo la clase de habitacion que se quiera
	//para esto es la variable habitacion, y la posicin es la del cliente .
	public static int AsignarHabitacion(int habitacion,int posicion,int dias){
		int hab = 0;
		if(business.Test.clientes.get(posicion).getActivo() == false){
		int habitacionAsignar;
		//si habitacion es 1 se asigna una sencilla
		if(habitacion == 1){
			habitacionAsignar = BusquedaHabitacion.buscarSencillaDisponible();
			if(habitacionAsignar != -1 ){
				//se cambian los atributos de habitacion de cliente a ocupados y activo
				business.Test.sencillas.get(habitacionAsignar).setOcupado(true);
				business.Test.clientes.get(posicion).setActivo(true);
				//se crea la reserva y se asina hab que lo que retorna el metodo
				hab = business.Test.sencillas.get(habitacionAsignar).getNum_Habitacion();
				Reserva reserva = new Reserva();
				reserva.setCliente(business.Test.clientes.get(posicion));
				reserva.setHabitacion(business.Test.sencillas.get(habitacionAsignar));
				reserva.setDias(dias);
				reserva.setActiva(true);
				Gasto gasto = new Gasto("Habitacion",Test.habitaciones.get(0).getPrecio());
				Factura factura = new Factura();
				factura.setSaldosAdicionales(gasto);
				factura.setDeuda(business.Test.sencillas.get(habitacionAsignar).getPrecio());
				reserva.setFactura(factura);
				business.Test.clientes.get(posicion).setReserva(reserva);
				Test.reservas.add(reserva);
			}else{
				hab = -2;
			}
		}
		//=
		if(habitacion == 2){
			habitacionAsignar = BusquedaHabitacion.buscarDobleDisponible();
			if(habitacionAsignar != -1 ){
				business.Test.dobles.get(habitacionAsignar).setOcupado(true);
				System.out.println("La habitacion registrada es: "+business.Test.dobles.get(habitacionAsignar).getNum_Habitacion());
				business.Test.clientes.get(posicion).setActivo(true);
				hab = business.Test.dobles.get(habitacionAsignar).getNum_Habitacion();
				Reserva reserva = new Reserva();
				reserva.setCliente(business.Test.clientes.get(posicion));
				reserva.setHabitacion(business.Test.dobles.get(habitacionAsignar));
				reserva.setDias(dias);
				reserva.setActiva(true);
				Gasto gasto = new Gasto("Habitacion",Test.habitaciones.get(22).getPrecio());
				Factura factura = new Factura();
				factura.setSaldosAdicionales(gasto);
				factura.setDeuda(business.Test.dobles.get(habitacionAsignar).getPrecio());
				reserva.setFactura(factura);
				business.Test.clientes.get(posicion).setReserva(reserva);
				Test.reservas.add(reserva);
			}else{
				hab = -2;
			}

		}
		//=
		if(habitacion == 3){
			habitacionAsignar = BusquedaHabitacion.buscarMatrimonialDisponible();
			if(habitacionAsignar != -1 ){
				business.Test.matrimoniales.get(habitacionAsignar).setOcupado(true);
				business.Test.clientes.get(posicion).setActivo(true);
				hab = business.Test.matrimoniales.get(habitacionAsignar).getNum_Habitacion();
				Reserva reserva = new Reserva();
				reserva.setCliente(business.Test.clientes.get(posicion));
				reserva.setHabitacion(business.Test.matrimoniales.get(habitacionAsignar));
				reserva.setDias(dias);
				reserva.setActiva(true);
				Gasto gasto = new Gasto("Habitacion",Test.habitaciones.get(52).getPrecio());
				Factura factura = new Factura();
				factura.setSaldosAdicionales(gasto);
				factura.setDeuda(business.Test.matrimoniales.get(habitacionAsignar).getPrecio());
				reserva.setFactura(factura);
				business.Test.clientes.get(posicion).setReserva(reserva);
				Test.reservas.add(reserva);
			}else{
				hab = -2;
			}

		}
		//=
		if(habitacion == 4){
			habitacionAsignar = BusquedaHabitacion.buscarSuiteDisponible();
			if(habitacionAsignar != -1 ){
				business.Test.suites.get(habitacionAsignar).setOcupado(true);
				business.Test.clientes.get(posicion).setActivo(true);
				hab = business.Test.suites.get(habitacionAsignar).getNum_Habitacion();
				Reserva reserva = new Reserva();
				reserva.setCliente(business.Test.clientes.get(posicion));
				reserva.setHabitacion(business.Test.suites.get(habitacionAsignar));
				reserva.setDias(dias);
				reserva.setActiva(true);
				Gasto gasto = new Gasto("Habitacion",Test.habitaciones.get(62).getPrecio());
				Factura factura = new Factura();
				factura.setSaldosAdicionales(gasto);
				factura.setDeuda(business.Test.suites.get(habitacionAsignar).getPrecio());
				reserva.setFactura(factura);
				business.Test.clientes.get(posicion).setReserva(reserva);
				Test.reservas.add(reserva);
			}else{
				hab = -2;
			}

		}
		//=
		if(habitacion == 5){
			habitacionAsignar = BusquedaHabitacion.buscarSuiteJuniorDisponible();
			if(habitacionAsignar != -1 ){
				business.Test.suitesJunior.get(habitacionAsignar).setOcupado(true);
				business.Test.clientes.get(posicion).setActivo(true);
				hab = business.Test.suitesJunior.get(habitacionAsignar).getNum_Habitacion();
				Reserva reserva = new Reserva();
				reserva.setCliente(business.Test.clientes.get(posicion));
				reserva.setHabitacion(business.Test.suitesJunior.get(habitacionAsignar));
				reserva.setDias(dias);
				reserva.setActiva(true);
				Gasto gasto = new Gasto("Habitacion",Test.habitaciones.get(72).getPrecio());
				Factura factura = new Factura();
				factura.setSaldosAdicionales(gasto);
				factura.setDeuda(business.Test.suitesJunior.get(habitacionAsignar).getPrecio());
				reserva.setFactura(factura);
				business.Test.clientes.get(posicion).setReserva(reserva);
				Test.reservas.add(reserva);
			}else{
				hab = -2;
			}

		}
		//=
		if(habitacion == 6){
			habitacionAsignar = BusquedaHabitacion.buscarSuitePresidencialDisponible();
			if(habitacionAsignar != -1 ){
				business.Test.suitesPresidencial.get(habitacionAsignar).setOcupado(true);
				business.Test.clientes.get(posicion).setActivo(true);
				hab = business.Test.suitesPresidencial.get(habitacionAsignar).getNum_Habitacion();
				Reserva reserva = new Reserva();
				reserva.setCliente(business.Test.clientes.get(posicion));
				reserva.setHabitacion(business.Test.suitesPresidencial.get(habitacionAsignar));
				reserva.setDias(dias);
				reserva.setActiva(true);
				Gasto gasto = new Gasto("Habitacion",Test.habitaciones.get(82).getPrecio());
				Factura factura = new Factura();
				factura.setSaldosAdicionales(gasto);
				factura.setDeuda(business.Test.suitesPresidencial.get(habitacionAsignar).getPrecio());
				reserva.setFactura(factura);
				business.Test.clientes.get(posicion).setReserva(reserva);
				Test.reservas.add(reserva);
			}else{
				hab = -2;
			}

		}

		}else{
			hab = -1;
		}

		return hab;//si se retorna -1 el cliente ya esta activo, si se retorna -2 no hay habi disponibles
	}
	//= pero no retorna, el parametro habitacinn es el numero de habitacion que se quiere
	public static void AsignarHabitacionCarga(int habitacion,int posicion,int dias){
		int hab = 0;

		int buscarPosicion;
		int habitacionAsignar;
		buscarPosicion = BusquedaHabitacion.buscarHabitacionGeneral(habitacion);
		if(buscarPosicion>-1 && buscarPosicion<20){
			habitacionAsignar = buscarPosicion;
			if(habitacionAsignar != -1 ){
				business.Test.sencillas.get(habitacionAsignar).setOcupado(true);
				business.Test.clientes.get(posicion).setActivo(true);
				hab = business.Test.sencillas.get(habitacionAsignar).getNum_Habitacion();
				Reserva reserva = new Reserva();
				reserva.setCliente(business.Test.clientes.get(posicion));
				reserva.setHabitacion(business.Test.sencillas.get(habitacionAsignar));
				reserva.setDias(dias);
				reserva.setActiva(true);
				Gasto gasto = new Gasto("Habitacion",Test.habitaciones.get(0).getPrecio());
				Factura factura = new Factura();
				factura.setSaldosAdicionales(gasto);
				factura.setDeuda(business.Test.sencillas.get(habitacionAsignar).getPrecio());


				reserva.setFactura(factura);
				business.Test.clientes.get(posicion).setReserva(reserva);
				Test.reservas.add(reserva);
			}else{
				hab = -2;
			}
		}

		if(buscarPosicion>19 && buscarPosicion<40){

			habitacionAsignar = buscarPosicion-20;
			if(habitacionAsignar != -1 ){
				business.Test.dobles.get(habitacionAsignar).setOcupado(true);
				System.out.println("La habitacion registrada es: "+business.Test.dobles.get(habitacionAsignar).getNum_Habitacion());
				business.Test.clientes.get(posicion).setActivo(true);
				hab = business.Test.dobles.get(habitacionAsignar).getNum_Habitacion();
				Reserva reserva = new Reserva();
				reserva.setCliente(business.Test.clientes.get(posicion));
				reserva.setHabitacion(business.Test.dobles.get(habitacionAsignar));
				reserva.setDias(dias);
				reserva.setActiva(true);
				Gasto gasto = new Gasto("Habitacion",Test.habitaciones.get(22).getPrecio());
				Factura factura = new Factura();
				factura.setSaldosAdicionales(gasto);
				factura.setDeuda(business.Test.dobles.get(habitacionAsignar).getPrecio());
				reserva.setFactura(factura);
				business.Test.clientes.get(posicion).setReserva(reserva);
				Test.reservas.add(reserva);
			}else{
				hab = -2;
			}

		}
		if(buscarPosicion>39 && buscarPosicion<60){

			habitacionAsignar = buscarPosicion-40;
			if(habitacionAsignar != -1 ){
				business.Test.matrimoniales.get(habitacionAsignar).setOcupado(true);
				business.Test.clientes.get(posicion).setActivo(true);
				hab = business.Test.matrimoniales.get(habitacionAsignar).getNum_Habitacion();
				Reserva reserva = new Reserva();
				reserva.setCliente(business.Test.clientes.get(posicion));
				reserva.setHabitacion(business.Test.matrimoniales.get(habitacionAsignar));
				reserva.setDias(dias);
				reserva.setActiva(true);
				Gasto gasto = new Gasto("Habitacion",Test.habitaciones.get(42).getPrecio());
				Factura factura = new Factura();
				factura.setSaldosAdicionales(gasto);
				factura.setDeuda(business.Test.matrimoniales.get(habitacionAsignar).getPrecio());
				reserva.setFactura(factura);
				business.Test.clientes.get(posicion).setReserva(reserva);
				Test.reservas.add(reserva);
			}else{
				hab = -2;
			}

		}
		if(buscarPosicion>59 && buscarPosicion<70){

			habitacionAsignar = buscarPosicion-60;
			if(habitacionAsignar != -1 ){
				business.Test.suites.get(habitacionAsignar).setOcupado(true);
				business.Test.clientes.get(posicion).setActivo(true);
				hab = business.Test.suites.get(habitacionAsignar).getNum_Habitacion();
				Reserva reserva = new Reserva();
				reserva.setCliente(business.Test.clientes.get(posicion));
				reserva.setHabitacion(business.Test.suites.get(habitacionAsignar));
				reserva.setDias(dias);
				reserva.setActiva(true);
				Gasto gasto = new Gasto("Habitacion",Test.habitaciones.get(62).getPrecio());
				Factura factura = new Factura();
				factura.setSaldosAdicionales(gasto);
				factura.setDeuda(business.Test.suites.get(habitacionAsignar).getPrecio());
				reserva.setFactura(factura);
				business.Test.clientes.get(posicion).setReserva(reserva);
				Test.reservas.add(reserva);
			}else{
				hab = -2;
			}

		}
		if(buscarPosicion>69 && buscarPosicion<80){
			habitacionAsignar = buscarPosicion-70;
			if(habitacionAsignar != -1 ){
				business.Test.suitesJunior.get(habitacionAsignar).setOcupado(true);
				business.Test.clientes.get(posicion).setActivo(true);
				hab = business.Test.suitesJunior.get(habitacionAsignar).getNum_Habitacion();
				Reserva reserva = new Reserva();
				reserva.setCliente(business.Test.clientes.get(posicion));
				reserva.setHabitacion(business.Test.suitesJunior.get(habitacionAsignar));
				reserva.setDias(dias);
				reserva.setActiva(true);
				Gasto gasto = new Gasto("Habitacion",Test.habitaciones.get(72).getPrecio());
				Factura factura = new Factura();
				factura.setSaldosAdicionales(gasto);
				factura.setDeuda(business.Test.suitesJunior.get(habitacionAsignar).getPrecio());
				reserva.setFactura(factura);
				business.Test.clientes.get(posicion).setReserva(reserva);
				Test.reservas.add(reserva);
			}else{
				hab = -2;
			}

		}
		if(buscarPosicion>79 && buscarPosicion<85){

			habitacionAsignar = buscarPosicion-80;
			if(habitacionAsignar != -1 ){
				business.Test.suitesPresidencial.get(habitacionAsignar).setOcupado(true);
				business.Test.clientes.get(posicion).setActivo(true);
				hab = business.Test.suitesPresidencial.get(habitacionAsignar).getNum_Habitacion();
				Reserva reserva = new Reserva();
				reserva.setCliente(business.Test.clientes.get(posicion));
				reserva.setHabitacion(business.Test.suitesPresidencial.get(habitacionAsignar));
				reserva.setDias(dias);
				reserva.setActiva(true);
				Gasto gasto = new Gasto("Habitacion",Test.habitaciones.get(82).getPrecio());
				Factura factura = new Factura();
				factura.setSaldosAdicionales(gasto);
				factura.setDeuda(business.Test.suitesPresidencial.get(habitacionAsignar).getPrecio());
				reserva.setFactura(factura);
				business.Test.clientes.get(posicion).setReserva(reserva);
				Test.reservas.add(reserva);
			}else{
				hab = -2;
			}

		}


	}

}
public class Checkout {


	public static int checkout(String id){
		//busca los pagos adicionales y los suma a la deuda actualizandoala en la reserva
		int posicion;
		posicion = business.BusquedaCliente.buscarClienteID(id);
		int pagoFinal= 0;
		int pagoAdicional= 0;
		if(posicion != -1){
				pagoAdicional = revisarHabitacion(posicion);
				ui.AsistenteCheckOut.saldoAdicional(pagoAdicional);
				Test.reservas.get(business.BusquedaReserva.buscarReserva(id)).setDeuda(pagoAdicional);
				pagoFinal = Test.reservas.get(business.BusquedaReserva.buscarReserva(id)).getDeuda();

		}
		return pagoFinal;
	}
	//cambia los atributos de cliente cuanto este sale del hotel
	public static void checkoutSimulacion(String id){
		int posicion;
		posicion = business.BusquedaCliente.buscarClienteID(id);
		int pagoFinal= 0;
		int pagoAdicional= 0;
		if(posicion != -1){
				pagoAdicional = revisarHabitacion(posicion);
				Test.reservas.get(business.BusquedaReserva.buscarReserva(id)).setDeuda(pagoAdicional);
				pagoFinal = Test.reservas.get(business.BusquedaReserva.buscarReserva(id)).getDeuda();
				Test.clientes.get(posicion).getFactura().setDiaCheckout(Test.diaGeneral);
				Test.clientes.get(posicion).getReserva().getHabitacion().setLimpio(true);
				Test.clientes.get(posicion).getReserva().getHabitacion().setPedido(null);
				Test.clientes.get(posicion).getReserva().getHabitacion().setServicioHabitacion(false);
				business.Test.clientes.get(posicion).setActivo(false);
				Test.clientes.get(posicion).getReserva().setActiva(false);
				int habitacion;
				habitacion = business.Test.clientes.get(posicion).getNumHabitacion();
				business.Checkout.CheckoutHabitacion(habitacion);
				Test.clientes.get(business.BusquedaCliente.buscarClienteID(id)).setReserva(null);

		}
	}


//determina que checkout se realiza
	public static void CheckoutHabitacion(int numero){

		if(numero>99 && numero<121){
			checkoutSencilla(numero);
		}
		if(numero>199 && numero<221){
			checkoutDoble(numero);
		}
		if(numero>299 && numero<321){
			checkoutMatrimonial(numero);
		}
		if(numero>399 && numero<411){
			checkoutSuite(numero);
		}
		if(numero>499 && numero<511){
			checkoutSuiteJunior(numero);
		}
		if(numero>599 && numero<605){
			checkoutSuitePresidencial(numero);
		}
	}


	//cambia el estado de la habitaciona a falso
	public static void checkoutSencilla(int numero){
		int posicion = -1;
		for(int i=0; i<Test.sencillas.size();i++){
			if(Test.sencillas.get(i).getNum_Habitacion() == numero){
				posicion = i;
			}
		}
		Test.sencillas.get(posicion).setOcupado(false);

	}
	//=
	public static void checkoutDoble(int numero){
		int posicion = -1;
		for(int i=0; i<Test.dobles.size();i++){
			if(Test.dobles.get(i).getNum_Habitacion() == numero){
				posicion = i;
			}
		}
		Test.dobles.get(posicion).setOcupado(false);
	}
	//=
	public static void checkoutMatrimonial(int numero){
		int posicion = -1;
		for(int i=0; i<Test.matrimoniales.size();i++){
			if(Test.matrimoniales.get(i).getNum_Habitacion() == numero){
				posicion = i;
			}
		}
		Test.matrimoniales.get(posicion).setOcupado(false);
	}
	//=
	public static void checkoutSuite(int numero){
		int posicion = -1;
		for(int i=0; i<Test.suites.size();i++){
			if(Test.suites.get(i).getNum_Habitacion() == numero){
				posicion = i;
			}
		}
		Test.suites.get(posicion).setOcupado(false);
	}
	//=
	public static void checkoutSuiteJunior(int numero){
		System.out.println("Excelente!");
		int posicion = -1;
		for(int i=0; i<Test.suitesJunior.size();i++){
			if(Test.suitesJunior.get(i).getNum_Habitacion() == numero){
				posicion = i;
			}
		}
		Test.suitesJunior.get(posicion).setOcupado(false);
	}
	//=
	public static void checkoutSuitePresidencial(int numero){
		int posicion = -1;
		for(int i=0; i<Test.suitesPresidencial.size();i++){
			if(Test.suitesPresidencial.get(i).getNum_Habitacion() == numero){
				posicion = i;
			}
		}
		Test.suitesPresidencial.get(posicion).setOcupado(false);
	}


	public static int revisarHabitacion(int posicion){
		int habitacion = Test.clientes.get(posicion).getNumHabitacion();
		int posicion2 = -1;
		int pagoAdicional = 0;
		if(habitacion>99 && habitacion<121){
			int televisor = 1;
			int telefono = 1;
			int minibarBebidas = 5;

			for(int i=0;i<Test.sencillas.size();i++){
				if(Test.sencillas.get(i).getNum_Habitacion()==habitacion){
					posicion2 = i;
				}
			}
			int televisorFaltante;
			int telefonoFaltante;
			int bebidasFaltantes;
			//revisa si lo que hay en la habitacinn es lo que originalmente estaba
			bebidasFaltantes = minibarBebidas-(Test.sencillas.get(posicion2).getBebidas());
			televisorFaltante = televisor-Test.sencillas.get(posicion2).getCantidadTelevisor();
			//System.out.println("Tele fal: "+televisorFaltante);
			pagoAdicional = ((televisorFaltante*400)+(bebidasFaltantes*5));
			//System.out.println("Bebidas faltantes: "+bebidasFaltantes);
			Test.sencillas.get(posicion2).setBebidas(bebidasFaltantes);
			Test.sencillas.get(posicion2).setTelevisor(televisorFaltante);
			if(pagoAdicional!=0){
			//genera un nuevo cobro por hurto
			Gasto cobro = new Gasto("Hurto",pagoAdicional);
			Test.clientes.get(BusquedaCliente.buscarClienteHab(habitacion)).getFactura().setSaldosAdicionales(cobro);
			}


		}
		if(habitacion>199 && habitacion<221){
			int televisor = 1;
			int telefono = 1;
			int minibarBebidas = 5;

			for(int i=0;i<Test.dobles.size();i++){
				if(Test.dobles.get(i).getNum_Habitacion()==habitacion){
					posicion2 = i;
				}
			}
			int televisorFaltante;
			int telefonoFaltante;
			int bebidasFaltantes;
			bebidasFaltantes = minibarBebidas-Test.dobles.get(posicion2).getBebidas();
			televisorFaltante = televisor-Test.dobles.get(posicion2).getCantidadTelevisor();
			System.out.println("Tele fal: "+televisorFaltante);
			pagoAdicional = ((televisorFaltante*550)+(bebidasFaltantes*7));
			Test.dobles.get(posicion2).setBebidas(bebidasFaltantes);
			Test.dobles.get(posicion2).setTelevisor(televisorFaltante);
			if(pagoAdicional!=0){
			Gasto cobro = new Gasto("Hurto",pagoAdicional);
			Test.clientes.get(BusquedaCliente.buscarClienteHab(habitacion)).getFactura().setSaldosAdicionales(cobro);
			}


		}
		if(habitacion>299 && habitacion<321){
			int televisor = 1;
			int telefono = 1;
			int minibarBebidas = 5;

			for(int i=0;i<Test.matrimoniales.size();i++){
				if(Test.matrimoniales.get(i).getNum_Habitacion()==habitacion){
					posicion2 = i;
				}
			}
			int televisorFaltante;
			int bebidasFaltantes;
			bebidasFaltantes = minibarBebidas-Test.matrimoniales.get(posicion2).getBebidas();
			televisorFaltante = televisor-Test.matrimoniales.get(posicion2).getCantidadTelevisor();
			System.out.println("Tele fal: "+televisorFaltante);
			pagoAdicional = ((televisorFaltante*550)+(bebidasFaltantes*7));
			Test.matrimoniales.get(posicion2).setBebidas(bebidasFaltantes);
			Test.matrimoniales.get(posicion2).setTelevisor(televisorFaltante);
			if(pagoAdicional!=0){
			Gasto cobro = new Gasto("Hurto",pagoAdicional);
			Test.clientes.get(BusquedaCliente.buscarClienteHab(habitacion)).getFactura().setSaldosAdicionales(cobro);
			}

		}

		if(habitacion>399 && habitacion<411){
			int televisor = 1;
			int telefono = 1;
			int minibarBebidas = 5;
			int cuadros = 1;

			for(int i=0;i<Test.suites.size();i++){
				if(Test.suites.get(i).getNum_Habitacion()==habitacion){
					posicion2 = i;
				}
			}
			int televisorFaltante;
			int bebidasFaltantes;
			int cuadrosFaltantes;
			bebidasFaltantes = minibarBebidas-Test.suites.get(posicion2).getBebidas();
			televisorFaltante = televisor-Test.suites.get(posicion2).getCantidadTelevisor();
			cuadrosFaltantes = cuadros-Test.suites.get(posicion2).getCuadros();
			System.out.println("Tele fal: "+televisorFaltante);
			System.out.println("cuad fal: "+cuadrosFaltantes);
			System.out.println("Bebidas fal: "+bebidasFaltantes);
			pagoAdicional = ((televisorFaltante*700)+(bebidasFaltantes*7)
					+(cuadrosFaltantes*Test.suites.get(posicion2).getCuadrosPrecios()));
			Test.suites.get(posicion2).setBebidas(bebidasFaltantes);
			Test.suites.get(posicion2).setTelevisor(televisorFaltante);
			Test.suites.get(posicion2).setCuadros(cuadrosFaltantes);
			if(pagoAdicional!=0){
			Gasto cobro = new Gasto("Hurto",pagoAdicional);
			Test.clientes.get(BusquedaCliente.buscarClienteHab(habitacion)).getFactura().setSaldosAdicionales(cobro);
			}
		}
		if(habitacion>499 && habitacion<511){
			int televisor = 2;
			int telefono = 2;
			int minibarBebidas = 10;
			int cuadros = 2;

			for(int i=0;i<Test.suitesJunior.size();i++){
				if(Test.suitesJunior.get(i).getNum_Habitacion()==habitacion){
					posicion2 = i;
				}
			}
			int televisorFaltante;
			int bebidasFaltantes;
			int cuadrosFaltantes;
			bebidasFaltantes = minibarBebidas-(2*Test.suitesJunior.get(posicion2).getBebidas());
			televisorFaltante = televisor-Test.suitesJunior.get(posicion2).getCantidadTelevisor();
			cuadrosFaltantes = cuadros-Test.suitesJunior.get(posicion2).getCuadros();
			System.out.println("Tele fal: "+televisorFaltante);
			System.out.println("cuad fal: "+cuadrosFaltantes);
			System.out.println("Bebidas fal: "+bebidasFaltantes);
			pagoAdicional = ((televisorFaltante*750)+(bebidasFaltantes*10)
					+(cuadrosFaltantes*Test.suitesJunior.get(posicion2).getCuadrosPrecios()));
			Test.suitesJunior.get(posicion2).setBebidas(bebidasFaltantes);
			Test.suitesJunior.get(posicion2).setTelevisor(televisorFaltante);
			Test.suitesJunior.get(posicion2).setCuadros(cuadrosFaltantes);
			if(pagoAdicional!=0){
			Gasto cobro = new Gasto("Hurto",pagoAdicional);
			Test.clientes.get(BusquedaCliente.buscarClienteHab(habitacion)).getFactura().setSaldosAdicionales(cobro);
			}
		}
		if(habitacion>599 && habitacion<605){
			int televisor = 3;
			int telefono = 3;
			int minibarBebidas = 5;
			int cuadros = 2;

			for(int i=0;i<Test.suitesPresidencial.size();i++){
				if(Test.suitesPresidencial.get(i).getNum_Habitacion()==habitacion){
					posicion2 = i;
				}
			}
			int televisorFaltante;
			int bebidasFaltantes;
			int cuadrosFaltantes;
			bebidasFaltantes = minibarBebidas-Test.suitesPresidencial.get(posicion2).getBebidas();
			televisorFaltante = televisor-Test.suitesPresidencial.get(posicion2).getCantidadTelevisor();
			cuadrosFaltantes = cuadros-Test.suitesPresidencial.get(posicion2).getCuadros();

			System.out.println("Tele fal: "+televisorFaltante);
			System.out.println("cuad fal: "+cuadrosFaltantes);
			System.out.println("Bebidas fal: "+bebidasFaltantes);
			pagoAdicional = ((televisorFaltante*800)+(bebidasFaltantes*12)
					+(cuadrosFaltantes*Test.suitesPresidencial.get(posicion2).getCuadrosPrecios()));
			Test.suitesPresidencial.get(posicion2).setBebidas(bebidasFaltantes);
			Test.suitesPresidencial.get(posicion2).setTelevisor(televisorFaltante);
			Test.suitesPresidencial.get(posicion2).setCuadros(cuadrosFaltantes);
			if(pagoAdicional!=0){
			Gasto cobro = new Gasto("Hurto",pagoAdicional);
			Test.clientes.get(BusquedaCliente.buscarClienteHab(habitacion)).getFactura().setSaldosAdicionales(cobro);
			}

		}
		return pagoAdicional;
	}

}

public class CreacionCliente {
	//anade un cliente a la lista de clientes
	public static void crearCliente(String nombre, int edad, String identificacion){
		boolean encontrado = false;
		encontrado = BusquedaCliente.verificarID(identificacion);
		if(encontrado == false){
		Cliente temporal = new Cliente(nombre, edad, identificacion);
		business.Test.clientes.add(temporal);
		} else {
			ui.AsistenteCreacionCliente.error();
		}
	}
	//elimina un cliente
	public static void eliminarCliente(int posicion){
		Test.clientes.remove(posicion);
	}

}
public class CreacionFuncionario {
	public static void crearBotones(String nombre, int edad,String identificacion){
		Funcionario temporal = new Botones(nombre, edad, identificacion);
		Test.funcionarios.add(temporal);
	}

	public static void crearAseador(String nombre, int edad,String identificacion){
		Funcionario temporal = new Aseador(nombre, edad, identificacion);
		Test.funcionarios.add(temporal);
	}

	public static void crearMesero(String nombre, int edad,String identificacion){
		Funcionario temporal = new Mesero(nombre, edad, identificacion);
		Test.funcionarios.add(temporal);
	}

	public static void eliminarFuncionario(int posicion){
		Test.funcionarios.remove(posicion);
	}
}
public class CreacionHabitaciones {

	public static void crearHabitaciones(){

	//crea objetos y los asigna a las habitaciones de cada tipo
		for(int i= 100; i<120;i++){
			ArrayList<data.Cama> camasSencilla = new ArrayList<data.Cama>();
			Cama_sencilla cama = new Cama_sencilla();
			camasSencilla.add(cama);

			ArrayList<data.Televisor> televisores = new ArrayList<data.Televisor>();
			for(int a=0;a<1;a++){
				Televisor temporal = new Televisor("Sony");
				temporal.setPulgadas(21);
				televisores.add(temporal);
			}

			ArrayList<data.Minibar> minibar = new ArrayList<data.Minibar>();
			for(int c=0;c<1;c++){
				Minibar temporal = new Minibar(5);
				minibar.add(temporal);
			}

			Sencilla temporal = new Sencilla(1,minibar,televisores,camasSencilla,150,i,false);
			Test.sencillas.add(temporal);
		}



		for(int i= 200; i<220;i++){
			ArrayList<data.Cama> camasDoble = new ArrayList<data.Cama>();

			for(int a=0;a<2;a++){
				Cama_sencilla temp = new Cama_sencilla();
				camasDoble.add(temp);
				}
			for(int b=0;b<1;b++){
				Cama_doble temp = new Cama_doble();
				camasDoble.add(temp);
				}

			ArrayList<data.Televisor> televisores = new ArrayList<data.Televisor>();
			for(int a=0;a<1;a++){
				Televisor temporal = new Televisor("Sony");
				temporal.setPulgadas(32);
				televisores.add(temporal);
			}

			ArrayList<data.Minibar> minibar = new ArrayList<data.Minibar>();
			for(int c=0;c<1;c++){
				Minibar temporal = new Minibar(5);
				minibar.add(temporal);
			}

			Doble temporal = new Doble(2,minibar,televisores,camasDoble,220,i,false);
			Test.dobles.add(temporal);
		}




		for(int i= 300; i<320;i++){

			ArrayList<data.Cama> camasMatrimonial = new ArrayList<data.Cama>();
				Cama_doble temp = new Cama_doble();
				camasMatrimonial.add(temp);

				ArrayList<data.Televisor> televisores = new ArrayList<data.Televisor>();
				for(int a=0;a<1;a++){
					Televisor temporal = new Televisor("Sony");
					temporal.setPulgadas(32);
					televisores.add(temporal);
				}

				ArrayList<data.Minibar> minibar = new ArrayList<data.Minibar>();
				for(int c=0;c<1;c++){
					Minibar temporal = new Minibar(5);
					minibar.add(temporal);
				}

			Matrimonial temporal = new Matrimonial(1,minibar,televisores,camasMatrimonial,250,i,false);
			Test.matrimoniales.add(temporal);
		}




		for(int i= 400; i<410;i++){
			ArrayList<data.Cama> camasSuiteSencilla = new ArrayList<data.Cama>();

			for(int a=0;a<1;a++){
				Cama_queen temp = new Cama_queen();
				camasSuiteSencilla.add(temp);
				}

			ArrayList<data.Televisor> televisores = new ArrayList<data.Televisor>();
			for(int a=0;a<1;a++){
				Televisor temporal = new Televisor("Sony");
				temporal.setPulgadas(40);
				televisores.add(temporal);
			}

			ArrayList<data.Minibar> minibar = new ArrayList<data.Minibar>();
			for(int c=0;c<1;c++){
				Minibar temporal = new Minibar(5);
				minibar.add(temporal);
			}

			ArrayList<Cuadro> cuadros = new ArrayList<Cuadro>();
 			for(int d= 0;d<1;d++){
				Cuadro temporal = new Cuadro();
				temporal.setPrecio(10000);
				cuadros.add(temporal);
			}
			Cocina cocina= new Cocina(1,1,1);


			SuiteSencilla temporal = new SuiteSencilla(1,minibar,televisores,camasSuiteSencilla,400,cocina,
					cuadros,i,false,1);
			Test.suites.add(temporal);
		}



		for(int i= 500; i<510;i++){
			ArrayList<data.Cama> camasSuiteJunior = new ArrayList<data.Cama>();

			for(int a=0;a<1;a++){
				Cama_queen temp = new Cama_queen();
				camasSuiteJunior.add(temp);
				}
			for(int b=0;b<2;b++){
				Cama_doble temp = new Cama_doble();
				camasSuiteJunior.add(temp);
				}

			ArrayList<data.Televisor> televisores = new ArrayList<data.Televisor>();

			for(int a=0;a<2;a++){
				Televisor temporal = new Televisor("Sony");
				temporal.setPulgadas(40);
				televisores.add(temporal);
			}

			ArrayList<data.Minibar> minibar = new ArrayList<data.Minibar>();
			for(int c=0;c<2;c++){
				Minibar temporal = new Minibar(5);
				minibar.add(temporal);
			}

			ArrayList<Cuadro> cuadros = new ArrayList<Cuadro>();
 			for(int d= 0;d<2;d++){
				Cuadro temporal = new Cuadro();
				temporal.setPrecio(12000);
				cuadros.add(temporal);
			}
 			Cocina cocina= new Cocina(1,1,1);


			SuiteJunior temporal = new SuiteJunior(2,minibar,televisores,camasSuiteJunior,500,cocina,
					2,cuadros,i,false);
			Test.suitesJunior.add(temporal);
		}




		for(int i= 600; i<605;i++){
			ArrayList<data.Cama> camasSuitePresidencial = new ArrayList<data.Cama>();

			for(int a=0;a<1;a++){
				Cama_king temp = new Cama_king();
				camasSuitePresidencial.add(temp);
				}
			for(int b=0;b<2;b++){
				Cama_doble temp = new Cama_doble();
				camasSuitePresidencial.add(temp);
				}
			ArrayList<data.Televisor> televisores = new ArrayList<data.Televisor>();
			for(int a=0;a<3;a++){
				Televisor temporal = new Televisor("Sony");
				temporal.setPulgadas(50);
				televisores.add(temporal);
			}

			ArrayList<data.Minibar> minibar = new ArrayList<data.Minibar>();
			for(int c=0;c<2;c++){
				Minibar temporal = new Minibar(5);
				minibar.add(temporal);
			}

			ArrayList<Cuadro> cuadros = new ArrayList<Cuadro>();
 			for(int d= 0;d<2;d++){
				Cuadro temporal = new Cuadro();
				temporal.setPrecio(12000);
				cuadros.add(temporal);
			}

 			Cocina cocina= new Cocina(1,1,1);

			SuitePresidencial temporal = new SuitePresidencial(3,minibar,televisores,camasSuitePresidencial,750,cocina
					,3,cuadros,i,false);
			Test.suitesPresidencial.add(temporal);
		}



	}

}
public class GestionActualizacionCliente {
	//guarda los datos de los clientes en diferentes archivos .txt
	public static void modificar() throws IOException{


		FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter("C:\\hotel\\Nom_Clientes.txt");
            pw = new PrintWriter(fichero);

            for (int i = 0; i < Test.clientes.size(); i++){
            	if(i!=0){
            	pw.println();
            	}
            	pw.print(Test.clientes.get(i).getName());
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {

           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }


        try
        {
            fichero = new FileWriter("C:\\hotel\\Doc_Clientes.txt");
            pw = new PrintWriter(fichero);

            for (int i = 0; i < Test.clientes.size(); i++){
            	if(i!=0){
            	pw.println();
            	}
            	pw.print(Test.clientes.get(i).getID());
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {

           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }


        try
        {
            fichero = new FileWriter("C:\\hotel\\Edad_Clientes.txt");
            pw = new PrintWriter(fichero);

            for (int i = 0; i < Test.clientes.size(); i++){
            	if(i!=0){
            	pw.println();
            	}
            	pw.print(Test.clientes.get(i).getEdad());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {

           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }

        try
        {
            fichero = new FileWriter("C:\\hotel\\Hab_Clientes.txt");
            pw = new PrintWriter(fichero);

            for (int i = 0; i < Test.clientes.size(); i++){
            	if(i!=0){
            	pw.println();
            	}
            	pw.print(Test.clientes.get(i).getNumHabitacion());
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {

           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }

        try
        {
            fichero = new FileWriter("C:\\hotel\\Deuda_Clientes.txt");
            pw = new PrintWriter(fichero);

            for (int i = 0; i < Test.clientes.size(); i++){
            	if(i!=0){
            	pw.println();
            	}
            	if(Test.clientes.get(i).getReserva()!=null){
            	pw.print(Test.clientes.get(i).getFactura().getDeuda());
            	}else{
            		pw.print(0);
            	}
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {

           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }

        try
        {
            fichero = new FileWriter("C:\\hotel\\Res_Clientes.txt");
            pw = new PrintWriter(fichero);

            for (int i = 0; i < Test.clientes.size(); i++){
            	if(i!=0){
            	pw.println();
            	}
            	if(Test.clientes.get(i).getReserva()!= null){
            	pw.print(Test.clientes.get(i).getReserva().getDias());
            	}else{
            		pw.print(0);
            	}
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {

           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
	}
}
public class GestionActualizarEstado {

	public static void actualizarEstado(){
		//borra las listas
		Test.habitaciones.clear();
		Test.suiteGeneral.clear();
		//recorre las listas y va guardandolas en habitaciones y/o suiteG
		for(Sencilla sen : Test.sencillas){
			Sencilla temp = sen;
			Test.habitaciones.add(temp);
		}

		for(Doble dob : Test.dobles){
			Doble temp = dob;
			Test.habitaciones.add(temp);
		}

		for(Matrimonial mat : Test.matrimoniales){
			Matrimonial temp = mat;
			Test.habitaciones.add(temp);
		}

		for(SuiteSencilla sui : Test.suites){
			SuiteSencilla temp = sui;
			Test.habitaciones.add(temp);
			Test.suiteGeneral.add(temp);
		}

		for(SuiteJunior suij : Test.suitesJunior){
			SuiteJunior temp = suij;
			Test.habitaciones.add(temp);
			Test.suiteGeneral.add(temp);
		}

		for(SuitePresidencial suip : Test.suitesPresidencial){
			SuitePresidencial temp = suip;
			Test.habitaciones.add(temp);
			Test.suiteGeneral.add(temp);
		}

	}
}
public class GestionActualizarInformacion{


		public static void actualizarFacturas(){
			AsistenteFacturas a = new AsistenteFacturas();
			a.setVisible(true);
			a.setResizable(false);
			a.setLocationRelativeTo(null);

		}


		public static void actualizarEstado(){
			EstadoHabitaciones a = new EstadoHabitaciones();
			a.setVisible(true);
			a.setResizable(false);
			a.setLocationRelativeTo(null);

		}

		public static void actualizarAseo(){
			AsistenteAseoPendiente a = new AsistenteAseoPendiente();
			a.setVisible(true);
			a.setResizable(false);
			a.setLocationRelativeTo(null);

		}

		public static void actualizarSHabitacion(){
			AsistenteAtenderServicioHabitacion a = new AsistenteAtenderServicioHabitacion();
			a.setVisible(true);
			a.setResizable(false);
			a.setLocationRelativeTo(null);

		}
}
public class GestionAseoHabitacion {


	public static String[][] generarListaLimpieza(){
		int contador = 0;
		for(int i = 0;i<Test.habitaciones.size();i++){
			if(Test.habitaciones.get(i).getLimpio() == false){
			contador++;
			}
		}
		String[][] lista = new String[contador][1];
		if(contador !=0 ){
		int contador2=0;
			for(int i = 0;i<Test.habitaciones.size();i++){
				if(Test.habitaciones.get(i).getLimpio() == false){
					lista[contador2][0] =(String.valueOf(Test.habitaciones.get(i).getNum_Habitacion()));
					contador2++;
			}
		}
		}
		return lista;
	}

	public static void resetearAseo(){
		//Test.aseo.clear();
		for(int i=0;i<Test.habitaciones.size();i++){
			TurnoAseo temporal = new TurnoAseo();
			//temporal.setHabitacion(Test.habitaciones.get(i).getNum_Habitacion());
			//temporal.setLimpio(false);
			//Test.aseo.add(temporal);
		}
	}



	public static boolean  limpiarHabitacion(int habitacion){
		boolean realizado = false;
		int posicion = BusquedaFuncionario.buscarAseador();
		if(posicion != -1){

		int posicionHab;
		posicionHab = business.BusquedaHabitacion.buscarHabitacionGeneral(habitacion);
		boolean estabaLimpia = false;
		if(Test.habitaciones.get(posicionHab).getLimpio() == false){
		Aseador aseador = (Aseador) Test.funcionarios.get(posicion);
		TurnoAseo turno = new TurnoAseo();
		turno.setAseador(aseador);
		turno.setHabitacion(Test.habitaciones.get(posicionHab));
		realizado = procesoLimpiarHabitacion(turno);
		}else{
				estabaLimpia = true;
		}



	}
		return realizado;
}

	public static boolean  procesoLimpiarHabitacion(TurnoAseo turno){
		boolean realizado = false;

		turno.getAseador().setOcupado(true);
		ui.AsistenteAseoHabitacion.funcionarioAtendendiendo(turno.getAseador().getName());
		turno.getHabitacion().setLimpio(true);
		turno.getAseador().setOcupado(true);

		realizado = true;

		return realizado;
}



	public static int buscarHabitacion(int habitacion){
		int posicion=-1;
		for(int i= 0; i<Test.habitaciones.size();i++){
			if(Test.habitaciones.get(i).getNum_Habitacion() == habitacion){
				posicion = i;
			}
		}
		return posicion;

	}
}
public class GestionCambioHabitacion {

	public static int cambiarHabitacion(String id){
		int posicion;
		int hab = 0;
		posicion = business.BusquedaCliente.buscarClienteID(id);
		if(posicion != -1){
		if(business.Test.clientes.get(posicion).getActivo() == true){
			//busca una habitacion disponible dependiendo de la habitacionq que tennia el cliente
		int habitacion = business.Test.clientes.get(posicion).getNumHabitacion();
		int habitacionAsignar;
		if(habitacion>99 && habitacion<121){
			habitacionAsignar = business.BusquedaHabitacion.buscarSencillaDisponible();
			if(habitacion != -1 ){
				business.Test.sencillas.get(habitacionAsignar).setOcupado(true);
				hab = business.Test.sencillas.get(habitacionAsignar).getNum_Habitacion();
				business.Test.sencillas.get(business.BusquedaHabitacion.buscarSencillaEspecifica(habitacion)).setOcupado(false);
			}else{
					hab = -1;
			}
		}

		if(habitacion>199 && habitacion<221){
			habitacionAsignar = business.BusquedaHabitacion.buscarDobleDisponible();
			if(habitacionAsignar != -1 ){
				business.Test.dobles.get(habitacionAsignar).setOcupado(true);
				hab = business.Test.dobles.get(habitacionAsignar).getNum_Habitacion();
				business.Test.dobles.get(business.BusquedaHabitacion.buscarDobleEspecifica(habitacion)).setOcupado(false);
			}else{
					hab = -1;
			}

		}
		if(habitacion>299 && habitacion<321){
			habitacionAsignar = business.BusquedaHabitacion.buscarMatrimonialDisponible();
			if(habitacionAsignar != -1 ){
				business.Test.matrimoniales.get(habitacionAsignar).setOcupado(true);
				hab = business.Test.sencillas.get(habitacionAsignar).getNum_Habitacion();
				business.Test.matrimoniales.get(business.BusquedaHabitacion.buscarMatrimonialEspecifica(habitacion)).setOcupado(false);
			}else{
						hab = -1;
			}

		}
		if(habitacion>399 && habitacion<411){
			habitacionAsignar = business.BusquedaHabitacion.buscarSuiteDisponible();
			if(habitacionAsignar != -1 ){
				business.Test.suites.get(habitacionAsignar).setOcupado(true);
				hab = business.Test.sencillas.get(habitacionAsignar).getNum_Habitacion();
				business.Test.suites.get(business.BusquedaHabitacion.buscarSuiteEspecifica(habitacion)).setOcupado(false);
			}else{
						hab = -1;
			}

		}
		if(habitacion>499 && habitacion<521){
			habitacionAsignar = business.BusquedaHabitacion.buscarSuiteJuniorDisponible();
			if(habitacionAsignar != -1 ){
				business.Test.suitesJunior.get(habitacionAsignar).setOcupado(true);
				hab = business.Test.sencillas.get(habitacionAsignar).getNum_Habitacion();
				business.Test.suitesJunior.get(business.BusquedaHabitacion.buscarSuiteJuniorEspecifica(habitacion)).setOcupado(false);
			}else{
						hab = -1;
			}

		}
		if(habitacion>599 && habitacion<605){
			habitacionAsignar = business.BusquedaHabitacion.buscarSuitePresidencialDisponible();
			if(habitacionAsignar != -1 ){
				business.Test.suitesPresidencial.get(habitacionAsignar).setOcupado(true);
				hab = business.Test.sencillas.get(habitacionAsignar).getNum_Habitacion();
				business.Test.suitesPresidencial.get(business.BusquedaHabitacion.buscarSuitePresidencialEspecifica(habitacion)).setOcupado(false);
			}else{
						hab = -1;
			}


		}else{
						hab = -2;
		}
		}else{
						hab = -3;
		}


		}
		return hab;
	}
}
public class GestionCargaCliente {

		public static void subir() throws IOException{
			String linea;
			int edad;
			int hab;
			int deuda;
			int dias;

			File b = new File( "C:\\hotel\\Nom_Clientes.txt" );
			BufferedReader entrada2;
			entrada2 = new BufferedReader( new FileReader( b ) );
			for(int i=0; entrada2.ready(); i++){
				Test.clientes.add(new data.Cliente(null,0,null));
				linea = entrada2.readLine().toUpperCase();
				Test.clientes.get(i).setName(linea);
			}
			File c = new File( "C:\\hotel\\Doc_Clientes.txt" );
			BufferedReader entrada3;
			entrada3 = new BufferedReader( new FileReader( c ) );
			for(int i=0; entrada3.ready(); i++){
				linea = entrada3.readLine();
				Test.clientes.get(i).setID(linea);
			}
			File d = new File( "C:\\hotel\\Edad_Clientes.txt" );
			BufferedReader entrada4;
			entrada4 = new BufferedReader( new FileReader( d ) );
			for(int i=0; entrada4.ready(); i++){
				edad = Integer.parseInt(entrada4.readLine());
				Test.clientes.get(i).setEdad(edad);
			}
			File e = new File( "C:\\hotel\\Hab_Clientes.txt" );
			File g = new File( "C:\\hotel\\Res_Clientes.txt" );
			BufferedReader entrada5;
			entrada5 = new BufferedReader( new FileReader( e ) );
			BufferedReader entrada7;
			entrada7 = new BufferedReader( new FileReader( g ) );
			for(int i=0; entrada5.ready(); i++){
				hab = Integer.parseInt(entrada5.readLine());
				dias = Integer.parseInt(entrada7.readLine());
				if(hab != 0 && dias != 0){
				business.Checkin.AsignarHabitacionCarga(hab, i, dias);
				}
			}
			File f = new File( "C:\\hotel\\Deuda_Clientes.txt" );
			BufferedReader entrada6;
			entrada6 = new BufferedReader( new FileReader( f ) );
			for(int i=0; entrada6.ready(); i++){
				deuda = Integer.parseInt(entrada6.readLine());
				if(Test.clientes.get(i).getActivo() == true){
				Test.reservas.get(business.BusquedaReserva.buscarReserva(Test.clientes.get(i).getID())).setDeuda(deuda);
				}
			}


		}

}
public class GestionCheckSimulacion {

	public static void GestionCheckSimulacion(){


		Random randomGenerator = new Random();
		int tipoHabitacion = randomGenerator.nextInt(6);
		int reserva = randomGenerator.nextInt(4);
		reserva += 1;
		int aleatorio = randomGenerator.nextInt(Test.clientes.size());
		System.out.println("Situacion: "+tipoHabitacion);
		System.out.println("Aleatorio: "+aleatorio);
		if(Test.clientes.get(aleatorio).getActivo() == false){
		System.out.println("situacion checkin");
		System.out.println("Reserva: "+reserva);
		System.out.println("Tipo habitacion: "+tipoHabitacion);
		//asigna una habitacion dependiendo los random
		if(tipoHabitacion == 0){
			business.Checkin.AsignarHabitacion(1, aleatorio, reserva);
			ui.simulacion.setCheckin("El cliente "+Test.clientes.get(aleatorio).getName()+" se ha realizado checkin");
			}
		if(tipoHabitacion == 1){
			business.Checkin.AsignarHabitacion(2, aleatorio, reserva);
			ui.simulacion.setCheckin("El cliente "+Test.clientes.get(aleatorio).getName()+" se ha realizado checkin");
			}
		if(tipoHabitacion == 2){
			business.Checkin.AsignarHabitacion(3, aleatorio, reserva);
			ui.simulacion.setCheckin("El cliente "+Test.clientes.get(aleatorio).getName()+" se ha realizado checkin");
			}
		if(tipoHabitacion == 3){
			business.Checkin.AsignarHabitacion(4, aleatorio, reserva);
			ui.simulacion.setCheckin("El cliente "+Test.clientes.get(aleatorio).getName()+" se ha realizado checkin");
			}
		if(tipoHabitacion == 4){
			business.Checkin.AsignarHabitacion(5, aleatorio, reserva);
			ui.simulacion.setCheckin("El cliente "+Test.clientes.get(aleatorio).getName()+" se ha realizado checkin");
			}
		if(tipoHabitacion == 5){
			business.Checkin.AsignarHabitacion(6, aleatorio, reserva);
			ui.simulacion.setCheckin("El cliente "+Test.clientes.get(aleatorio).getName()+" se ha realizado checkin");
			}




		}




	}

}
public class GestionCobro {
	//le suma a la deuda de la factura el precio de la habitacinn
	public static void generarCobro(){
		for(Cliente cli: business.Test.clientes){
			if(cli.getActivo() == true){
					cli.getFactura().setDeuda(cli.getReserva().getHabitacion().getPrecio());
					Gasto cobro = new Gasto("Habitacion",cli.getReserva().getHabitacion().getPrecio());
					cli.getFactura().setSaldosAdicionales(cobro);

			}
		}

	}
}
public class GestionFactura {

	public static String[][] facturas(){
		String[][] facturas = new String[Test.reservas.size()][7];
		int numero=1;

		for(int i =0;i<Test.reservas.size();i++){
			//gusrda en el arreglo los datos del cliente y su reserva
				facturas[i][0] = String.valueOf(numero);
				facturas[i][1] = Test.reservas.get(i).getCliente().getName();
				facturas[i][2] = Test.reservas.get(i).getCliente().getID();
				facturas[i][3] = Test.reservas.get(i).getFactura().getDiaCheckin();
				facturas[i][4] = Test.reservas.get(i).getFactura().getDiaCheckout();
				facturas[i][5] = String.valueOf(Test.reservas.get(i).getHabitacion().getNum_Habitacion());
				facturas[i][6] = String.valueOf(Test.reservas.get(i).getDias());


			numero++;


		}


		return facturas;

	}

	public static String[][] saldo(int posicion){
		int tamano;
		tamano = Test.reservas.get(posicion).getFactura().getSaldosAdicionales().size();
		ArrayList<data.Gasto> gastos = Test.reservas.get(posicion).getFactura().getSaldosAdicionales();
		String[][] saldo = new String[tamano][4];
		int numero=1;

		for(int i =0;i<tamano;i++){
			//guarda en la matriz los datos de los gastos
				saldo[i][0] = String.valueOf(numero);
				saldo[i][1] = gastos.get(i).getDescripcion();
				saldo[i][2] = String.valueOf(gastos.get(i).getPrecio());
				saldo[i][3] = gastos.get(i).getDia();
			numero++;


		}


		return saldo;

	}

}
public class GestionMantenimiento {
	//cambia el atributo de la habitacinn a mantenimiento=true
	public static boolean asignarMantenimiento(int habitacion){
		int posicion;
		boolean realizado = false;
		try{
			posicion = business.BusquedaHabitacion.buscarHabitacionGeneral(habitacion);
			System.out.println("Posicion: "+posicion);
			if(Test.habitaciones.get(posicion).getOcupado()==false){
			business.Test.habitaciones.get(posicion).setMantenimiento(true);
			realizado = true;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return realizado;
	}
	//cambia el atributo mantenimiento a false
	public static boolean mantenimientoRealizado(int habitacion){
		int posicion;
		boolean realizado = false;
		try{
			posicion = business.BusquedaHabitacion.buscarHabitacionGeneral(habitacion);
			if(Test.habitaciones.get(posicion).getOcupado()==false){
			business.Test.habitaciones.get(posicion).setMantenimiento(false);
			realizado = true;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return realizado;
	}
}
public class GestionServicioHabitacion {


	public static boolean pedirServicioALaHabitacion(int habitacion,String pedido){
		int posicion;
		boolean realizado = false;
		posicion = BusquedaHabitacion.buscarHabitacionGeneral(habitacion);
		GestionActualizarEstado.actualizarEstado();
		if(posicion != -1){
		if(Test.habitaciones.get(posicion).getOcupado() == true){
		Test.habitaciones.get(posicion).setServicioHabitacion(true);
		Test.habitaciones.get(posicion).setPedido(pedido);
		Test.clientes.get(BusquedaCliente.buscarClienteHab(habitacion)).getFactura().setDeuda(15);
		Gasto cobro = new Gasto("Servicio a la habitacion",15);
		Test.clientes.get(BusquedaCliente.buscarClienteHab(habitacion)).getFactura().setSaldosAdicionales(cobro);
		realizado = true;
		}else{
			realizado = false;
		}
		}
		return realizado;
	}




	public static boolean ServicioHabitacion(int habitacion){
		boolean realizado = atenderHabitacion(habitacion);
		return realizado;
	}




	public static String[][] generarListaServicioHabitacion(){
		int contador = 0;
		for(int i = 0;i<Test.habitaciones.size();i++){
			if(Test.habitaciones.get(i).getServicioHabitacion() == true){
			contador++;
			}
		}
		String[][] lista = new String[contador][1];
		if(contador !=0 ){
		int contador2=0;
			for(int i = 0;i<Test.habitaciones.size();i++){
				if(Test.habitaciones.get(i).getServicioHabitacion() == true){
					lista[contador2][0] =(String.valueOf(Test.habitaciones.get(i).getNum_Habitacion())+" - "+Test.habitaciones.get(i).getPedido());
					contador2++;
			}
		}
		}
		return lista;
	}

	public static boolean atenderHabitacion(int habitacion){
		boolean realizado = false;
		int posicion = business.BusquedaFuncionario.buscarServicioHabitacion();
		if(posicion != -1){
		int posicionHab;
		posicionHab = business.BusquedaHabitacion.buscarHabitacionGeneral(habitacion);
		boolean pendiente = true;
				if(Test.habitaciones.get(posicionHab).getServicioHabitacion() == true){
					Mesero mesero = (Mesero) Test.funcionarios.get(posicion);
					TurnoServicioHabitacion turno = new TurnoServicioHabitacion();
					turno.setEncargado(mesero);
					turno.setHabitacion(Test.habitaciones.get(posicionHab));
				realizado = procesoAtenderHabitacion(turno);

				}else{
					pendiente = false;

				}

	}
				System.out.println("realizado = "+realizado);
				return realizado;
}

	public static boolean procesoAtenderHabitacion(TurnoServicioHabitacion turno){

		turno.getEncargado().setOcupado(true);
		ui.AsistenteAseoHabitacion.funcionarioAtendendiendo(turno.getEncargado().getName());
		turno.getHabitacion().setServicioHabitacion(false);
		turno.getHabitacion().setPedido(null);
		turno.getEncargado().setOcupado(false);
		boolean realizado = true;

		return realizado;
}


	public static int buscarHabitacion(int habitacion){
		int posicion=-1;
		for(int i= 0; i<Test.habitaciones.size();i++){
			if(Test.habitaciones.get(i).getNum_Habitacion() == habitacion){
				posicion = i;
				System.out.println("Encontrada la habitacion");
			}
		}
		return posicion;

	}
}
public class GestionSimulacion {
	//genera los randoms de lo que un cliente real puede hacer en el hotel
	public static void AccionesCliente(){
		Random randomGenerator = new Random();
		int situacion = randomGenerator.nextInt(4);

		int aleatorio = randomGenerator.nextInt(Test.clientes.size());
		System.out.println("Situacion: "+situacion);
		System.out.println("Aleatorio: "+aleatorio);
		if(situacion == 0){
		if(aleatorio != -1){
		System.out.println("situacion bebida");
		if(Test.clientes.get(aleatorio).getActivo() == true){

		Test.habitaciones.get(BusquedaHabitacion.buscarHabitacionGeneral(Test.clientes.get(aleatorio).getNumHabitacion())).restarMinibarBebidas();
		System.out.println("El cliente: "+Test.clientes.get(aleatorio).getName()
				+" consumio una bebida");
		}
		}
		}
		if(situacion == 1){
			System.out.println("Situacion ensuciar");
			if(Test.clientes.get(aleatorio).getActivo() == true){
				int habitacion;
				habitacion = Test.clientes.get(aleatorio).getNumHabitacion();
				int posicion;
				posicion = BusquedaHabitacion.buscarHabitacionGeneral(habitacion);
				business.Test.habitaciones.get(posicion).setLimpio(false);
				ui.simulacion.setOtro("El cliente "+Test.clientes.get(aleatorio).getName()+" ha solicitado limpieza");
				System.out.println("El cliente "+Test.clientes.get(aleatorio).getName()+" ha solicitado limpieza");

			}
		}
		if(situacion == 2){
			System.out.println("Situacion Servicio Habitacion");
			if(Test.clientes.get(aleatorio).getActivo() == true){
				int habitacion;
				habitacion = Test.clientes.get(aleatorio).getNumHabitacion();
				String [] lista = {"Hamburguesa","Pizza","Sushi","Langosta"};
				int opcion;
				opcion = randomGenerator.nextInt(4);
				business.GestionServicioHabitacion.pedirServicioALaHabitacion(habitacion, lista[opcion]);


				ui.simulacion.setOtro("El cliente "+Test.clientes.get(aleatorio).getName()+" ha solicitado Servicio a la habitacion");
				System.out.println("El cliente "+Test.clientes.get(aleatorio).getName()+" ha solicitado Servicio a la habitacion");

			}
		}

		if(situacion == 3){
			System.out.println("Hurtar elemento");
			if(Test.clientes.get(aleatorio).getActivo() == true){
				int habitacion;
				habitacion = Test.clientes.get(aleatorio).getNumHabitacion();
				int posicion;
				posicion = business.BusquedaHabitacion.buscarHabitacionGeneral(habitacion);
				int opcion;
				int opcion2;
				opcion = randomGenerator.nextInt(2);
				opcion2 = 0;
				int posicion2;
				posicion2 = business.BusquedaHabitacion.buscarSuiteGeneral(habitacion);

				if(Test.habitaciones.get(business.BusquedaHabitacion.buscarHabitacionGeneral(Test.clientes.get(aleatorio).getNumHabitacion())).getClass().getSuperclass().equals(Test.habitaciones.get(70).getClass().getSuperclass())){
					switch(opcion){
					case 0: Test.habitaciones.get(posicion).setTelevisor(-1); break;
					case 1: Test.suiteGeneral.get(posicion2).setCuadros(-1);
					}
					if(opcion == 0){
					ui.simulacion.setRobo("El cliente "+Test.clientes.get(aleatorio).getName()+" ha hurtado un televisor");
					}else{
					ui.simulacion.setRobo("El cliente "+Test.clientes.get(aleatorio).getName()+" ha hurtado cuadro");
					}

					System.out.println("El cliente "+Test.clientes.get(aleatorio).getName()+" ha hurtado "+opcion);
				}else{
					switch(opcion2){
					case 0: Test.habitaciones.get(posicion).setTelevisor(-1);
					}
					ui.simulacion.setRobo("El cliente "+Test.clientes.get(aleatorio).getName()+" ha hurtado un televisor");
					System.out.println("El cliente "+Test.clientes.get(aleatorio).getName()+" ha hurtado "+opcion2 + " habitacion");
				}




			}
		}
	}
}
public class GestionSimulacionHotel extends Thread {

	boolean continuar = true;

	public void setContinuar() {
		this.continuar = false;
	}


		public void run()
		{
			for(int i=0;i<1000 && continuar == true;i++){
				System.out.println("Continuar "+continuar);
				GestionSimulacion.AccionesCliente();
				GestionCheckSimulacion.GestionCheckSimulacion();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}


		}

}
public class GestionTiempo extends Thread {
	public void run()
	{
		for(int i=0;i<1000;i++){
		try {
			Thread.sleep(30000);//30s es un dia
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Test.diaGeneral[0] += 1;
		if(Test.diaGeneral[0] == 31){
			Test.diaGeneral[0] = 1;
			Test.diaGeneral[1] += 1;
		}
		if(Test.diaGeneral[1] == 13){
			Test.diaGeneral[1] = 1;
			Test.diaGeneral[2] += 1;
		}

		System.out.println("Cambio de dia!!!");
		business.GestionCobro.generarCobro();
		System.out.println("dia general: "+Test.diaGeneral[0]+"/"+Test.diaGeneral[1]+"/"+Test.diaGeneral[2]);

                for (int b=0;b<Test.reservas.size();b++) {

                    if(Test.reservas.get(b).getActiva()==true){
                  //resta un dia a cada reserva
				Test.reservas.get(b).setDias(-1);
                 //obliga al cliente que se le ha vencido la reserva a hacer checkout
                    	if(Test.reservas.get(b).getDias()<0){
					business.Checkout.checkoutSimulacion(Test.reservas.get(b).getCliente().getID());
					ui.simulacion.setCheckout("El cliente "+Test.reservas.get(b).getCliente().getName()+" ha realizado checkout");

			}
                     }


                    }

                }
        }
}
public class mostrarHabitaciones {


	public static void mostrarSencillas(){
		for(Sencilla sen: Test.sencillas){
			System.out.printf("%5s%7d%8b\n", sen.getNum_Habitacion(),sen.getPrecio(),sen.getOcupado());
		}
	}

	public static void mostrarDobles(){
		for(Doble dob: Test.dobles){
			System.out.printf("%5s%7d%8b\n", dob.getNum_Habitacion(),dob.getPrecio(),dob.getOcupado());
		}
	}

	public static void mostrarMatrimoniales(){
		for(Matrimonial mat : Test.matrimoniales){
			System.out.printf("%5s%7d%8b\n", mat.getNum_Habitacion(),mat.getPrecio(),mat.getOcupado());
		}
	}

	public static void mostrarSuites(){
		for(SuiteSencilla sui : Test.suites){
			System.out.printf("%5s%7d%8b\n", sui.getNum_Habitacion(),sui.getPrecio(),sui.getOcupado());
		}
	}

	public static void mostrarSuitesJunior(){
		for(SuiteJunior suj : Test.suitesJunior){
			System.out.printf("%5s%7d%8b\n", suj.getNum_Habitacion(),suj.getPrecio(),suj.getOcupado());
		}
	}

	public static void mostrarSuitesPresidencial(){
		for(SuitePresidencial sup : Test.suitesPresidencial){
			System.out.printf("%5s%7d%8b\n", sup.getNum_Habitacion(),sup.getPrecio(),sup.getOcupado());
		}
	}
}
public class Test {
	//listas de onjetos en el hotel
	public static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	public static ArrayList<Sencilla> sencillas = new ArrayList<Sencilla>();
	public static ArrayList<Doble> dobles = new ArrayList<Doble>();
	public static ArrayList<Matrimonial> matrimoniales = new ArrayList<Matrimonial>();
	public static ArrayList<SuiteSencilla> suites = new ArrayList<SuiteSencilla>();
	public static ArrayList<SuiteJunior> suitesJunior = new ArrayList<SuiteJunior>();
	public static ArrayList<SuitePresidencial> suitesPresidencial = new ArrayList<SuitePresidencial>();
	public static ArrayList<Habitacion> habitaciones = new ArrayList<Habitacion>();
	public static ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
	public static ArrayList<Reserva> reservas = new ArrayList<Reserva>();
	public static ArrayList<Suite_general> suiteGeneral = new ArrayList<Suite_general>();
	public static int[] diaGeneral = new int[3];
	public static simulacion simu = new simulacion();



	public static void main(String[] args) throws IOException{

			diaGeneral[0] = 01;
			diaGeneral[1] = 01;
			diaGeneral[2] = 2014;
			CreacionHabitaciones.crearHabitaciones();
			GestionActualizarEstado.actualizarEstado();
			GestionCargaCliente.subir();
			GestionTiempo tiempo = new GestionTiempo();
			GestionSimulacionHotel simulacion = new GestionSimulacionHotel();
			simu.setResizable(false);


			simulacion.start();
			tiempo.start();

			ui.Principal a = new ui.Principal();
			a.setVisible(true);


	}
}
// =================================================================== //
