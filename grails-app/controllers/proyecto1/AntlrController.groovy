package proyecto1

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream
import java.util.ArrayList
import java.util.HashMap;
import java.util.Iterator
import java.util.Map

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

class AntlrController {

	public static HashMap<String,Integer> lexemes;
	public static HashMap<String,Integer> wrongName;
	public static HashMap<String,Integer> attributes;
	public static HashMap<String,Integer> classes;

	def index() {

		try{

			String input1 = params.code;
			codeVisitor(input1);
//			println input1;
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

			wrongName = badName()
			
//			methods = loader.methods;
//			System.out.println("Methods"+ methods.keySet());
		    /*Iterator it = (Iterator) classes.entrySet().iterator();
		    while (it.hasNext()) {
		        Map.Entry pair = (Map.Entry)it.next();
				ClassInfo value = (ClassInfo) pair.getValue();
				System.out.println("Class" + pair.getKey() );
				System.out.println("Parents"+ " = " + value.extendsClass.toString());
				System.out.println("Implements"+ " = " + value.implementInterfaces.toString());
				System.out.println("References"+ " = " + value.referencesClasses.toString());
		        System.out.println(pair.getKey() + " = " + pair.getValue().toString());
		        it.remove(); // avoids a ConcurrentModificationException
		    }*/

			/*try {
				System.out.println("Si");
				main.run();
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}*/

			session.lexemes = loader.lexemes;
			session.attributes = loader.attributes;
			session.classes = firstLoader.classes;
			session.interfaces = loader.interfaces;
			session.methods = loader.methods;
			session.wrongName = wrongName;


		} catch (Exception e){
			System.err.println("Error (Test): " + e);
		}

		redirect (controller: "webreport", action: 'index')

	}
	
	def private String createMainClass(String input1) {
		def className = ""
		return className
	}
	
	def private String[] executeCodeAnalizer(String className) {
		def sout = new StringBuilder(), serr = new StringBuilder()
		def proc = "javac  ./src/Ejemplos/ExampleTest.java -d ./src/Classes".execute()
		proc.consumeProcessOutput(sout, serr)
		proc.waitForOrKill(2000)
		println "out> $sout err> $serr"

		def classes = []
		def results = []
		
		def dir = new File("./src/Classes")
		dir.eachFileRecurse (FileType.FILES) { file ->
		  classes << file
		}
		
		
		classes.each {
			def command = "java -jar ./lib/ckjm_ext.jar " + it.path.toString()
			def proc1 = command.execute()
			def sout1 = new StringBuilder(), serr1 = new StringBuilder()
			proc1.consumeProcessOutput(sout1, serr1)
			proc1.waitForOrKill(2000)
			results << sout1
			println "Ouput: $sout1, Errors: $serr1"
			
		  }
		
		return results
	}

	def private HashMap badName(){
		def words =  Word.executeQuery("Select word from Word where length(word) > 2 ")
		HashMap<String,Integer> notMatchAttributes = new HashMap<String,Integer>();
		ArrayList<String> dbWords = new ArrayList<String>();
		for (w in words) {
//			println w.word
			dbWords.add(w)
		}
//		println dbWords.size()
		Iterator it = (Iterator) attributes.entrySet().iterator();
		boolean found = false;
		while ( it.hasNext() ) {
			found = false;
			Map.Entry pair = (Map.Entry)it.next();
			String search = pair.getKey().toString();
			int count = (int) pair.getValue();
			char lastChar = search.charAt(search.size()-1)
			boolean isNumeric = (search.charAt(search.size()-1).isDigit(lastChar))
//			println "Is numeric " + isNumeric 
//			System.out.println(pair.getKey() + " = " + pair.getValue());
			if(search.size() > 2 && !isNumeric){
				for(String word : dbWords){
					//				String s = "hello world i am from heaven";
					//	        	System.out.println("Index of word"+ search.indexOf(word));
					if (search.indexOf(word) != -1 ) {
					  found = true;
//					  System.out.println("Encontro a: " + search + " Con la palabra: " + word);
					  break;
					}
				}
			}
			
			if( !found ){
				notMatchAttributes.put(search, count);
			}
			it.remove(); // avoids a ConcurrentModificationException
		}
		for(String a: notMatchAttributes){
//			System.out.println("Not found ");
//			System.out.println(a);
		}
		System.out.println("Finalizo");
		return notMatchAttributes
	}
	

}
