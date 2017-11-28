package proyecto1

import grails.transaction.Transactional;


class TestController {

	AnalisisFraccion analisis;
	Muestra muestra;
	
    //def index() { }
	
	
	@Transactional
	def balance( ){
		Muestra instancia = Muestra.findByNombre( params.nombre )
		session.muestra = instancia;
		
		muestra = session.muestra;
		def fracciones = [];
		fracciones = Fraccion.findAllByMuestra(  muestra, [sort:'id', order:'asc'] );
		analisis = new AnalisisFraccion( );
		
		analisis.muestra = muestra

		for (int i = 0; i < fracciones.size( ); i++ ){
			fracciones.get(i).redimiento = 11
			analisis.balanceAzufre += ( fracciones.get( i ).rendimiento * fracciones.get( i ).azufre )
			analisis.balanceCenizas += ( fracciones.get( i ).rendimiento * fracciones.get( i ).cenizas )
			analisis.balanceAsfaltenos += ( fracciones.get( i ).rendimiento * fracciones.get( i ).asfaltenos )
			analisis.balanceCobre += ( fracciones.get( i ).rendimiento * fracciones.get( i ).cobre )
			analisis.balanceAluminio += ( fracciones.get( i ).rendimiento * fracciones.get( i ).aluminio )
			analisis.balanceNiquel += ( fracciones.get( i ).rendimiento * fracciones.get( i ).niquel )
			analisis.balanceVanadio += ( fracciones.get( i ).rendimiento * fracciones.get( i ).vanadio )
			analisis.balanceHierro += ( fracciones.get( i ).rendimiento * fracciones.get( i ).hierro )
			analisis.balanceMagnesio += ( fracciones.get( i ).rendimiento * fracciones.get( i ).magnesio )
			analisis.balanceCalcio += ( fracciones.get( i ).rendimiento * fracciones.get( i ).calcio )
			analisis.balanceSodio += ( fracciones.get( i ).rendimiento * fracciones.get( i ).sodio )
		 }
		
		
		//viscosidad
		
		int visco40 = 0, visco50 = 0, visco80 = 0, visco100 = 0, visco120 = 0, visco140 = 0;
		boolean continuar = true
		//println fracciones.size( )
		for (frac in fracciones){
		   
		   if( frac.viscosidad40 != 0 && continuar ){
			  println frac.viscosidad40
			  println visco40
			  if( frac.viscosidad40 < visco40 ){
				 visco40 = frac.viscosidad40
			  }else{
				 continuar = false
				 analisis.viscosidad = false;
			  }
			  
		   }
		   
		   if( frac.viscosidad50 != 0 && continuar ){
			   
			   if( frac.viscosidad50 >= visco50 ){
				  visco50 = frac.viscosidad50
			   }else{
				  continuar = false
				  analisis.viscosidad = false;
			   }
			   
			}
		   
		   if( frac.viscosidad80 != 0 && continuar ){
			   
			   if( frac.viscosidad80 < visco80 ){
				  visco80 = frac.viscosidad80
			   }else{
				  continuar = false
				  analisis.viscosidad = false;
			   }
			   
			}
		   
		   if( frac.viscosidad100 != 0 && continuar ){
			   
			   if( frac.viscosidad100 >= visco100 ){
				  visco100 = frac.viscosidad100
			   }else{
				  continuar = false
				  analisis.viscosidad = false;
			   }
			   
			}

		   if( frac.viscosidad120 != 0 && continuar ){
			   
			   if( frac.viscosidad120 < visco120 ){
				  visco120 = frac.viscosidad120
			   }else{
				  continuar = false
				  analisis.viscosidad = false;
			   }
			   
			}
		   
		   if( frac.viscosidad140 != 0 && continuar ){
			   
			   if( frac.viscosidad140 >= visco140 ){
				  visco140 = frac.viscosidad140
			   }else{
				  continuar = false
				  analisis.viscosidad = false;
			   }
			   
			}
			   
		}
		
		if( continuar ){
			
			analisis.viscosidad = true
			
		}
		
		
		
		//Nitrogeno
		
		
		
		//def fracciones = Fraccion.findByMuestra(  muestra, [sort:'id', order:'asc'] )
		def historicos = Historico.list()
		Historico historico
		int cercano = 0
		int dir = 0
		for( hist in historicos){
		   if (dir==0){
		
			  historico = hist
			  cercano++
			  dir++
		   }else{
			  if (Math.abs(hist.api - muestra.api) < Math.abs( historico.api - muestra.api)){
				 historico = hist;
		
			  }
			  cercano++
		   }
		}
		
		
		
		int MAXN = 1000;
		int n = 0;
		double[] x = new double[MAXN];
		double[] y = new double[MAXN];
		
		continuar = true;
		// first pass: read in data, compute xbar and ybar
		double sumx = 0.0, sumy = 0.0, sumx2 = 0.0;
		double we;
		
		def valorx = []
		valorx.add historico.nitrogenoBasicoACL
		valorx.add historico.nitrogenoBasicoACP
		valorx.add historico.nitrogenoBasicoDL
		valorx.add historico.nitrogenoBasicoDM
		valorx.add historico.nitrogenoBasicoDP
		
		 
		def valory = []

		valory.add historico.nitrogenoTotalACL
		valory.add historico.nitrogenoTotalACP
		valory.add historico.nitrogenoTotalDL
		valory.add historico.nitrogenoTotalDM
		valory.add historico.nitrogenoTotalDP
		
				
		for( int i = 0; i < valorx.size( ); i++ ){
				
		   if( valorx.get( i ) != 0 && valory.get( i ) ){
			  x[n] = valorx.get( i )
			  y[n] = valory.get( i )
			  sumx  += x[n];
			  sumx2 += x[n] * x[n];
			  sumy  += y[n];
			  n++;
			  }
		   
		}
		
		double xbar = sumx / n;
		double ybar = sumy / n;

		// second pass: compute summary statistics
		double xxbar = 0.0, yybar = 0.0, xybar = 0.0;
		for (int i = 0; i < n; i++) {
			xxbar += (x[i] - xbar) * (x[i] - xbar);
			yybar += (y[i] - ybar) * (y[i] - ybar);
			xybar += (x[i] - xbar) * (y[i] - ybar);
		}
		double beta1 = xybar / xxbar;
		double beta0 = ybar - beta1 * xbar;

		// print results
		println ("y   = " + beta1 + " * x + " + beta0) ;
        
		// analyze results
		int df = n - 2;
		double rss = 0.0;      // residual sum of squares
		double ssr = 0.0;      // regression sum of squares
		for (int i = 0; i < n; i++) {
			double fit = beta1*x[i] + beta0;
			rss += (fit - y[i]) * (fit - y[i]);
			ssr += (fit - ybar) * (fit - ybar);
		}
		double R2    = ssr / yybar;
		double svar  = rss / df;
		double svar1 = svar / xxbar;
		double svar0 = svar/n + xbar*xbar*svar1;
		
		def nitro = []
	
		double nitrogenoCalculado
		
		for( int i = 0; i < fracciones.size( ); i++ ){
		   nitrogenoCalculado = ( beta1 * fracciones.get( i ).nitrogenoBasico ) + beta0
		   nitro.add( nitrogenoCalculado )
		   
		}
		
		analisis.nitrogenoTotal1 = nitro.get( 0 );
		analisis.nitrogenoTotal2 = nitro.get( 1 );
		analisis.nitrogenoTotal3 = nitro.get( 2 );
		analisis.nitrogenoTotal4 = nitro.get( 3 );
		analisis.nitrogenoTotal5 = nitro.get( 4 );
		analisis.nitrogenoTotal6 = nitro.get( 5 );
		analisis.nitrogenoTotal7 = nitro.get( 6 );
		analisis.nitrogenoTotal8 = nitro.get( 7 );
		analisis.nitrogenoTotal9 = nitro.get( 8 );
		analisis.nitrogenoTotal10 = nitro.get( 9 );
		analisis.nitrogenoTotal11 = nitro.get( 10 );
		
		analisis.save(flush: true)
		
		int non = 0;
		int met = 0;
		int visco = 0;
		int nitrog = 0;
		
		if( analisis.balanceAzufre < 90 || analisis.balanceAzufre > 110 || analisis.balanceCenizas < 90 
			|| analisis.balanceCenizas > 110 || analisis.balanceAsfaltenos < 90 || analisis.balanceAsfaltenos > 110 ){
		
		   non = 0;
					
		}else{
		
		   non = 1;
		
	    }
		
		
		if( analisis.balanceAluminio < 90 || analisis.balanceAluminio > 110 || analisis.balanceNiquel < 90
			|| analisis.balanceNiquel > 110 || analisis.balanceVanadio < 90 || analisis.balanceVanadio > 110 ){
		
		   met = 0;
					
		}else{
		
		   met = 1;
		
		}
		
		if( analisis.balanceHierro < 90 || analisis.balanceHierro > 110 || analisis.balanceCobre < 90
			|| analisis.balanceCobre > 110 || analisis.balanceMagnesio < 90 || analisis.balanceMagnesio > 110 ){
		
		   met = 0;
					
		}else{
		
		   met = 1;
		
		}
		
		if( analisis.balanceCalcio > 90 || analisis.balanceCalcio < 110 || analisis.balanceSodio < 90
			|| analisis.balanceSodio > 110 ){
		
		   met = 0;
					
		}else{
		
		   met = 1;
		
		}
		
		if( analisis.viscosidad ){
	       visco = 1;
		}else{
		   visco = 0;
		}
		
		if( beta0 != 0 || beta1 ){
		   nitrog = 1; 
		}else{
		   nitrog = 0;
		}
		
		session.non = non;
		session.met = met;
		session.visco = visco;
		session.nitro = nitrog;
					
		redirect ( controller: 'test', action: 'resultadoIngeniero') 
				
		
	}

    def resultadoIngeniero( ){
		
		
	}
	
	@Transactional
	def delete( ){
	    
	   AnalisisFraccion analisis = AnalisisFraccion.findByMuestra( session.muestra );
	   if( analisis != null ){
		   
	      analisis.delete flush : true
		  redirect( controller: "ingeniero", action : 'index' )   
		   
	   }else{
	      flash.message = "Hubo un error porfavor solicite la eliminacion a los administradores"
	      redirect( controller: "Solicitud", action : 'create'  )
	   	   
	   }	
			
	}
	
	
	
}
