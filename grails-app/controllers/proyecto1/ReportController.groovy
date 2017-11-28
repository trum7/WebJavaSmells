package proyecto1

import spock.lang.Specification
import de.nixosoft.jlr.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

class ReportController {


	
	
	
	
	
   def index() {
		File workingDirectory = new File("src/latexTemplates");
		Muestra instancia = Muestra.findByNombre( params.nombre )
		session.muestra = instancia;
		
		String Cliente = session.muestra.costumer.nombre
		String NombreMuestra = session.muestra.nombre
		String IdMuestra = (session.muestra).id
		AnalisisFraccion analisis = AnalisisFraccion.findByMuestra( session.muestra )
		boolean Viscosidad = analisis.viscosidad
		ArrayList<String> results = new ArrayList<String>()
		       
		File template = new File(workingDirectory.getAbsolutePath() + File.separator + "reportTemplate.tex");
		File tempDir = new File(workingDirectory.getAbsolutePath() + File.separator + "TexFiles");
		if (!tempDir.isDirectory()) {
			tempDir.mkdir();
		}
		String  TexNombre = "reportSample"+NombreMuestra +".tex"
		File texFile = new File(tempDir.getAbsolutePath() + File.separator + TexNombre);
		try {
			JLRConverter converter = new JLRConverter(workingDirectory);
		    converter.replace("CLIENTE",Cliente)
		    converter.replace("SAMPLE",NombreMuestra)
			converter.replace("ID",IdMuestra)	
			if (Viscosidad){
			   converter.replace("VISCOSIDAD"," ")
			}else{
			   converter.replace("VISCOSIDAD","no ")
			}
					 
			results.add( analisis.balanceAluminio )
			results.add( analisis.balanceNiquel )
			results.add( analisis.balanceVanadio )
			results.add( analisis.balanceHierro )
			results.add( analisis.balanceCobre )
			results.add( analisis.balanceMagnesio )
			results.add( analisis.balanceCalcio )
			results.add( analisis.balanceSodio )
			results.add( analisis.balanceAzufre )
			results.add( analisis.balanceCenizas )
			results.add( analisis.balanceAsfaltenos )
			results.add( analisis.nitrogenoTotal1 )
			results.add( analisis.nitrogenoTotal2 )
			results.add( analisis.nitrogenoTotal3 )
			results.add( analisis.nitrogenoTotal4 )
			results.add( analisis.nitrogenoTotal5 )
			results.add( analisis.nitrogenoTotal6 )
			results.add( analisis.nitrogenoTotal7 )
			results.add( analisis.nitrogenoTotal8 )
			results.add( analisis.nitrogenoTotal9 )
			results.add( analisis.nitrogenoTotal10 )
			results.add( analisis.nitrogenoTotal11 )
					 
			converter.replace("results",results)
				
			if (!converter.parse(template, texFile)) {
			   System.out.println(converter.getErrorMessage());
			}
			//File pdfDirectory = new File("src/reports");
			//tempDir = new File(workingDirectory.getAbsolutePath() + File.separator + "reports");
			//File reports = new File(pdfDirectory.getAbsolutePath());
			File reports = new File("src/reports");
		            
			JLRGenerator pdfGen = new JLRGenerator();
		 	if (!pdfGen.generate(texFile, reports, workingDirectory)) {
			   System.out.println(pdfGen.getErrorMessage());
			}
			
			redirect( controller: "viewReport", action: 'graphics' )
			
			
			
		
		} catch (IOException ex) {
			   System.err.println(ex.getMessage());
			   redirect( controller: "ingeniero", action: 'index' )
		}
		
		
	}
}
