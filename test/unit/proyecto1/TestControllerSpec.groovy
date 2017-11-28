package proyecto1

import grails.test.mixin.TestFor
import junit.framework.*
import spock.lang.Specification
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */

class TestControllerSpec extends GroovyTestCase {

	@Test
	public void testAnalisis( ){
		
		Fraccion fraccion1 = new Fraccion( );
		fraccion1.rendimiento = 9;
		fraccion1.azufre = 1.2;
		fraccion1.viscosidad40 = 1;
		Fraccion fraccion2 = new Fraccion( );
		fraccion2.rendimiento = 8;
		fraccion2.azufre = 1.3;
		fraccion2.viscosidad40 = 2;
		Fraccion fraccion3 = new Fraccion( );
		fraccion3.rendimiento = 5;
		fraccion3.azufre = 0.3;
		fraccion3.viscosidad40 = 3;
		Fraccion fraccion4 = new Fraccion( );
		fraccion4.rendimiento = 4;
		fraccion4.azufre = 0.2;
		fraccion4.viscosidad40 = 4;
		Fraccion fraccion5 = new Fraccion( );
		fraccion5.rendimiento = 8;
		fraccion5.azufre = 0.8;
		fraccion5.viscosidad40 = 5;
		Fraccion fraccion6 = new Fraccion( );
		fraccion6.rendimiento = 7;
		fraccion6.azufre = 0.8;
		fraccion6.viscosidad40 = 6;
		Fraccion fraccion7 = new Fraccion( );
		fraccion7.rendimiento = 0;
		fraccion7.azufre = 0;
		fraccion7.viscosidad40 = 7;
		Fraccion fraccion8 = new Fraccion( );
		fraccion8.rendimiento = 3;
		fraccion8.azufre = 0.5;
		fraccion8.viscosidad40 = 8;
		Fraccion fraccion9 = new Fraccion( );
		fraccion9.rendimiento = 12;
		fraccion9.azufre = 1;
		fraccion9.viscosidad40 = 9;
		Fraccion fraccion10 = new Fraccion( );
		fraccion10.rendimiento = 15;
		fraccion10.azufre = 1.1;
		fraccion10.viscosidad40 = 10;
		Fraccion fraccion11 = new Fraccion( );
		fraccion11.rendimiento = 29;
		fraccion11.azufre = 1.2;
		fraccion11.viscosidad40 = 11;
		
		List<Fraccion> fracciones = [];
		fracciones.add( fraccion1 )
		fracciones.add( fraccion2 )
		fracciones.add( fraccion3 )
		fracciones.add( fraccion4 )
		fracciones.add( fraccion5 )
		fracciones.add( fraccion6 )
		fracciones.add( fraccion7 )
		fracciones.add( fraccion8 )
		fracciones.add( fraccion9 ) 
		fracciones.add( fraccion10 )
		fracciones.add( fraccion11 )
		int result = balance( fracciones )
	    
		
		assertTrue( result  < 90 && result < 110 );
		
		fracciones.get( 10 ).rendimiento = 0;
		result = balance( fracciones )
		
		assertTrue( result < 90 || result > 110 );
		
		assertTrue( viscosidad( fracciones )  )
		
		fracciones.get( 10 ).viscosidad40 = 1;
		
		assertTrue( viscosidad( fracciones ) == false )
		
		
	}
	
	public int balance( List<Fraccion> fracciones ){
		
		int resultado = 0;
		for (int i = 0; i < fracciones.size( ); i++ ){
			resultado += ( fracciones.get( i ).rendimiento * fracciones.get( i ).azufre )
		 }
		
		return resultado;
		
	}
	
	public boolean viscosidad( List<Fraccion> fracciones ){
		
		int visco40 = 0;
		boolean continuar = true
		
		for (frac in fracciones){
		   
		   if( frac.viscosidad40 != 0 && continuar ){
			  println frac.viscosidad40
			  println visco40
			  if( frac.viscosidad40 >= visco40 ){
				 visco40 = frac.viscosidad40
			  }else{
				 continuar = false
			  }
			  
		   }
		}
		
		if( continuar ){
			
			return true
			
		}else{
		   return false;
		}
		  
		
	}
  
	public static void main (String[] args)
	{
	  junit.textui.TestRunner.run(this);
	} // main
  
	
    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
    }
}
