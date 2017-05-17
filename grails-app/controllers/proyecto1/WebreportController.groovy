package proyecto1

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

class WebreportController {

	def index(){
		
		def String[] cla = new String[2*session.classes.size()];
			int i = 0;
		    Iterator it = (Iterator) session.classes.entrySet().iterator();
		    while (it.hasNext()) {
		        Map.Entry pair = (Map.Entry)it.next();
				ClassInfo value = (ClassInfo) pair.getValue();
				System.out.println("Class" + pair.getKey() );
				System.out.println("Parents"+ " = " + value.extendsClass.toString());
				System.out.println("Implements"+ " = " + value.implementInterfaces.toString());
				System.out.println("References"+ " = " + value.referencesClasses.toString());
		        System.out.println(pair.getKey() + " = " + pair.getValue().toString());
				
				cla[i] = "\"" + pair.getKey() + "\"";
				i++;
				cla[i] = "\"" + value.extendsClass[0] + "\"";
				i++;
				
		        it.remove(); // avoids a ConcurrentModificationException
		    }
			
			
			[a:cla]
			
	}
	
   def report() {
		
		
	}
   
   
}
