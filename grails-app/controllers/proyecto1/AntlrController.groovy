package proyecto1

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Iterator
import java.util.Map

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

class AntlrController {

	public static HashMap<String,Integer> lexemes;
	public static HashMap<String,Integer> attributes;
	public static HashMap<String,Integer> classes;
	
    def index() {
		
		
		try{
			
			Test main = new Test();
			
			String input1 = params.code;
			println input1;
			
//			System.setIn(new FileInputStream(new File("src/input.txt")));
			ANTLRInputStream input = new ANTLRInputStream(input1);
			Java8Lexer lexer= new Java8Lexer(input);
			// Identificar al analizador léxico como fuente de tokens para el sintactico
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			// Crear el objeto correspondiente al analizador sintáctico que se alimenta apartir del buffer de tokens
			Java8Parser parser = new Java8Parser(tokens);
			ParseTree tree = parser.compilationUnit(); // begin parsing at init rule
			ClassAndInterVisitor<Object> firstLoader = new ClassAndInterVisitor<Object>();
			firstLoader.visit(tree);
			
			//Visitor<Object> loader = new Visitor<Object>();
			Visitor<Object> loader = new Visitor<Object>(firstLoader.classes, firstLoader.interfaces);
			
			loader.visit(tree);
//			System.out.println(tree.toStringTree(parser)); // print LISP-style tree
			
			lexemes = loader.lexemes;
			attributes = loader.attributes;
			classes = firstLoader.classes;
//			methods = loader.methods;
//			System.out.println("Methods"+ methods.keySet());
		    Iterator it = (Iterator) classes.entrySet().iterator();
		    while (it.hasNext()) {
		        Map.Entry pair = (Map.Entry)it.next();
				ClassInfo value = (ClassInfo) pair.getValue();
		        it.remove(); // avoids a ConcurrentModificationException
		    }

			/*try {
				System.out.println("Si");
				main.run();
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}*/
			

			
			
		} catch (Exception e){
			System.err.println("Error (Test): " + e);
		}
		
		redirect(url: "/")
		
		
	}

}
