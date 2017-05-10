package proyecto1

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;

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
			
			System.setIn(new FileInputStream(new File("src/input.txt")));
			ANTLRInputStream input = new ANTLRInputStream(System.in);
			Java8Lexer lexer= new Java8Lexer(input);
			// Identificar al analizador léxico como fuente de tokens para el sintactico
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			// Crear el objeto correspondiente al analizador sintáctico que se alimenta apartir del buffer de tokens
			Java8Parser parser = new Java8Parser(tokens);
			ParseTree tree = parser.compilationUnit(); // begin parsing at init rule
			Visitor<Object> loader = new Visitor<Object>();
			loader.visit(tree);
			System.out.println(tree.toStringTree(parser)); // print LISP-style tree
			
			lexemes = loader.lexemes;
			attributes = loader.attributes;
			classes = loader.classes;
			Iterator it = (Iterator) attributes.entrySet().iterator();
			while (it.hasNext()) {
				Map.Entry pair = (Map.Entry)it.next();
				System.out.println(pair.getKey() + " = " + pair.getValue());
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
