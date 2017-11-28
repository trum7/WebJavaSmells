package proyecto1



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class FraccionController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

	double rendimient0;
	
    def index(Integer max) {
		if( session.role < 2 ){
		   flash.message = "Authentication needed!"
	       redirect (controller: "user", action: 'index')
		}else{
           params.max = Math.min(max ?: 10, 100)
           respond Fraccion.list(params), model:[fraccionInstanceCount: Fraccion.count()]
		}
    }

    def show(Fraccion fraccionInstance) {
		if( session.role < 2 ){
		   flash.message = "Authentication needed!"
		   redirect (controller: "user", action: 'index')
		}else{
           respond fraccionInstance
		}
    }

    def create() {
		if( session.role < 2 ){
		   flash.message = "Authentication needed!"
		   redirect (controller: "user", action: 'index')
		}else{
           respond new Fraccion(params)
		}
    }
	
	def creation( ){ 
		
		if( session.role < 2 ){
			flash.message = "Authentication needed!"
			redirect (controller: "user", action: 'index')
		 }
		
	}

	@Transactional
	def creation2() {
		if( session.role < 2 ){
		   flash.message = "Authentication needed!"
		   redirect (controller: "user", action: 'index')
		}else{
          
		
		   //Fraccion 1
		   
		   Fraccion fraccion1 = new Fraccion( );
		   Muestra muestr = session.muestra;
		   
		   def valores = [];
		   
		   valores.add( params.rendimiento1 )
		   valores.add( params.azufre1 )
		   valores.add( params.cenizas1 )
		   valores.add( params.asfaltenos1 )
		   valores.add( params.viscosidad401 )
		   valores.add( params.viscosidad501 )
		   valores.add( params.viscosidad801 )
		   valores.add( params.viscosidad1001 )
		   valores.add( params.viscosidad1201 )
		   valores.add( params.viscosidad1401 )
		   valores.add( params.nitrogeno1 )
		   valores.add( params.aluminio1 )
		   valores.add( params.niquel1 )
		   valores.add( params.vanadio1 )
		   valores.add( params.hierro1 )
		   valores.add( params.cobre1 )
		   valores.add( params.magnesio1 )
		   valores.add( params.calcio1 )
		   valores.add( params.sodio1 )

           
		   for( int i = 0; i < valores.size( ); i++ ){
			   
			   if( valores.get( i ) == null || valores.get( i ) == '' ){
				   valores[i] = '0';
			   }
			   
		   } 		   
		   
		   
		   
		   fraccion1.muestra = muestr;
		   fraccion1.rendimiento = Float.parseFloat( valores.get( 0 ) ) ;
		   fraccion1.azufre	= Float.parseFloat( valores.get( 1 ) );
		   fraccion1.cenizas = Float.parseFloat( valores.get( 2 ) );
		   fraccion1.asfaltenos	= Float.parseFloat( valores.get( 3 ) );
		   fraccion1.viscosidad40 = Float.parseFloat( valores.get( 4 ) );
		   fraccion1.viscosidad50 = Float.parseFloat( valores.get( 5 ) );
		   fraccion1.viscosidad80 = Float.parseFloat( valores.get( 6 ) );
		   fraccion1.viscosidad100 = Float.parseFloat( valores.get( 7 ) );
		   fraccion1.viscosidad120 = Float.parseFloat( valores.get( 8 ) );
		   fraccion1.viscosidad140 = Float.parseFloat( valores.get( 9 ) );
		   fraccion1.nitrogenoTotal = 0;
		   fraccion1.nitrogenoBasico = Float.parseFloat( valores.get( 10 ) );
		   fraccion1.aluminio = Float.parseFloat( valores.get( 11 ) );
		   fraccion1.niquel	= Float.parseFloat( valores.get( 12 ) );
		   fraccion1.vanadio = Float.parseFloat( valores.get( 13 ) );
		   fraccion1.hierro	= Float.parseFloat( valores.get( 14 ) );
		   fraccion1.cobre = Float.parseFloat( valores.get( 15 ) );
		   fraccion1.magnesio = Float.parseFloat( valores.get( 16 ) );
		   fraccion1.calcio	= Float.parseFloat( valores.get( 17 ) );
		   fraccion1.sodio	= Float.parseFloat( valores.get( 18 ) );
		   
		   
		   //Fraccion 2
		   
		   Fraccion fraccion2 = new Fraccion( );
		   
		   valores = [];
		   
		   valores.add( params.rendimiento2 )
		   valores.add( params.azufre2 )
		   valores.add( params.cenizas2 )
		   valores.add( params.asfaltenos2 )
		   valores.add( params.viscosidad402 )
		   valores.add( params.viscosidad502 )
		   valores.add( params.viscosidad802 )
		   valores.add( params.viscosidad1002 )
		   valores.add( params.viscosidad1202 )
		   valores.add( params.viscosidad1402 )
		   valores.add( params.nitrogeno2 )
		   valores.add( params.aluminio2 )
		   valores.add( params.niquel2 )
		   valores.add( params.vanadio2 )
		   valores.add( params.hierro2 )
		   valores.add( params.cobre2 )
		   valores.add( params.magnesio2 )
		   valores.add( params.calcio2 )
		   valores.add( params.sodio2 )

		   
		   for( int i = 0; i < valores.size( ); i++ ){
			   
			   if( valores.get( i ) == null || valores.get( i ) == '' ){
				   valores[i] = '0';
			   }
			   
		   }
		   
		   
		   
		   fraccion2.muestra = muestr;
		   fraccion2.rendimiento = Float.parseFloat( valores.get( 0 ) ) ;
		   fraccion2.azufre	= Float.parseFloat( valores.get( 1 ) );
		   fraccion2.cenizas = Float.parseFloat( valores.get( 2 ) );
		   fraccion2.asfaltenos	= Float.parseFloat( valores.get( 3 ) );
		   fraccion2.viscosidad40 = Float.parseFloat( valores.get( 4 ) );
		   fraccion2.viscosidad50 = Float.parseFloat( valores.get( 5 ) );
		   fraccion2.viscosidad80 = Float.parseFloat( valores.get( 6 ) );
		   fraccion2.viscosidad100 = Float.parseFloat( valores.get( 7 ) );
		   fraccion2.viscosidad120 = Float.parseFloat( valores.get( 8 ) );
		   fraccion2.viscosidad140 = Float.parseFloat( valores.get( 9 ) );
		   fraccion2.nitrogenoTotal = 0;
		   fraccion2.nitrogenoBasico = Float.parseFloat( valores.get( 10 ) );
		   fraccion2.aluminio = Float.parseFloat( valores.get( 11 ) );
		   fraccion2.niquel	= Float.parseFloat( valores.get( 12 ) );
		   fraccion2.vanadio = Float.parseFloat( valores.get( 13 ) );
		   fraccion2.hierro	= Float.parseFloat( valores.get( 14 ) );
		   fraccion2.cobre = Float.parseFloat( valores.get( 15 ) );
		   fraccion2.magnesio = Float.parseFloat( valores.get( 16 ) );
		   fraccion2.calcio	= Float.parseFloat( valores.get( 17 ) );
		   fraccion2.sodio	= Float.parseFloat( valores.get( 18 ) );
		   
		   
		   
		   //Fraccion 3
		   
		   Fraccion fraccion3 = new Fraccion( );
		   
		   valores = [];
		   
		   valores.add( params.rendimiento3 )
		   valores.add( params.azufre3 )
		   valores.add( params.cenizas3 )
		   valores.add( params.asfaltenos3 )
		   valores.add( params.viscosidad403 )
		   valores.add( params.viscosidad503 )
		   valores.add( params.viscosidad803 )
		   valores.add( params.viscosidad1003 )
		   valores.add( params.viscosidad1203 )
		   valores.add( params.viscosidad1403 )
		   valores.add( params.nitrogeno3 )
		   valores.add( params.aluminio3 )
		   valores.add( params.niquel3 )
		   valores.add( params.vanadio3 )
		   valores.add( params.hierro3 )
		   valores.add( params.cobre3 )
		   valores.add( params.magnesio3 )
		   valores.add( params.calcio3 )
		   valores.add( params.sodio3 )

		   
		   for( int i = 0; i < valores.size( ); i++ ){
			   
			   if( valores.get( i ) == null || valores.get( i ) == '' ){
				   valores[i] = '0';
			   }
			   
		   }
		   
		   
		   
		   fraccion3.muestra = muestr;
		   fraccion3.rendimiento = Float.parseFloat( valores.get( 0 ) ) ;
		   fraccion3.azufre	= Float.parseFloat( valores.get( 1 ) );
		   fraccion3.cenizas = Float.parseFloat( valores.get( 2 ) );
		   fraccion3.asfaltenos	= Float.parseFloat( valores.get( 3 ) );
		   fraccion3.viscosidad40 = Float.parseFloat( valores.get( 4 ) );
		   fraccion3.viscosidad50 = Float.parseFloat( valores.get( 5 ) );
		   fraccion3.viscosidad80 = Float.parseFloat( valores.get( 6 ) );
		   fraccion3.viscosidad100 = Float.parseFloat( valores.get( 7 ) );
		   fraccion3.viscosidad120 = Float.parseFloat( valores.get( 8 ) );
		   fraccion3.viscosidad140 = Float.parseFloat( valores.get( 9 ) );
		   fraccion3.nitrogenoTotal = 0;
		   fraccion3.nitrogenoBasico = Float.parseFloat( valores.get( 10 ) );
		   fraccion3.aluminio = Float.parseFloat( valores.get( 11 ) );
		   fraccion3.niquel	= Float.parseFloat( valores.get( 12 ) );
		   fraccion3.vanadio = Float.parseFloat( valores.get( 13 ) );
		   fraccion3.hierro	= Float.parseFloat( valores.get( 14 ) );
		   fraccion3.cobre = Float.parseFloat( valores.get( 15 ) );
		   fraccion3.magnesio = Float.parseFloat( valores.get( 16 ) );
		   fraccion3.calcio	= Float.parseFloat( valores.get( 17 ) );
		   fraccion3.sodio	= Float.parseFloat( valores.get( 18 ) );
		   
		   
		   //Fraccion 4
		   
		   Fraccion fraccion4 = new Fraccion( );
		   
		   valores = [];
		   
		   valores.add( params.rendimiento4 )
		   valores.add( params.azufre4 )
		   valores.add( params.cenizas4 )
		   valores.add( params.asfaltenos4 )
		   valores.add( params.viscosidad404 )
		   valores.add( params.viscosidad504 )
		   valores.add( params.viscosidad804 )
		   valores.add( params.viscosidad1004 )
		   valores.add( params.viscosidad1204 )
		   valores.add( params.viscosidad1404 )
		   valores.add( params.nitrogeno4 )
		   valores.add( params.aluminio4 )
		   valores.add( params.niquel4 )
		   valores.add( params.vanadio4 )
		   valores.add( params.hierro4 )
		   valores.add( params.cobre4 )
		   valores.add( params.magnesio4 )
		   valores.add( params.calcio4 )
		   valores.add( params.sodio4 )

		   
		   for( int i = 0; i < valores.size( ); i++ ){
			   
			   if( valores.get( i ) == null || valores.get( i ) == '' ){
				   valores[i] = '0';
			   }
			   
		   }
		   
		   
		   
		   fraccion4.muestra = muestr;
		   fraccion4.rendimiento = Float.parseFloat( valores.get( 0 ) ) ;
		   fraccion4.azufre	= Float.parseFloat( valores.get( 1 ) );
		   fraccion4.cenizas = Float.parseFloat( valores.get( 2 ) );
		   fraccion4.asfaltenos	= Float.parseFloat( valores.get( 3 ) );
		   fraccion4.viscosidad40 = Float.parseFloat( valores.get( 4 ) );
		   fraccion4.viscosidad50 = Float.parseFloat( valores.get( 5 ) );
		   fraccion4.viscosidad80 = Float.parseFloat( valores.get( 6 ) );
		   fraccion4.viscosidad100 = Float.parseFloat( valores.get( 7 ) );
		   fraccion4.viscosidad120 = Float.parseFloat( valores.get( 8 ) );
		   fraccion4.viscosidad140 = Float.parseFloat( valores.get( 9 ) );
		   fraccion4.nitrogenoTotal = 0;
		   fraccion4.nitrogenoBasico = Float.parseFloat( valores.get( 10 ) );
		   fraccion4.aluminio = Float.parseFloat( valores.get( 11 ) );
		   fraccion4.niquel	= Float.parseFloat( valores.get( 12 ) );
		   fraccion4.vanadio = Float.parseFloat( valores.get( 13 ) );
		   fraccion4.hierro	= Float.parseFloat( valores.get( 14 ) );
		   fraccion4.cobre = Float.parseFloat( valores.get( 15 ) );
		   fraccion4.magnesio = Float.parseFloat( valores.get( 16 ) );
		   fraccion4.calcio	= Float.parseFloat( valores.get( 17 ) );
		   fraccion4.sodio	= Float.parseFloat( valores.get( 18 ) );
		   
		   
		   //Fraccion 5
		   
		   Fraccion fraccion5 = new Fraccion( );
		   
		   valores = [];
		   
		   valores.add( params.rendimiento5 )
		   valores.add( params.azufre5 )
		   valores.add( params.cenizas5 )
		   valores.add( params.asfaltenos5 )
		   valores.add( params.viscosidad405 )
		   valores.add( params.viscosidad505 )
		   valores.add( params.viscosidad805 )
		   valores.add( params.viscosidad1005 )
		   valores.add( params.viscosidad1205 )
		   valores.add( params.viscosidad1405 )
		   valores.add( params.nitrogeno5 )
		   valores.add( params.aluminio5 )
		   valores.add( params.niquel5 )
		   valores.add( params.vanadio5 )
		   valores.add( params.hierro5 )
		   valores.add( params.cobre5 )
		   valores.add( params.magnesio5 )
		   valores.add( params.calcio5 )
		   valores.add( params.sodio5 )

		   
		   for( int i = 0; i < valores.size( ); i++ ){
			   
			   if( valores.get( i ) == null || valores.get( i ) == '' ){
				   valores[i] = '0';
			   }
			   
		   }
		   
		   
		   
		   fraccion5.muestra = muestr;
		   fraccion5.rendimiento = Float.parseFloat( valores.get( 0 ) ) ;
		   fraccion5.azufre	= Float.parseFloat( valores.get( 1 ) );
		   fraccion5.cenizas = Float.parseFloat( valores.get( 2 ) );
		   fraccion5.asfaltenos	= Float.parseFloat( valores.get( 3 ) );
		   fraccion5.viscosidad40 = Float.parseFloat( valores.get( 4 ) );
		   fraccion5.viscosidad50 = Float.parseFloat( valores.get( 5 ) );
		   fraccion5.viscosidad80 = Float.parseFloat( valores.get( 6 ) );
		   fraccion5.viscosidad100 = Float.parseFloat( valores.get( 7 ) );
		   fraccion5.viscosidad120 = Float.parseFloat( valores.get( 8 ) );
		   fraccion5.viscosidad140 = Float.parseFloat( valores.get( 9 ) );
		   fraccion5.nitrogenoTotal = 0;
		   fraccion5.nitrogenoBasico = Float.parseFloat( valores.get( 10 ) );
		   fraccion5.aluminio = Float.parseFloat( valores.get( 11 ) );
		   fraccion5.niquel	= Float.parseFloat( valores.get( 12 ) );
		   fraccion5.vanadio = Float.parseFloat( valores.get( 13 ) );
		   fraccion5.hierro	= Float.parseFloat( valores.get( 14 ) );
		   fraccion5.cobre = Float.parseFloat( valores.get( 15 ) );
		   fraccion5.magnesio = Float.parseFloat( valores.get( 16 ) );
		   fraccion5.calcio	= Float.parseFloat( valores.get( 17 ) );
		   fraccion5.sodio	= Float.parseFloat( valores.get( 18 ) );
		   
		   
		   //Fraccion 6
		   
		   Fraccion fraccion6 = new Fraccion( );
		   
		   valores = [];
		   
		   valores.add( params.rendimiento6 )
		   valores.add( params.azufre6 )
		   valores.add( params.cenizas6 )
		   valores.add( params.asfaltenos6 )
		   valores.add( params.viscosidad406 )
		   valores.add( params.viscosidad506 )
		   valores.add( params.viscosidad806 )
		   valores.add( params.viscosidad1006 )
		   valores.add( params.viscosidad1206 )
		   valores.add( params.viscosidad1406 )
		   valores.add( params.nitrogeno6 )
		   valores.add( params.aluminio6 )
		   valores.add( params.niquel6 )
		   valores.add( params.vanadio6 )
		   valores.add( params.hierro6 )
		   valores.add( params.cobre6 )
		   valores.add( params.magnesio6 )
		   valores.add( params.calcio6 )
		   valores.add( params.sodio6 )

		   
		   for( int i = 0; i < valores.size( ); i++ ){
			   
			   if( valores.get( i ) == null || valores.get( i ) == '' ){
				   valores[i] = '0';
			   }
			   
		   }
		   
		   
		   
		   fraccion6.muestra = muestr;
		   fraccion6.rendimiento = Float.parseFloat( valores.get( 0 ) ) ;
		   fraccion6.azufre	= Float.parseFloat( valores.get( 1 ) );
		   fraccion6.cenizas = Float.parseFloat( valores.get( 2 ) );
		   fraccion6.asfaltenos	= Float.parseFloat( valores.get( 3 ) );
		   fraccion6.viscosidad40 = Float.parseFloat( valores.get( 4 ) );
		   fraccion6.viscosidad50 = Float.parseFloat( valores.get( 5 ) );
		   fraccion6.viscosidad80 = Float.parseFloat( valores.get( 6 ) );
		   fraccion6.viscosidad100 = Float.parseFloat( valores.get( 7 ) );
		   fraccion6.viscosidad120 = Float.parseFloat( valores.get( 8 ) );
		   fraccion6.viscosidad140 = Float.parseFloat( valores.get( 9 ) );
		   fraccion6.nitrogenoTotal = 0;
		   fraccion6.nitrogenoBasico = Float.parseFloat( valores.get( 10 ) );
		   fraccion6.aluminio = Float.parseFloat( valores.get( 11 ) );
		   fraccion6.niquel	= Float.parseFloat( valores.get( 12 ) );
		   fraccion6.vanadio = Float.parseFloat( valores.get( 13 ) );
		   fraccion6.hierro	= Float.parseFloat( valores.get( 14 ) );
		   fraccion6.cobre = Float.parseFloat( valores.get( 15 ) );
		   fraccion6.magnesio = Float.parseFloat( valores.get( 16 ) );
		   fraccion6.calcio	= Float.parseFloat( valores.get( 17 ) );
		   fraccion6.sodio	= Float.parseFloat( valores.get( 18 ) );
		   
		   
		   //Fraccion 7
		   
		   Fraccion fraccion7 = new Fraccion( );
		   
		   valores = [];
		   
		   valores.add( params.rendimiento7 )
		   valores.add( params.azufre7 )
		   valores.add( params.cenizas7 )
		   valores.add( params.asfaltenos7 )
		   valores.add( params.viscosidad407 )
		   valores.add( params.viscosidad507 )
		   valores.add( params.viscosidad807 )
		   valores.add( params.viscosidad1007 )
		   valores.add( params.viscosidad1207 )
		   valores.add( params.viscosidad1407 )
		   valores.add( params.nitrogeno7 )
		   valores.add( params.aluminio7 )
		   valores.add( params.niquel7 )
		   valores.add( params.vanadio7 )
		   valores.add( params.hierro7 )
		   valores.add( params.cobre7 )
		   valores.add( params.magnesio7 )
		   valores.add( params.calcio7 )
		   valores.add( params.sodio7 )

		   
		   for( int i = 0; i < valores.size( ); i++ ){
			   
			   if( valores.get( i ) == null || valores.get( i ) == '' ){
				   valores[i] = '0';
			   }
			   
		   }
		   
		   
		   
		   fraccion7.muestra = muestr;
		   fraccion7.rendimiento = Float.parseFloat( valores.get( 0 ) ) ;
		   fraccion7.azufre	= Float.parseFloat( valores.get( 1 ) );
		   fraccion7.cenizas = Float.parseFloat( valores.get( 2 ) );
		   fraccion7.asfaltenos	= Float.parseFloat( valores.get( 3 ) );
		   fraccion7.viscosidad40 = Float.parseFloat( valores.get( 4 ) );
		   fraccion7.viscosidad50 = Float.parseFloat( valores.get( 5 ) );
		   fraccion7.viscosidad80 = Float.parseFloat( valores.get( 6 ) );
		   fraccion7.viscosidad100 = Float.parseFloat( valores.get( 7 ) );
		   fraccion7.viscosidad120 = Float.parseFloat( valores.get( 8 ) );
		   fraccion7.viscosidad140 = Float.parseFloat( valores.get( 9 ) );
		   fraccion7.nitrogenoTotal = 0;
		   fraccion7.nitrogenoBasico = Float.parseFloat( valores.get( 10 ) );
		   fraccion7.aluminio = Float.parseFloat( valores.get( 11 ) );
		   fraccion7.niquel	= Float.parseFloat( valores.get( 12 ) );
		   fraccion7.vanadio = Float.parseFloat( valores.get( 13 ) );
		   fraccion7.hierro	= Float.parseFloat( valores.get( 14 ) );
		   fraccion7.cobre = Float.parseFloat( valores.get( 15 ) );
		   fraccion7.magnesio = Float.parseFloat( valores.get( 16 ) );
		   fraccion7.calcio	= Float.parseFloat( valores.get( 17 ) );
		   fraccion7.sodio	= Float.parseFloat( valores.get( 18 ) );
		   
		   
		   //Fraccion 8
		   
		   Fraccion fraccion8 = new Fraccion( );
		   
		   valores = [];
		   
		   valores.add( params.rendimiento8 )
		   valores.add( params.azufre8 )
		   valores.add( params.cenizas8 )
		   valores.add( params.asfaltenos8 )
		   valores.add( params.viscosidad408 )
		   valores.add( params.viscosidad508 )
		   valores.add( params.viscosidad808 )
		   valores.add( params.viscosidad1008 )
		   valores.add( params.viscosidad1208 )
		   valores.add( params.viscosidad1408 )
		   valores.add( params.nitrogeno8 )
		   valores.add( params.aluminio8 )
		   valores.add( params.niquel8 )
		   valores.add( params.vanadio8 )
		   valores.add( params.hierro8 )
		   valores.add( params.cobre8 )
		   valores.add( params.magnesio8 )
		   valores.add( params.calcio8 )
		   valores.add( params.sodio8 )

		   
		   for( int i = 0; i < valores.size( ); i++ ){
			   
			   if( valores.get( i ) == null || valores.get( i ) == '' ){
				   valores[i] = '0';
			   }
			   
		   }
		   
		   
		   
		   fraccion8.muestra = muestr;
		   fraccion8.rendimiento = Float.parseFloat( valores.get( 0 ) ) ;
		   fraccion8.azufre	= Float.parseFloat( valores.get( 1 ) );
		   fraccion8.cenizas = Float.parseFloat( valores.get( 2 ) );
		   fraccion8.asfaltenos	= Float.parseFloat( valores.get( 3 ) );
		   fraccion8.viscosidad40 = Float.parseFloat( valores.get( 4 ) );
		   fraccion8.viscosidad50 = Float.parseFloat( valores.get( 5 ) );
		   fraccion8.viscosidad80 = Float.parseFloat( valores.get( 6 ) );
		   fraccion8.viscosidad100 = Float.parseFloat( valores.get( 7 ) );
		   fraccion8.viscosidad120 = Float.parseFloat( valores.get( 8 ) );
		   fraccion8.viscosidad140 = Float.parseFloat( valores.get( 9 ) );
		   fraccion8.nitrogenoTotal = 0;
		   fraccion8.nitrogenoBasico = Float.parseFloat( valores.get( 10 ) );
		   fraccion8.aluminio = Float.parseFloat( valores.get( 11 ) );
		   fraccion8.niquel	= Float.parseFloat( valores.get( 12 ) );
		   fraccion8.vanadio = Float.parseFloat( valores.get( 13 ) );
		   fraccion8.hierro	= Float.parseFloat( valores.get( 14 ) );
		   fraccion8.cobre = Float.parseFloat( valores.get( 15 ) );
		   fraccion8.magnesio = Float.parseFloat( valores.get( 16 ) );
		   fraccion8.calcio	= Float.parseFloat( valores.get( 17 ) );
		   fraccion8.sodio	= Float.parseFloat( valores.get( 18 ) );
		   
		   //Fraccion 9
		   
		   Fraccion fraccion9 = new Fraccion( );
		   
		   valores = [];
		   
		   valores.add( params.rendimiento9 )
		   valores.add( params.azufre9 )
		   valores.add( params.cenizas9 )
		   valores.add( params.asfaltenos9 )
		   valores.add( params.viscosidad409 )
		   valores.add( params.viscosidad509 )
		   valores.add( params.viscosidad809 )
		   valores.add( params.viscosidad1009 )
		   valores.add( params.viscosidad1209 )
		   valores.add( params.viscosidad1409 )
		   valores.add( params.nitrogeno9 )
		   valores.add( params.aluminio9 )
		   valores.add( params.niquel9 )
		   valores.add( params.vanadio9 )
		   valores.add( params.hierro9 )
		   valores.add( params.cobre9 )
		   valores.add( params.magnesio9 )
		   valores.add( params.calcio9 )
		   valores.add( params.sodio9 )

		   
		   for( int i = 0; i < valores.size( ); i++ ){
			   
			   if( valores.get( i ) == null || valores.get( i ) == '' ){
				   valores[i] = '0';
			   }
			   
		   }
		   
		   
		   
		   fraccion9.muestra = muestr;
		   fraccion9.rendimiento = Float.parseFloat( valores.get( 0 ) ) ;
		   fraccion9.azufre	= Float.parseFloat( valores.get( 1 ) );
		   fraccion9.cenizas = Float.parseFloat( valores.get( 2 ) );
		   fraccion9.asfaltenos	= Float.parseFloat( valores.get( 3 ) );
		   fraccion9.viscosidad40 = Float.parseFloat( valores.get( 4 ) );
		   fraccion9.viscosidad50 = Float.parseFloat( valores.get( 5 ) );
		   fraccion9.viscosidad80 = Float.parseFloat( valores.get( 6 ) );
		   fraccion9.viscosidad100 = Float.parseFloat( valores.get( 7 ) );
		   fraccion9.viscosidad120 = Float.parseFloat( valores.get( 8 ) );
		   fraccion9.viscosidad140 = Float.parseFloat( valores.get( 9 ) );
		   fraccion9.nitrogenoTotal = 0;
		   fraccion9.nitrogenoBasico = Float.parseFloat( valores.get( 10 ) );
		   fraccion9.aluminio = Float.parseFloat( valores.get( 11 ) );
		   fraccion9.niquel	= Float.parseFloat( valores.get( 12 ) );
		   fraccion9.vanadio = Float.parseFloat( valores.get( 13 ) );
		   fraccion9.hierro	= Float.parseFloat( valores.get( 14 ) );
		   fraccion9.cobre = Float.parseFloat( valores.get( 15 ) );
		   fraccion9.magnesio = Float.parseFloat( valores.get( 16 ) );
		   fraccion9.calcio	= Float.parseFloat( valores.get( 17 ) );
		   fraccion9.sodio	= Float.parseFloat( valores.get( 18 ) );
		   
		   
		   //Fraccion 10
		   
		   Fraccion fraccion10 = new Fraccion( );
		   
		   valores = [];
		   
		   valores.add( params.rendimiento10 )
		   valores.add( params.azufre10 )
		   valores.add( params.cenizas10 )
		   valores.add( params.asfaltenos10 )
		   valores.add( params.viscosidad4010 )
		   valores.add( params.viscosidad5010 )
		   valores.add( params.viscosidad8010 )
		   valores.add( params.viscosidad10010 )
		   valores.add( params.viscosidad12010 )
		   valores.add( params.viscosidad14010 )
		   valores.add( params.nitrogeno10 )
		   valores.add( params.aluminio10 )
		   valores.add( params.niquel10 )
		   valores.add( params.vanadio10 )
		   valores.add( params.hierro10 )
		   valores.add( params.cobre10 )
		   valores.add( params.magnesio10 )
		   valores.add( params.calcio10 )
		   valores.add( params.sodio10 )

		   
		   for( int i = 0; i < valores.size( ); i++ ){
			   
			   if( valores.get( i ) == null || valores.get( i ) == '' ){
				   valores[i] = '0';
			   }
			   
		   }
		   
		   
		   
		   fraccion10.muestra = muestr;
		   fraccion10.rendimiento = Float.parseFloat( valores.get( 0 ) ) ;
		   fraccion10.azufre	= Float.parseFloat( valores.get( 1 ) );
		   fraccion10.cenizas = Float.parseFloat( valores.get( 2 ) );
		   fraccion10.asfaltenos	= Float.parseFloat( valores.get( 3 ) );
		   fraccion10.viscosidad40 = Float.parseFloat( valores.get( 4 ) );
		   fraccion10.viscosidad50 = Float.parseFloat( valores.get( 5 ) );
		   fraccion10.viscosidad80 = Float.parseFloat( valores.get( 6 ) );
		   fraccion10.viscosidad100 = Float.parseFloat( valores.get( 7 ) );
		   fraccion10.viscosidad120 = Float.parseFloat( valores.get( 8 ) );
		   fraccion10.viscosidad140 = Float.parseFloat( valores.get( 9 ) );
		   fraccion10.nitrogenoTotal = 0;
		   fraccion10.nitrogenoBasico = Float.parseFloat( valores.get( 10 ) );
		   fraccion10.aluminio = Float.parseFloat( valores.get( 11 ) );
		   fraccion10.niquel	= Float.parseFloat( valores.get( 12 ) );
		   fraccion10.vanadio = Float.parseFloat( valores.get( 13 ) );
		   fraccion10.hierro	= Float.parseFloat( valores.get( 14 ) );
		   fraccion10.cobre = Float.parseFloat( valores.get( 15 ) );
		   fraccion10.magnesio = Float.parseFloat( valores.get( 16 ) );
		   fraccion10.calcio	= Float.parseFloat( valores.get( 17 ) );
		   fraccion10.sodio	= Float.parseFloat( valores.get( 18 ) );
		   
		   //Fraccion 11
		   
		   Fraccion fraccion11 = new Fraccion( );
		   
		   valores = [];
		   
		   valores.add( params.rendimiento11 )
		   valores.add( params.azufre11 )
		   valores.add( params.cenizas11 )
		   valores.add( params.asfaltenos11 )
		   valores.add( params.viscosidad4011 )
		   valores.add( params.viscosidad5011 )
		   valores.add( params.viscosidad8011 )
		   valores.add( params.viscosidad10011 )
		   valores.add( params.viscosidad12011 )
		   valores.add( params.viscosidad14011 )
		   valores.add( params.nitrogeno11 )
		   valores.add( params.aluminio11 )
		   valores.add( params.niquel11 )
		   valores.add( params.vanadio11 )
		   valores.add( params.hierro11 )
		   valores.add( params.cobre11 )
		   valores.add( params.magnesio11 )
		   valores.add( params.calcio11 )
		   valores.add( params.sodio11 )

		   
		   for( int i = 0; i < valores.size( ); i++ ){
			   
			   if( valores.get( i ) == null || valores.get( i ) == '' ){
				   valores[i] = '0';
			   }
			   
		   }
		   
		   
		   
		   fraccion11.muestra = muestr;
		   fraccion11.rendimiento = Float.parseFloat( valores.get( 0 ) ) ;
		   fraccion11.azufre	= Float.parseFloat( valores.get( 1 ) );
		   fraccion11.cenizas = Float.parseFloat( valores.get( 2 ) );
		   fraccion11.asfaltenos	= Float.parseFloat( valores.get( 3 ) );
		   fraccion11.viscosidad40 = Float.parseFloat( valores.get( 4 ) );
		   fraccion11.viscosidad50 = Float.parseFloat( valores.get( 5 ) );
		   fraccion11.viscosidad80 = Float.parseFloat( valores.get( 6 ) );
		   fraccion11.viscosidad100 = Float.parseFloat( valores.get( 7 ) );
		   fraccion11.viscosidad120 = Float.parseFloat( valores.get( 8 ) );
		   fraccion11.viscosidad140 = Float.parseFloat( valores.get( 9 ) );
		   fraccion11.nitrogenoTotal = 0;
		   fraccion11.nitrogenoBasico = Float.parseFloat( valores.get( 10 ) );
		   fraccion11.aluminio = Float.parseFloat( valores.get( 11 ) );
		   fraccion11.niquel	= Float.parseFloat( valores.get( 12 ) );
		   fraccion11.vanadio = Float.parseFloat( valores.get( 13 ) );
		   fraccion11.hierro	= Float.parseFloat( valores.get( 14 ) );
		   fraccion11.cobre = Float.parseFloat( valores.get( 15 ) );
		   fraccion11.magnesio = Float.parseFloat( valores.get( 16 ) );
		   fraccion11.calcio	= Float.parseFloat( valores.get( 17 ) );
		   fraccion11.sodio	= Float.parseFloat( valores.get( 18 ) );
		   
		   //fraccion1.save(flush: true, failOnError: true);
		   //[resource:fraccion1, action:'save']
		   fraccion1.save(flush: true)
		   fraccion2.save(flush: true)
		   fraccion3.save(flush: true)
		   fraccion4.save(flush: true)
		   fraccion5.save(flush: true)
		   fraccion6.save(flush: true)
		   fraccion7.save(flush: true)
		   fraccion8.save(flush: true)
		   fraccion9.save(flush: true)
		   fraccion10.save(flush: true)
		   fraccion11.save(flush: true)
		   
		   redirect (controller: "ingeniero", action: 'index')
		}
	}
	
    @Transactional(readOnly=false)
    def save(Fraccion fraccionInstance) {
        if (fraccionInstance == null) {
            notFound()
            return
        }

        if (fraccionInstance.hasErrors()) {
            respond fraccionInstance.errors, view:'create'
            return
        }

        fraccionInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'fraccion.label', default: 'Fraccion'), fraccionInstance.id])
                redirect fraccionInstance
            }
            '*' { respond fraccionInstance, [status: CREATED] }
        }
    }
	
	def modify( ){
		
	}
	
	@Transactional
	def insert( ){
		
		if( session.role < 2 ){
			flash.message = "Authentication needed!"
			redirect (controller: "user", action: 'index')
		 }else{
		   
		    def fracc = []  
		    fracc = Fraccion.findAllByMuestra( session.muestra )
			
			for( int i = 0; i < fracc.size( ); i++ ){
				
				fracc.get( i ).delete flush:true
				
			}
			
			int busqueda = 1;
		 
			//Fraccion 1
			
			Fraccion fraccion1 = new Fraccion( );
			Muestra muestr = session.muestra;
			
			def valores = [];
			
			valores.add( params.rendimiento1 )
			valores.add( params.azufre1 )
			valores.add( params.cenizas1 )
			valores.add( params.asfaltenos1 )
			valores.add( params.viscosidad401 )
			valores.add( params.viscosidad501 )
			valores.add( params.viscosidad801 )
			valores.add( params.viscosidad1001 )
			valores.add( params.viscosidad1201 )
			valores.add( params.viscosidad1401 )
			valores.add( params.nitrogeno1 )
			valores.add( params.aluminio1 )
			valores.add( params.niquel1 )
			valores.add( params.vanadio1 )
			valores.add( params.hierro1 )
			valores.add( params.cobre1 )
			valores.add( params.magnesio1 )
			valores.add( params.calcio1 )
			valores.add( params.sodio1 )
 
			
			for( int i = 0; i < valores.size( ); i++ ){
				
				if( valores.get( i ) == null || valores.get( i ) == '' ){
					valores[i] = '0';
				}
				
			}
			
			
			
			fraccion1.muestra = muestr;
			fraccion1.rendimiento = Float.parseFloat( valores.get( 0 ) ) ;
			fraccion1.azufre	= Float.parseFloat( valores.get( 1 ) );
			fraccion1.cenizas = Float.parseFloat( valores.get( 2 ) );
			fraccion1.asfaltenos	= Float.parseFloat( valores.get( 3 ) );
			fraccion1.viscosidad40 = Float.parseFloat( valores.get( 4 ) );
			fraccion1.viscosidad50 = Float.parseFloat( valores.get( 5 ) );
			fraccion1.viscosidad80 = Float.parseFloat( valores.get( 6 ) );
			fraccion1.viscosidad100 = Float.parseFloat( valores.get( 7 ) );
			fraccion1.viscosidad120 = Float.parseFloat( valores.get( 8 ) );
			fraccion1.viscosidad140 = Float.parseFloat( valores.get( 9 ) );
			fraccion1.nitrogenoTotal = 0;
			fraccion1.nitrogenoBasico = Float.parseFloat( valores.get( 10 ) );
			fraccion1.aluminio = Float.parseFloat( valores.get( 11 ) );
			fraccion1.niquel	= Float.parseFloat( valores.get( 12 ) );
			fraccion1.vanadio = Float.parseFloat( valores.get( 13 ) );
			fraccion1.hierro	= Float.parseFloat( valores.get( 14 ) );
			fraccion1.cobre = Float.parseFloat( valores.get( 15 ) );
			fraccion1.magnesio = Float.parseFloat( valores.get( 16 ) );
			fraccion1.calcio	= Float.parseFloat( valores.get( 17 ) );
			fraccion1.sodio	= Float.parseFloat( valores.get( 18 ) );
			
			
			//Fraccion 2
			
			Fraccion fraccion2 = new Fraccion( );
			
			valores = [];
			
			valores.add( params.rendimiento2 )
			valores.add( params.azufre2 )
			valores.add( params.cenizas2 )
			valores.add( params.asfaltenos2 )
			valores.add( params.viscosidad402 )
			valores.add( params.viscosidad502 )
			valores.add( params.viscosidad802 )
			valores.add( params.viscosidad1002 )
			valores.add( params.viscosidad1202 )
			valores.add( params.viscosidad1402 )
			valores.add( params.nitrogeno2 )
			valores.add( params.aluminio2 )
			valores.add( params.niquel2 )
			valores.add( params.vanadio2 )
			valores.add( params.hierro2 )
			valores.add( params.cobre2 )
			valores.add( params.magnesio2 )
			valores.add( params.calcio2 )
			valores.add( params.sodio2 )
 
			
			for( int i = 0; i < valores.size( ); i++ ){
				
				if( valores.get( i ) == null || valores.get( i ) == '' ){
					valores[i] = '0';
				}
				
			}
			
			
			
			fraccion2.muestra = muestr;
			fraccion2.rendimiento = Float.parseFloat( valores.get( 0 ) ) ;
			fraccion2.azufre	= Float.parseFloat( valores.get( 1 ) );
			fraccion2.cenizas = Float.parseFloat( valores.get( 2 ) );
			fraccion2.asfaltenos	= Float.parseFloat( valores.get( 3 ) );
			fraccion2.viscosidad40 = Float.parseFloat( valores.get( 4 ) );
			fraccion2.viscosidad50 = Float.parseFloat( valores.get( 5 ) );
			fraccion2.viscosidad80 = Float.parseFloat( valores.get( 6 ) );
			fraccion2.viscosidad100 = Float.parseFloat( valores.get( 7 ) );
			fraccion2.viscosidad120 = Float.parseFloat( valores.get( 8 ) );
			fraccion2.viscosidad140 = Float.parseFloat( valores.get( 9 ) );
			fraccion2.nitrogenoTotal = 0;
			fraccion2.nitrogenoBasico = Float.parseFloat( valores.get( 10 ) );
			fraccion2.aluminio = Float.parseFloat( valores.get( 11 ) );
			fraccion2.niquel	= Float.parseFloat( valores.get( 12 ) );
			fraccion2.vanadio = Float.parseFloat( valores.get( 13 ) );
			fraccion2.hierro	= Float.parseFloat( valores.get( 14 ) );
			fraccion2.cobre = Float.parseFloat( valores.get( 15 ) );
			fraccion2.magnesio = Float.parseFloat( valores.get( 16 ) );
			fraccion2.calcio	= Float.parseFloat( valores.get( 17 ) );
			fraccion2.sodio	= Float.parseFloat( valores.get( 18 ) );
			
			
			
			//Fraccion 3
			
			Fraccion fraccion3 = new Fraccion( );
			
			valores = [];
			
			valores.add( params.rendimiento3 )
			valores.add( params.azufre3 )
			valores.add( params.cenizas3 )
			valores.add( params.asfaltenos3 )
			valores.add( params.viscosidad403 )
			valores.add( params.viscosidad503 )
			valores.add( params.viscosidad803 )
			valores.add( params.viscosidad1003 )
			valores.add( params.viscosidad1203 )
			valores.add( params.viscosidad1403 )
			valores.add( params.nitrogeno3 )
			valores.add( params.aluminio3 )
			valores.add( params.niquel3 )
			valores.add( params.vanadio3 )
			valores.add( params.hierro3 )
			valores.add( params.cobre3 )
			valores.add( params.magnesio3 )
			valores.add( params.calcio3 )
			valores.add( params.sodio3 )
 
			
			for( int i = 0; i < valores.size( ); i++ ){
				
				if( valores.get( i ) == null || valores.get( i ) == '' ){
					valores[i] = '0';
				}
				
			}
			
			
			
			fraccion3.muestra = muestr;
			fraccion3.rendimiento = Float.parseFloat( valores.get( 0 ) ) ;
			fraccion3.azufre	= Float.parseFloat( valores.get( 1 ) );
			fraccion3.cenizas = Float.parseFloat( valores.get( 2 ) );
			fraccion3.asfaltenos	= Float.parseFloat( valores.get( 3 ) );
			fraccion3.viscosidad40 = Float.parseFloat( valores.get( 4 ) );
			fraccion3.viscosidad50 = Float.parseFloat( valores.get( 5 ) );
			fraccion3.viscosidad80 = Float.parseFloat( valores.get( 6 ) );
			fraccion3.viscosidad100 = Float.parseFloat( valores.get( 7 ) );
			fraccion3.viscosidad120 = Float.parseFloat( valores.get( 8 ) );
			fraccion3.viscosidad140 = Float.parseFloat( valores.get( 9 ) );
			fraccion3.nitrogenoTotal = 0;
			fraccion3.nitrogenoBasico = Float.parseFloat( valores.get( 10 ) );
			fraccion3.aluminio = Float.parseFloat( valores.get( 11 ) );
			fraccion3.niquel	= Float.parseFloat( valores.get( 12 ) );
			fraccion3.vanadio = Float.parseFloat( valores.get( 13 ) );
			fraccion3.hierro	= Float.parseFloat( valores.get( 14 ) );
			fraccion3.cobre = Float.parseFloat( valores.get( 15 ) );
			fraccion3.magnesio = Float.parseFloat( valores.get( 16 ) );
			fraccion3.calcio	= Float.parseFloat( valores.get( 17 ) );
			fraccion3.sodio	= Float.parseFloat( valores.get( 18 ) );
			
			
			//Fraccion 4
			
			Fraccion fraccion4 = new Fraccion( );
			
			valores = [];
			
			valores.add( params.rendimiento4 )
			valores.add( params.azufre4 )
			valores.add( params.cenizas4 )
			valores.add( params.asfaltenos4 )
			valores.add( params.viscosidad404 )
			valores.add( params.viscosidad504 )
			valores.add( params.viscosidad804 )
			valores.add( params.viscosidad1004 )
			valores.add( params.viscosidad1204 )
			valores.add( params.viscosidad1404 )
			valores.add( params.nitrogeno4 )
			valores.add( params.aluminio4 )
			valores.add( params.niquel4 )
			valores.add( params.vanadio4 )
			valores.add( params.hierro4 )
			valores.add( params.cobre4 )
			valores.add( params.magnesio4 )
			valores.add( params.calcio4 )
			valores.add( params.sodio4 )
 
			
			for( int i = 0; i < valores.size( ); i++ ){
				
				if( valores.get( i ) == null || valores.get( i ) == '' ){
					valores[i] = '0';
				}
				
			}
			
			
			
			fraccion4.muestra = muestr;
			fraccion4.rendimiento = Float.parseFloat( valores.get( 0 ) ) ;
			fraccion4.azufre	= Float.parseFloat( valores.get( 1 ) );
			fraccion4.cenizas = Float.parseFloat( valores.get( 2 ) );
			fraccion4.asfaltenos	= Float.parseFloat( valores.get( 3 ) );
			fraccion4.viscosidad40 = Float.parseFloat( valores.get( 4 ) );
			fraccion4.viscosidad50 = Float.parseFloat( valores.get( 5 ) );
			fraccion4.viscosidad80 = Float.parseFloat( valores.get( 6 ) );
			fraccion4.viscosidad100 = Float.parseFloat( valores.get( 7 ) );
			fraccion4.viscosidad120 = Float.parseFloat( valores.get( 8 ) );
			fraccion4.viscosidad140 = Float.parseFloat( valores.get( 9 ) );
			fraccion4.nitrogenoTotal = 0;
			fraccion4.nitrogenoBasico = Float.parseFloat( valores.get( 10 ) );
			fraccion4.aluminio = Float.parseFloat( valores.get( 11 ) );
			fraccion4.niquel	= Float.parseFloat( valores.get( 12 ) );
			fraccion4.vanadio = Float.parseFloat( valores.get( 13 ) );
			fraccion4.hierro	= Float.parseFloat( valores.get( 14 ) );
			fraccion4.cobre = Float.parseFloat( valores.get( 15 ) );
			fraccion4.magnesio = Float.parseFloat( valores.get( 16 ) );
			fraccion4.calcio	= Float.parseFloat( valores.get( 17 ) );
			fraccion4.sodio	= Float.parseFloat( valores.get( 18 ) );
			
			
			//Fraccion 5
			
			Fraccion fraccion5 = new Fraccion( );
			
			valores = [];
			
			valores.add( params.rendimiento5 )
			valores.add( params.azufre5 )
			valores.add( params.cenizas5 )
			valores.add( params.asfaltenos5 )
			valores.add( params.viscosidad405 )
			valores.add( params.viscosidad505 )
			valores.add( params.viscosidad805 )
			valores.add( params.viscosidad1005 )
			valores.add( params.viscosidad1205 )
			valores.add( params.viscosidad1405 )
			valores.add( params.nitrogeno5 )
			valores.add( params.aluminio5 )
			valores.add( params.niquel5 )
			valores.add( params.vanadio5 )
			valores.add( params.hierro5 )
			valores.add( params.cobre5 )
			valores.add( params.magnesio5 )
			valores.add( params.calcio5 )
			valores.add( params.sodio5 )
 
			
			for( int i = 0; i < valores.size( ); i++ ){
				
				if( valores.get( i ) == null || valores.get( i ) == '' ){
					valores[i] = '0';
				}
				
			}
			
			
			
			fraccion5.muestra = muestr;
			fraccion5.rendimiento = Float.parseFloat( valores.get( 0 ) ) ;
			fraccion5.azufre	= Float.parseFloat( valores.get( 1 ) );
			fraccion5.cenizas = Float.parseFloat( valores.get( 2 ) );
			fraccion5.asfaltenos	= Float.parseFloat( valores.get( 3 ) );
			fraccion5.viscosidad40 = Float.parseFloat( valores.get( 4 ) );
			fraccion5.viscosidad50 = Float.parseFloat( valores.get( 5 ) );
			fraccion5.viscosidad80 = Float.parseFloat( valores.get( 6 ) );
			fraccion5.viscosidad100 = Float.parseFloat( valores.get( 7 ) );
			fraccion5.viscosidad120 = Float.parseFloat( valores.get( 8 ) );
			fraccion5.viscosidad140 = Float.parseFloat( valores.get( 9 ) );
			fraccion5.nitrogenoTotal = 0;
			fraccion5.nitrogenoBasico = Float.parseFloat( valores.get( 10 ) );
			fraccion5.aluminio = Float.parseFloat( valores.get( 11 ) );
			fraccion5.niquel	= Float.parseFloat( valores.get( 12 ) );
			fraccion5.vanadio = Float.parseFloat( valores.get( 13 ) );
			fraccion5.hierro	= Float.parseFloat( valores.get( 14 ) );
			fraccion5.cobre = Float.parseFloat( valores.get( 15 ) );
			fraccion5.magnesio = Float.parseFloat( valores.get( 16 ) );
			fraccion5.calcio	= Float.parseFloat( valores.get( 17 ) );
			fraccion5.sodio	= Float.parseFloat( valores.get( 18 ) );
			
			
			//Fraccion 6
			
			Fraccion fraccion6 = new Fraccion( );
			
			valores = [];
			
			valores.add( params.rendimiento6 )
			valores.add( params.azufre6 )
			valores.add( params.cenizas6 )
			valores.add( params.asfaltenos6 )
			valores.add( params.viscosidad406 )
			valores.add( params.viscosidad506 )
			valores.add( params.viscosidad806 )
			valores.add( params.viscosidad1006 )
			valores.add( params.viscosidad1206 )
			valores.add( params.viscosidad1406 )
			valores.add( params.nitrogeno6 )
			valores.add( params.aluminio6 )
			valores.add( params.niquel6 )
			valores.add( params.vanadio6 )
			valores.add( params.hierro6 )
			valores.add( params.cobre6 )
			valores.add( params.magnesio6 )
			valores.add( params.calcio6 )
			valores.add( params.sodio6 )
 
			
			for( int i = 0; i < valores.size( ); i++ ){
				
				if( valores.get( i ) == null || valores.get( i ) == '' ){
					valores[i] = '0';
				}
				
			}
			
			
			
			fraccion6.muestra = muestr;
			fraccion6.rendimiento = Float.parseFloat( valores.get( 0 ) ) ;
			fraccion6.azufre	= Float.parseFloat( valores.get( 1 ) );
			fraccion6.cenizas = Float.parseFloat( valores.get( 2 ) );
			fraccion6.asfaltenos	= Float.parseFloat( valores.get( 3 ) );
			fraccion6.viscosidad40 = Float.parseFloat( valores.get( 4 ) );
			fraccion6.viscosidad50 = Float.parseFloat( valores.get( 5 ) );
			fraccion6.viscosidad80 = Float.parseFloat( valores.get( 6 ) );
			fraccion6.viscosidad100 = Float.parseFloat( valores.get( 7 ) );
			fraccion6.viscosidad120 = Float.parseFloat( valores.get( 8 ) );
			fraccion6.viscosidad140 = Float.parseFloat( valores.get( 9 ) );
			fraccion6.nitrogenoTotal = 0;
			fraccion6.nitrogenoBasico = Float.parseFloat( valores.get( 10 ) );
			fraccion6.aluminio = Float.parseFloat( valores.get( 11 ) );
			fraccion6.niquel	= Float.parseFloat( valores.get( 12 ) );
			fraccion6.vanadio = Float.parseFloat( valores.get( 13 ) );
			fraccion6.hierro	= Float.parseFloat( valores.get( 14 ) );
			fraccion6.cobre = Float.parseFloat( valores.get( 15 ) );
			fraccion6.magnesio = Float.parseFloat( valores.get( 16 ) );
			fraccion6.calcio	= Float.parseFloat( valores.get( 17 ) );
			fraccion6.sodio	= Float.parseFloat( valores.get( 18 ) );
			
			
			//Fraccion 7
			
			Fraccion fraccion7 = new Fraccion( );
			
			valores = [];
			
			valores.add( params.rendimiento7 )
			valores.add( params.azufre7 )
			valores.add( params.cenizas7 )
			valores.add( params.asfaltenos7 )
			valores.add( params.viscosidad407 )
			valores.add( params.viscosidad507 )
			valores.add( params.viscosidad807 )
			valores.add( params.viscosidad1007 )
			valores.add( params.viscosidad1207 )
			valores.add( params.viscosidad1407 )
			valores.add( params.nitrogeno7 )
			valores.add( params.aluminio7 )
			valores.add( params.niquel7 )
			valores.add( params.vanadio7 )
			valores.add( params.hierro7 )
			valores.add( params.cobre7 )
			valores.add( params.magnesio7 )
			valores.add( params.calcio7 )
			valores.add( params.sodio7 )
 
			
			for( int i = 0; i < valores.size( ); i++ ){
				
				if( valores.get( i ) == null || valores.get( i ) == '' ){
					valores[i] = '0';
				}
				
			}
			
			
			
			fraccion7.muestra = muestr;
			fraccion7.rendimiento = Float.parseFloat( valores.get( 0 ) ) ;
			fraccion7.azufre	= Float.parseFloat( valores.get( 1 ) );
			fraccion7.cenizas = Float.parseFloat( valores.get( 2 ) );
			fraccion7.asfaltenos	= Float.parseFloat( valores.get( 3 ) );
			fraccion7.viscosidad40 = Float.parseFloat( valores.get( 4 ) );
			fraccion7.viscosidad50 = Float.parseFloat( valores.get( 5 ) );
			fraccion7.viscosidad80 = Float.parseFloat( valores.get( 6 ) );
			fraccion7.viscosidad100 = Float.parseFloat( valores.get( 7 ) );
			fraccion7.viscosidad120 = Float.parseFloat( valores.get( 8 ) );
			fraccion7.viscosidad140 = Float.parseFloat( valores.get( 9 ) );
			fraccion7.nitrogenoTotal = 0;
			fraccion7.nitrogenoBasico = Float.parseFloat( valores.get( 10 ) );
			fraccion7.aluminio = Float.parseFloat( valores.get( 11 ) );
			fraccion7.niquel	= Float.parseFloat( valores.get( 12 ) );
			fraccion7.vanadio = Float.parseFloat( valores.get( 13 ) );
			fraccion7.hierro	= Float.parseFloat( valores.get( 14 ) );
			fraccion7.cobre = Float.parseFloat( valores.get( 15 ) );
			fraccion7.magnesio = Float.parseFloat( valores.get( 16 ) );
			fraccion7.calcio	= Float.parseFloat( valores.get( 17 ) );
			fraccion7.sodio	= Float.parseFloat( valores.get( 18 ) );
			
			
			//Fraccion 8
			
			Fraccion fraccion8 = new Fraccion( );
			
			valores = [];
			
			valores.add( params.rendimiento8 )
			valores.add( params.azufre8 )
			valores.add( params.cenizas8 )
			valores.add( params.asfaltenos8 )
			valores.add( params.viscosidad408 )
			valores.add( params.viscosidad508 )
			valores.add( params.viscosidad808 )
			valores.add( params.viscosidad1008 )
			valores.add( params.viscosidad1208 )
			valores.add( params.viscosidad1408 )
			valores.add( params.nitrogeno8 )
			valores.add( params.aluminio8 )
			valores.add( params.niquel8 )
			valores.add( params.vanadio8 )
			valores.add( params.hierro8 )
			valores.add( params.cobre8 )
			valores.add( params.magnesio8 )
			valores.add( params.calcio8 )
			valores.add( params.sodio8 )
 
			
			for( int i = 0; i < valores.size( ); i++ ){
				
				if( valores.get( i ) == null || valores.get( i ) == '' ){
					valores[i] = '0';
				}
				
			}
			
			
			
			fraccion8.muestra = muestr;
			fraccion8.rendimiento = Float.parseFloat( valores.get( 0 ) ) ;
			fraccion8.azufre	= Float.parseFloat( valores.get( 1 ) );
			fraccion8.cenizas = Float.parseFloat( valores.get( 2 ) );
			fraccion8.asfaltenos	= Float.parseFloat( valores.get( 3 ) );
			fraccion8.viscosidad40 = Float.parseFloat( valores.get( 4 ) );
			fraccion8.viscosidad50 = Float.parseFloat( valores.get( 5 ) );
			fraccion8.viscosidad80 = Float.parseFloat( valores.get( 6 ) );
			fraccion8.viscosidad100 = Float.parseFloat( valores.get( 7 ) );
			fraccion8.viscosidad120 = Float.parseFloat( valores.get( 8 ) );
			fraccion8.viscosidad140 = Float.parseFloat( valores.get( 9 ) );
			fraccion8.nitrogenoTotal = 0;
			fraccion8.nitrogenoBasico = Float.parseFloat( valores.get( 10 ) );
			fraccion8.aluminio = Float.parseFloat( valores.get( 11 ) );
			fraccion8.niquel	= Float.parseFloat( valores.get( 12 ) );
			fraccion8.vanadio = Float.parseFloat( valores.get( 13 ) );
			fraccion8.hierro	= Float.parseFloat( valores.get( 14 ) );
			fraccion8.cobre = Float.parseFloat( valores.get( 15 ) );
			fraccion8.magnesio = Float.parseFloat( valores.get( 16 ) );
			fraccion8.calcio	= Float.parseFloat( valores.get( 17 ) );
			fraccion8.sodio	= Float.parseFloat( valores.get( 18 ) );
			
			//Fraccion 9
			
			Fraccion fraccion9 = new Fraccion( );
			
			valores = [];
			
			valores.add( params.rendimiento9 )
			valores.add( params.azufre9 )
			valores.add( params.cenizas9 )
			valores.add( params.asfaltenos9 )
			valores.add( params.viscosidad409 )
			valores.add( params.viscosidad509 )
			valores.add( params.viscosidad809 )
			valores.add( params.viscosidad1009 )
			valores.add( params.viscosidad1209 )
			valores.add( params.viscosidad1409 )
			valores.add( params.nitrogeno9 )
			valores.add( params.aluminio9 )
			valores.add( params.niquel9 )
			valores.add( params.vanadio9 )
			valores.add( params.hierro9 )
			valores.add( params.cobre9 )
			valores.add( params.magnesio9 )
			valores.add( params.calcio9 )
			valores.add( params.sodio9 )
 
			
			for( int i = 0; i < valores.size( ); i++ ){
				
				if( valores.get( i ) == null || valores.get( i ) == '' ){
					valores[i] = '0';
				}
				
			}
			
			
			
			fraccion9.muestra = muestr;
			fraccion9.rendimiento = Float.parseFloat( valores.get( 0 ) ) ;
			fraccion9.azufre	= Float.parseFloat( valores.get( 1 ) );
			fraccion9.cenizas = Float.parseFloat( valores.get( 2 ) );
			fraccion9.asfaltenos	= Float.parseFloat( valores.get( 3 ) );
			fraccion9.viscosidad40 = Float.parseFloat( valores.get( 4 ) );
			fraccion9.viscosidad50 = Float.parseFloat( valores.get( 5 ) );
			fraccion9.viscosidad80 = Float.parseFloat( valores.get( 6 ) );
			fraccion9.viscosidad100 = Float.parseFloat( valores.get( 7 ) );
			fraccion9.viscosidad120 = Float.parseFloat( valores.get( 8 ) );
			fraccion9.viscosidad140 = Float.parseFloat( valores.get( 9 ) );
			fraccion9.nitrogenoTotal = 0;
			fraccion9.nitrogenoBasico = Float.parseFloat( valores.get( 10 ) );
			fraccion9.aluminio = Float.parseFloat( valores.get( 11 ) );
			fraccion9.niquel	= Float.parseFloat( valores.get( 12 ) );
			fraccion9.vanadio = Float.parseFloat( valores.get( 13 ) );
			fraccion9.hierro	= Float.parseFloat( valores.get( 14 ) );
			fraccion9.cobre = Float.parseFloat( valores.get( 15 ) );
			fraccion9.magnesio = Float.parseFloat( valores.get( 16 ) );
			fraccion9.calcio	= Float.parseFloat( valores.get( 17 ) );
			fraccion9.sodio	= Float.parseFloat( valores.get( 18 ) );
			
			
			//Fraccion 10
			
			Fraccion fraccion10 = new Fraccion( );
			
			valores = [];
			
			valores.add( params.rendimiento10 )
			valores.add( params.azufre10 )
			valores.add( params.cenizas10 )
			valores.add( params.asfaltenos10 )
			valores.add( params.viscosidad4010 )
			valores.add( params.viscosidad5010 )
			valores.add( params.viscosidad8010 )
			valores.add( params.viscosidad10010 )
			valores.add( params.viscosidad12010 )
			valores.add( params.viscosidad14010 )
			valores.add( params.nitrogeno10 )
			valores.add( params.aluminio10 )
			valores.add( params.niquel10 )
			valores.add( params.vanadio10 )
			valores.add( params.hierro10 )
			valores.add( params.cobre10 )
			valores.add( params.magnesio10 )
			valores.add( params.calcio10 )
			valores.add( params.sodio10 )
 
			
			for( int i = 0; i < valores.size( ); i++ ){
				
				if( valores.get( i ) == null || valores.get( i ) == '' ){
					valores[i] = '0';
				}
				
			}
			
			
			
			fraccion10.muestra = muestr;
			fraccion10.rendimiento = Float.parseFloat( valores.get( 0 ) ) ;
			fraccion10.azufre	= Float.parseFloat( valores.get( 1 ) );
			fraccion10.cenizas = Float.parseFloat( valores.get( 2 ) );
			fraccion10.asfaltenos	= Float.parseFloat( valores.get( 3 ) );
			fraccion10.viscosidad40 = Float.parseFloat( valores.get( 4 ) );
			fraccion10.viscosidad50 = Float.parseFloat( valores.get( 5 ) );
			fraccion10.viscosidad80 = Float.parseFloat( valores.get( 6 ) );
			fraccion10.viscosidad100 = Float.parseFloat( valores.get( 7 ) );
			fraccion10.viscosidad120 = Float.parseFloat( valores.get( 8 ) );
			fraccion10.viscosidad140 = Float.parseFloat( valores.get( 9 ) );
			fraccion10.nitrogenoTotal = 0;
			fraccion10.nitrogenoBasico = Float.parseFloat( valores.get( 10 ) );
			fraccion10.aluminio = Float.parseFloat( valores.get( 11 ) );
			fraccion10.niquel	= Float.parseFloat( valores.get( 12 ) );
			fraccion10.vanadio = Float.parseFloat( valores.get( 13 ) );
			fraccion10.hierro	= Float.parseFloat( valores.get( 14 ) );
			fraccion10.cobre = Float.parseFloat( valores.get( 15 ) );
			fraccion10.magnesio = Float.parseFloat( valores.get( 16 ) );
			fraccion10.calcio	= Float.parseFloat( valores.get( 17 ) );
			fraccion10.sodio	= Float.parseFloat( valores.get( 18 ) );
			
			//Fraccion 11
			
			Fraccion fraccion11 = new Fraccion( );
			
			valores = [];
			
			valores.add( params.rendimiento11 )
			valores.add( params.azufre11 )
			valores.add( params.cenizas11 )
			valores.add( params.asfaltenos11 )
			valores.add( params.viscosidad4011 )
			valores.add( params.viscosidad5011 )
			valores.add( params.viscosidad8011 )
			valores.add( params.viscosidad10011 )
			valores.add( params.viscosidad12011 )
			valores.add( params.viscosidad14011 )
			valores.add( params.nitrogeno11 )
			valores.add( params.aluminio11 )
			valores.add( params.niquel11 )
			valores.add( params.vanadio11 )
			valores.add( params.hierro11 )
			valores.add( params.cobre11 )
			valores.add( params.magnesio11 )
			valores.add( params.calcio11 )
			valores.add( params.sodio11 )
 
			
			for( int i = 0; i < valores.size( ); i++ ){
				
				if( valores.get( i ) == null || valores.get( i ) == '' ){
					valores[i] = '0';
				}
				
			}
			
			
			
			fraccion11.muestra = muestr;
			fraccion11.rendimiento = Float.parseFloat( valores.get( 0 ) ) ;
			fraccion11.azufre	= Float.parseFloat( valores.get( 1 ) );
			fraccion11.cenizas = Float.parseFloat( valores.get( 2 ) );
			fraccion11.asfaltenos	= Float.parseFloat( valores.get( 3 ) );
			fraccion11.viscosidad40 = Float.parseFloat( valores.get( 4 ) );
			fraccion11.viscosidad50 = Float.parseFloat( valores.get( 5 ) );
			fraccion11.viscosidad80 = Float.parseFloat( valores.get( 6 ) );
			fraccion11.viscosidad100 = Float.parseFloat( valores.get( 7 ) );
			fraccion11.viscosidad120 = Float.parseFloat( valores.get( 8 ) );
			fraccion11.viscosidad140 = Float.parseFloat( valores.get( 9 ) );
			fraccion11.nitrogenoTotal = 0;
			fraccion11.nitrogenoBasico = Float.parseFloat( valores.get( 10 ) );
			fraccion11.aluminio = Float.parseFloat( valores.get( 11 ) );
			fraccion11.niquel	= Float.parseFloat( valores.get( 12 ) );
			fraccion11.vanadio = Float.parseFloat( valores.get( 13 ) );
			fraccion11.hierro	= Float.parseFloat( valores.get( 14 ) );
			fraccion11.cobre = Float.parseFloat( valores.get( 15 ) );
			fraccion11.magnesio = Float.parseFloat( valores.get( 16 ) );
			fraccion11.calcio	= Float.parseFloat( valores.get( 17 ) );
			fraccion11.sodio	= Float.parseFloat( valores.get( 18 ) );
			
			//fraccion1.save(flush: true, failOnError: true);
			//[resource:fraccion1, action:'save']
			fraccion1.save(flush: true)
			fraccion2.save(flush: true)
			fraccion3.save(flush: true)
			fraccion4.save(flush: true)
			fraccion5.save(flush: true)
			fraccion6.save(flush: true)
			fraccion7.save(flush: true)
			fraccion8.save(flush: true)
			fraccion9.save(flush: true)
			fraccion10.save(flush: true)
			fraccion11.save(flush: true)
			
			redirect (controller: "ingeniero", action: 'index')
		 }
		
		
		
		
	}
	
	/*
	def modify2( ){
		
		Muestra muestra = Muestra.findById( 1 )
		def fracciones = [];
		fracciones = Fraccion.findAllByMuestra(  muestra, [sort:'id', order:'asc'] );
		
		session.muestra = Muestra.findById( 1 );
		
		//0
		
		rendimient0 = fracciones.get( 0 ).rendimiento;
		println rendimient0;
		double azufr0	= fracciones.get( 0 ).azufre;
		double ceniza0 = fracciones.get( 0 ).cenizas;
		double asfalteno0	= fracciones.get( 0 ).asfaltenos;
		double viscosida400 = fracciones.get( 0 ).viscosidad40;
		double viscosida500 = fracciones.get( 0 ).viscosidad50;
		double viscosida800 = fracciones.get( 0 ).viscosidad80;
		double viscosida1000 = fracciones.get( 0 ).viscosidad100;
		double viscosida1200 = fracciones.get( 0 ).viscosidad120;
		double viscosida1400 = fracciones.get( 0 ).viscosidad140;
		double nitrogenoBasic0 = fracciones.get( 0 ).nitrogenoBasico;
		double alumini0 = fracciones.get( 0 ).aluminio;
		double nique0	= fracciones.get( 0 ).niquel;
		double vanadi0 = fracciones.get( 0 ).vanadio;
		double hierr0	= fracciones.get( 0 ).hierro;
		double cobr0 = fracciones.get( 0 ).cobre;
		double magnesi0 = fracciones.get( 0 ).magnesio;
		double calci0	= fracciones.get( 0 ).calcio;
		double sodi0	= fracciones.get( 0 ).sodio;
		
		
		//1
		
		double rendimient1 = fracciones.get( 0 ).rendimiento;
		double azufr1	= fracciones.get( 0 ).azufre;
		double ceniza1 = fracciones.get( 0 ).cenizas;
		double asfalteno1	= fracciones.get( 0 ).asfaltenos;
		double viscosida401 = fracciones.get( 0 ).viscosidad40;
		double viscosida501 = fracciones.get( 0 ).viscosidad50;
		double viscosida801 = fracciones.get( 0 ).viscosidad80;
		double viscosida1001 = fracciones.get( 0 ).viscosidad100;
		double viscosida1201 = fracciones.get( 0 ).viscosidad120;
		double viscosida1401 = fracciones.get( 0 ).viscosidad140;
		double nitrogenoBasic1 = fracciones.get( 0 ).nitrogenoBasico;
		double alumini1 = fracciones.get( 0 ).aluminio;
		double nique1	= fracciones.get( 0 ).niquel;
		double vanadi1 = fracciones.get( 0 ).vanadio;
		double hierr1	= fracciones.get( 0 ).hierro;
		double cobr1 = fracciones.get( 0 ).cobre;
		double magnesi1 = fracciones.get( 0 ).magnesio;
		double calci1	= fracciones.get( 0 ).calcio;
		double sodi1	= fracciones.get( 0 ).sodio;
		
		//2
		
		double rendimient2 = fracciones.get( 2 ).rendimiento;
		double azufr2	= fracciones.get( 2 ).azufre;
		double ceniza2 = fracciones.get( 2 ).cenizas;
		double asfalteno2	= fracciones.get( 2 ).asfaltenos;
		double viscosida402 = fracciones.get( 2 ).viscosidad40;
		double viscosida502 = fracciones.get( 2 ).viscosidad50;
		double viscosida802 = fracciones.get( 2 ).viscosidad80;
		double viscosida1002 = fracciones.get( 2 ).viscosidad100;
		double viscosida1202 = fracciones.get( 2 ).viscosidad120;
		double viscosida1402 = fracciones.get( 2 ).viscosidad140;
		double nitrogenoBasic2 = fracciones.get( 2 ).nitrogenoBasico;
		double alumini2 = fracciones.get( 2 ).aluminio;
		double nique2	= fracciones.get( 2 ).niquel;
		double vanadi2 = fracciones.get( 2 ).vanadio;
		double hierr2	= fracciones.get( 2 ).hierro;
		double cobr2 = fracciones.get( 2 ).cobre;
		double magnesi2 = fracciones.get( 2 ).magnesio;
		double calci2	= fracciones.get( 2 ).calcio;
		double sodi2	= fracciones.get( 2 ).sodio;
		
		//3
		
		double rendimient3 = fracciones.get( 3 ).rendimiento;
		double azufr3	= fracciones.get( 3 ).azufre;
		double ceniza3 = fracciones.get( 3 ).cenizas;
		double asfalteno3	= fracciones.get( 3 ).asfaltenos;
		double viscosida403 = fracciones.get( 3 ).viscosidad40;
		double viscosida503 = fracciones.get( 3 ).viscosidad50;
		double viscosida803 = fracciones.get( 3 ).viscosidad80;
		double viscosida1003 = fracciones.get( 3 ).viscosidad100;
		double viscosida1203 = fracciones.get( 3 ).viscosidad120;
		double viscosida1403 = fracciones.get( 3 ).viscosidad140;
		double nitrogenoBasic3 = fracciones.get( 3 ).nitrogenoBasico;
		double alumini3 = fracciones.get( 3 ).aluminio;
		double nique3	= fracciones.get( 3 ).niquel;
		double vanadi3 = fracciones.get( 3 ).vanadio;
		double hierr3	= fracciones.get( 3 ).hierro;
		double cobr3 = fracciones.get( 3 ).cobre;
		double magnesi3 = fracciones.get( 3 ).magnesio;
		double calci3	= fracciones.get( 3 ).calcio;
		double sodi3	= fracciones.get( 3 ).sodio;
		
		//4
		
		double rendimient4 = fracciones.get( 4 ).rendimiento;
		double azufr4	= fracciones.get( 4 ).azufre;
		double ceniza4 = fracciones.get( 4 ).cenizas;
		double asfalteno4	= fracciones.get( 4 ).asfaltenos;
		double viscosida404 = fracciones.get( 4 ).viscosidad40;
		double viscosida504 = fracciones.get( 4 ).viscosidad50;
		double viscosida804 = fracciones.get( 4 ).viscosidad80;
		double viscosida1004 = fracciones.get( 4 ).viscosidad100;
		double viscosida1204 = fracciones.get( 4 ).viscosidad120;
		double viscosida1404 = fracciones.get( 4 ).viscosidad140;
		double nitrogenoBasic4 = fracciones.get( 4 ).nitrogenoBasico;
		double alumini4 = fracciones.get( 4 ).aluminio;
		double nique4	= fracciones.get( 4 ).niquel;
		double vanadi4 = fracciones.get( 4 ).vanadio;
		double hierr4	= fracciones.get( 4 ).hierro;
		double cobr4 = fracciones.get( 4 ).cobre;
		double magnesi4 = fracciones.get( 4 ).magnesio;
		double calci4	= fracciones.get( 4 ).calcio;
		double sodi4	= fracciones.get( 4 ).sodio;
		
		//5
		
		double rendimient5 = fracciones.get( 5 ).rendimiento;
		double azufr5	= fracciones.get( 5 ).azufre;
		double ceniza5 = fracciones.get( 5 ).cenizas;
		double asfalteno5	= fracciones.get( 5 ).asfaltenos;
		double viscosida405 = fracciones.get( 5 ).viscosidad40;
		double viscosida505 = fracciones.get( 5 ).viscosidad50;
		double viscosida805 = fracciones.get( 5 ).viscosidad80;
		double viscosida1005 = fracciones.get( 5 ).viscosidad100;
		double viscosida1205 = fracciones.get( 5 ).viscosidad120;
		double viscosida1405 = fracciones.get( 5 ).viscosidad140;
		double nitrogenoBasic5 = fracciones.get( 5 ).nitrogenoBasico;
		double alumini5 = fracciones.get( 5 ).aluminio;
		double nique5	= fracciones.get( 5 ).niquel;
		double vanadi5 = fracciones.get( 5 ).vanadio;
		double hierr5	= fracciones.get( 5 ).hierro;
		double cobr5 = fracciones.get( 5 ).cobre;
		double magnesi5 = fracciones.get( 5 ).magnesio;
		double calci5	= fracciones.get( 5 ).calcio;
		double sodi5	= fracciones.get( 5 ).sodio;
		
		//6
		
		double rendimient6 = fracciones.get( 6 ).rendimiento;
		double azufr6	= fracciones.get( 6 ).azufre;
		double ceniza6 = fracciones.get( 6 ).cenizas;
		double asfalteno6	= fracciones.get( 6 ).asfaltenos;
		double viscosida406 = fracciones.get( 6 ).viscosidad40;
		double viscosida506 = fracciones.get( 6 ).viscosidad50;
		double viscosida806 = fracciones.get( 6 ).viscosidad80;
		double viscosida1006 = fracciones.get( 6 ).viscosidad100;
		double viscosida1206 = fracciones.get( 6 ).viscosidad120;
		double viscosida1406 = fracciones.get( 6 ).viscosidad140;
		double nitrogenoBasic6 = fracciones.get( 6 ).nitrogenoBasico;
		double alumini6 = fracciones.get( 6 ).aluminio;
		double nique6	= fracciones.get( 6 ).niquel;
		double vanadi6 = fracciones.get( 6 ).vanadio;
		double hierr6	= fracciones.get( 6 ).hierro;
		double cobr6 = fracciones.get( 6 ).cobre;
		double magnesi6 = fracciones.get( 6 ).magnesio;
		double calci6	= fracciones.get( 6 ).calcio;
		double sodi6	= fracciones.get( 6 ).sodio;
		
		
		//7
		
		double rendimient7 = fracciones.get( 7 ).rendimiento;
		double azufr7	= fracciones.get( 7 ).azufre;
		double ceniza7 = fracciones.get( 7 ).cenizas;
		double asfalteno7	= fracciones.get( 7 ).asfaltenos;
		double viscosida407 = fracciones.get( 7 ).viscosidad40;
		double viscosida507 = fracciones.get( 7 ).viscosidad50;
		double viscosida807 = fracciones.get( 7 ).viscosidad80;
		double viscosida1007 = fracciones.get( 7 ).viscosidad100;
		double viscosida1207 = fracciones.get( 7 ).viscosidad120;
		double viscosida1407 = fracciones.get( 7 ).viscosidad140;
		double nitrogenoBasic7 = fracciones.get( 7 ).nitrogenoBasico;
		double alumini7 = fracciones.get( 7 ).aluminio;
		double nique7	= fracciones.get( 7 ).niquel;
		double vanadi7 = fracciones.get( 7 ).vanadio;
		double hierr7	= fracciones.get( 7 ).hierro;
		double cobr7 = fracciones.get( 7 ).cobre;
		double magnesi7 = fracciones.get( 7 ).magnesio;
		double calci7	= fracciones.get( 7 ).calcio;
		double sodi7	= fracciones.get( 7 ).sodio;
		
		//8
		
		double rendimient8 = fracciones.get( 8 ).rendimiento;
		double azufr8	= fracciones.get( 8 ).azufre;
		double ceniza8 = fracciones.get( 8 ).cenizas;
		double asfalteno8	= fracciones.get( 8 ).asfaltenos;
		double viscosida408 = fracciones.get( 8 ).viscosidad40;
		double viscosida508 = fracciones.get( 8 ).viscosidad50;
		double viscosida808 = fracciones.get( 8 ).viscosidad80;
		double viscosida1008 = fracciones.get( 8 ).viscosidad100;
		double viscosida1208 = fracciones.get( 8 ).viscosidad120;
		double viscosida1408 = fracciones.get( 8 ).viscosidad140;
		double nitrogenoBasic8 = fracciones.get( 8 ).nitrogenoBasico;
		double alumini8 = fracciones.get( 8 ).aluminio;
		double nique8	= fracciones.get( 8 ).niquel;
		double vanadi8 = fracciones.get( 8 ).vanadio;
		double hierr8	= fracciones.get( 8 ).hierro;
		double cobr8 = fracciones.get( 8 ).cobre;
		double magnesi8 = fracciones.get( 8 ).magnesio;
		double calci8	= fracciones.get( 8 ).calcio;
		double sodi8	= fracciones.get( 8 ).sodio;
		
		//9
		
		double rendimient9 = fracciones.get( 9 ).rendimiento;
		double azufr9	= fracciones.get( 9 ).azufre;
		double ceniza9 = fracciones.get( 9 ).cenizas;
		double asfalteno9	= fracciones.get( 9 ).asfaltenos;
		double viscosida409 = fracciones.get( 9 ).viscosidad40;
		double viscosida509 = fracciones.get( 9 ).viscosidad50;
		double viscosida809 = fracciones.get( 9 ).viscosidad80;
		double viscosida1009 = fracciones.get( 9 ).viscosidad100;
		double viscosida1209 = fracciones.get( 9 ).viscosidad120;
		double viscosida1409 = fracciones.get( 9 ).viscosidad140;
		double nitrogenoBasic9 = fracciones.get( 9 ).nitrogenoBasico;
		double alumini9 = fracciones.get( 9 ).aluminio;
		double nique9	= fracciones.get( 9 ).niquel;
		double vanadi9 = fracciones.get( 9 ).vanadio;
		double hierr9	= fracciones.get( 9 ).hierro;
		double cobr9 = fracciones.get( 9 ).cobre;
		double magnesi9 = fracciones.get( 9 ).magnesio;
		double calci9	= fracciones.get( 9 ).calcio;
		double sodi9	= fracciones.get( 9 ).sodio;
		
		//10
		
		double rendimient10 = fracciones.get( 10 ).rendimiento;
		double azufr10	= fracciones.get( 10 ).azufre;
		double ceniz10 = fracciones.get( 10 ).cenizas;
		double asfalteno10	= fracciones.get( 10 ).asfaltenos;
		double viscosida4010 = fracciones.get( 10 ).viscosidad40;
		double viscosida5010 = fracciones.get( 10 ).viscosidad50;
		double viscosida8010 = fracciones.get( 10 ).viscosidad80;
		double viscosida10010 = fracciones.get( 10 ).viscosidad100;
		double viscosida12010 = fracciones.get( 10 ).viscosidad120;
		double viscosida14010 = fracciones.get( 10 ).viscosidad140;
		double nitrogenoBasic10 = fracciones.get( 10 ).nitrogenoBasico;
		double alumini10 = fracciones.get( 10 ).aluminio;
		double nique10	= fracciones.get( 10 ).niquel;
		double vanadi10 = fracciones.get( 10 ).vanadio;
		double hierr10	= fracciones.get( 10 ).hierro;
		double cobr10 = fracciones.get( 10 ).cobre;
		double magnes10 = fracciones.get( 10 ).magnesio;
		double calci10	= fracciones.get( 10 ).calcio;
		double sodi10	= fracciones.get( 10 ).sodio;
		
		redirect( action: 'modify' );
		
	}
    */
	
    def edit(Fraccion fraccionInstance) {
        respond fraccionInstance
    }

    @Transactional
    def update(Fraccion fraccionInstance) {
        if (fraccionInstance == null) {
            notFound()
            return
        }

        if (fraccionInstance.hasErrors()) {
            respond fraccionInstance.errors, view:'edit'
            return
        }

        fraccionInstance.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Fraccion.label', default: 'Fraccion'), fraccionInstance.id])
                redirect fraccionInstance
            }
            '*'{ respond fraccionInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Fraccion fraccionInstance) {

        if (fraccionInstance == null) {
            notFound()
            return
        }

        fraccionInstance.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Fraccion.label', default: 'Fraccion'), fraccionInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'fraccion.label', default: 'Fraccion'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
