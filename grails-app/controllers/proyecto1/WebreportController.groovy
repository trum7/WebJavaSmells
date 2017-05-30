package proyecto1

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

class WebreportController {

	def index(){
		
		def String[] cla = new String[2*session.classes.size()];
		def String[] attr = new String[1000];
		def String[] name = new String[session.classes.size()];
		def String[] inter = new String[session.interfaces.size()];
		def String[] meth = new String[session.methods.size()];
		def String[] imple = new String[4*session.classes.size()];
		def String[] largeClass = new String[2*session.classes.size()+2*session.interfaces.size()];
			int i = 0;
			int y = 0;
			int b = 0;
			int o = 0;
			ArrayList<LengthClass> lc = new ArrayList<LengthClass>();
			ArrayList<MethodLength> ml = new ArrayList<MethodLength>();
			ArrayList<VarNames> vn = new ArrayList<VarNames>();
			
		    Iterator it = (Iterator) session.classes.entrySet().iterator();
		    while (it.hasNext()) {
				int a = i;
		        Map.Entry pair = (Map.Entry)it.next();
				ClassInfo value = (ClassInfo) pair.getValue();
				System.out.println("Class" + pair.getKey() );
				System.out.println("Parents"+ " = " + value.extendsClass.toString());
				System.out.println("Implements"+ " = " + value.implementInterfaces.toString());
				System.out.println("References"+ " = " + value.referencesClasses.toString());
		        System.out.println(pair.getKey() + " = " + pair.getValue().toString());
				
				name[y] = "\"" + pair.getKey() + "\"";
				//System.out.println(name.toString());
				if( value.extendsClass.size() > 0 ){
					cla[a] = "\"" + pair.getKey() + "\"";
					a++;
					cla[a] = "\"" + value.extendsClass[0] + "\"";
					a++;
				}
				
				
				if( value.referencesClasses.size() > 0 ){
					attr[b] = "\"" + pair.getKey() + "\"";
					b++;
					def String[] at = new String[value.referencesClasses.size()];
					for(int t = 0; t<value.referencesClasses.size(); t++){

						at[t] = "\"" + value.referencesClasses.get(t) + "\"";

					}
					String cad = "[ " + at[0];
					for( int r = 1; r < at.length; r++ ){
						
						cad += " , " + at[r]
						
					}
					cad += " ]"
					attr[b] = cad;
					b++;
				}
				
				if( value.implementInterfaces.size() > 0 ){
					imple[o] = "\"" + pair.getKey() + "\"";
					o++;
					def String[] im = new String[value.implementInterfaces.size()];
					for( int g = 0; g < value.implementInterfaces.size(); g++){
						im[g] = "\"" + value.implementInterfaces.get(g) + "\"";
					}
					
					String cad1 = "[ " + im[0];
					for( int r = 1; r < im.length; r++ ){
						
						cad1 += " , " + im[r]
						
					}
					cad1 += " ]"
					imple[o] = cad1;
					o++;
				}
				
				
				y++;
				
				//Aqui finaliza lo del grafo
				
				//Comienzan a renderizar los conteos
				
				// Informacion de la clase 
				LengthClass lctemp = new LengthClass();
				lctemp.name = pair.getKey();
				lctemp.length = value.length;
				lctemp.messageChains = value.messageChain;
				lctemp.totalMethods = value.methods.size();
				lctemp.setGetter = value.setGetter;
				lctemp.isDataClass = value.isDataClass;
				lctemp.countAp = value.count;
				lc.add(lctemp);
				
				
				
				i+= 2;
		        it.remove(); // avoids a ConcurrentModificationException
		    }
			
			
			int num = 0;
			for(String t: cla){
				if( t != null){
					num++;
				}
				
			}
			
			def String[] cla1 = new String[num];

			int u = 0;
			for(String t: cla){
				if( t != null){
					cla1[u] = t;
					u++;
				}
				
			}
			
			
			Iterator it1 = (Iterator) session.interfaces.entrySet().iterator();
			i = 0;
			while (it1.hasNext()) {
				int a = i;
				Map.Entry pair = (Map.Entry)it1.next();
				InterfaceInfo value = (InterfaceInfo) pair.getValue();
				System.out.println(pair.getKey());
				inter[i] = "\"" + pair.getKey() + "\"";
				i++;
				
				/*LengthClass lctemp = new LengthClass();
				lctemp.name = pair.getKey();
				lctemp.length = value.length;
				lc.add(lctemp);*/
				
				
			}
			
			
			//Metodos
			Iterator it2 = (Iterator) session.methods.entrySet().iterator();
			i = 0;
			while (it2.hasNext()) {
				int a = i;
				Map.Entry pair = (Map.Entry)it2.next();
				MethodInfo value = (MethodInfo) pair.getValue();
				System.out.println(pair.getKey());
				//inter[i] = "\"" + pair.getKey() + "\"";
				//i++;
				
				//Metodo muy largo
				MethodLength mltemp = new MethodLength();
				mltemp.name = pair.getKey();
				mltemp.belongs = value.belongs;
				mltemp.length = value.length;
				mltemp.paramNum = value.paramNum;
				ml.add(mltemp);
				
				
			}
			
			//Nombres no comunicativos
			
			Iterator it3 = (Iterator) session.wrongName.entrySet().iterator();
			while (it3.hasNext()) {
//				int a = i;
				Map.Entry pair = (Map.Entry)it3.next();
				int value = (int) pair.getValue();
				System.out.println(pair.getKey());
				VarNames vntemp = new VarNames();
				vntemp.name = pair.getKey();
				vntemp.count = value; 
				vn.add(vntemp);		
				
			}
			
			
			
			
			[a:cla1,b:name,c:attr,d:inter,e:imple,largeClass:lc,methodlength:ml, varNames :vn]
			
	}
	
	
	
   def report() {
	   
		
	}
   
   
}


