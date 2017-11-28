
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

class UseControllerSpec extends GroovyTestCase {

	
	@Test
	public void testAuthentication( ){
		int result = 0;
		result = testLogin( "gmtrum", "12345" );
		assertTrue( result == 2 )
		
		result = testLogin( "admin", "12345" );
		assertTrue( result == 4 )
		
		result = testLogin( "gmtrum", "1234" );
		assertTrue( result == 0 )

		result = testLogin( "admin", "1234" );
		assertTrue( result == 0 )
		
		result = testLogin( "administrador", "12345" );
		assertTrue( result == 0 )

		
	}
	
	public static void main (String[] args)
	{
	  junit.textui.TestRunner.run(this);
	} // main
  
	
	public int testLogin( String user, String passw ){
		
		String userna = user
		String pass = passw
		Usuario buscado = null
		
		if( userna.equals( "admin" ) || userna.equals( "gmtrum" ) ){
			
			buscado = new Usuario( )
			buscado.usuario = userna
		    buscado.password = "12345"
			
			if( userna.equals( "admin" ) ){
				
			   buscado.acceso = 4;
				
			}else{
			   
			   buscado.acceso = 2;
			
			}	
			
		}
     
		if( buscado != null ){
		  
		   if( buscado.password.equals( pass ) ){
			   switch( buscado.acceso ){
				  case 1:
					 return 1;
					 break;
				  case 2:
					 return 2;
					 break;
				  case 3:
					 return 3;
					 break;
				  case 4:
					 return 4;
					 break;
					  
			   }
			   
		   }else{
		   
			  return 0;
		   
		   }
		   
		}else{
		   
		   return 0;
		   
		}
		
		
		
	}
	
	
    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
    }
}
