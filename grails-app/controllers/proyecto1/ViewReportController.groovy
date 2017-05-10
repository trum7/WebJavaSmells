package proyecto1
import java.awt.Desktop
import java.io.File

class ViewReportController {

    def showPDF() { 
		String nameSample = session.muestra.nombre 
		String namePDF = "reportSample" +nameSample+".pdf"
	   try{
		   
		   Desktop.getDesktop().open(new File("src/reports"+File.separator + namePDF))
		   redirect( controller: "viewReport", action: 'graphics')
		   
	   }catch(Exception ex){
	      println(ex)
		  flash.message = "Reporte no encontrado"
		  redirect( controller: "cliente", action: 'home' )
	   }	
	   
	}
	
	def graphics( ){
		
		Muestra mues = session.muestra;
		AnalisisFraccion analisis = AnalisisFraccion.findByMuestra( mues );
		
		def double[] intArray = new double[11]
		def double[] intArrayb = new double[11]
		def int[] intArrayc = [0]
		
		def fracciones = Fraccion.findAllByMuestra( mues ); 
		int i = 0;
		for( frac in fracciones ){
			intArray[i] = frac.nitrogenoBasico;
			i++;
		}
		
		intArrayb[0] = analisis.nitrogenoTotal1;
		intArrayb[1] = analisis.nitrogenoTotal2;
		intArrayb[2] = analisis.nitrogenoTotal3;
		intArrayb[3] = analisis.nitrogenoTotal4;
		intArrayb[4] = analisis.nitrogenoTotal5;
		intArrayb[5] = analisis.nitrogenoTotal6;
		intArrayb[6] = analisis.nitrogenoTotal7;
		intArrayb[7] = analisis.nitrogenoTotal8;
		intArrayb[8] = analisis.nitrogenoTotal9;
		intArrayb[9] = analisis.nitrogenoTotal10;
		intArrayb[10] = analisis.nitrogenoTotal11;
		
		
		[a:intArray ,b:intArrayb ,c:intArrayc ]
		
	}
	
	def showGraph( ){
	
	
	
    }
	
	def showTEX() {
		String nameSample = session.muestra.nombre
		String nameTex = "reportSample" +nameSample+".tex"
	   try{
		   
		   Desktop.getDesktop().open(new File("src/latexTemplates/TexFiles"+File.separator + nameTex))
		   redirect( controller: "viewReport", action: 'graphics')
		   
	   }catch(Exception ex){
		  println(ex)
		  flash.message = "Reporte no encontrado"
		  redirect( controller: "cliente", action: 'home' )
	   }
	}

	def graficar( ){
		
		Muestra mues = session.muestra;
		AnalisisFraccion analisis = AnalisisFraccion.findByMuestra( mues );
		
		def double[] intArray = new double[11]
		def double[] intArrayb = new double[11]
		def int[] intArrayc = [0]
		
		def fracciones = Fraccion.findAllByMuestra( mues );
		int i = 0;
		for( frac in fracciones ){
			intArray[i] = frac.nitrogenoBasico;
			i++;
		}
		
		intArrayb[0] = analisis.nitrogenoTotal1;
		intArrayb[1] = analisis.nitrogenoTotal2;
		intArrayb[2] = analisis.nitrogenoTotal3;
		intArrayb[3] = analisis.nitrogenoTotal4;
		intArrayb[4] = analisis.nitrogenoTotal5;
		intArrayb[5] = analisis.nitrogenoTotal6;
		intArrayb[6] = analisis.nitrogenoTotal7;
		intArrayb[7] = analisis.nitrogenoTotal8;
		intArrayb[8] = analisis.nitrogenoTotal9;
		intArrayb[9] = analisis.nitrogenoTotal10;
		intArrayb[10] = analisis.nitrogenoTotal11;
		
		
		[a:intArray ,b:intArrayb ,c:intArrayc ]
		
	}
		
}
