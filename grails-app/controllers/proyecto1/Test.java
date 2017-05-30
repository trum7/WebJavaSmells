package proyecto1;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.apache.poi.ss.formula.functions.T;

import java.io.File;
import java.io.FileInputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;

import java.util.Iterator;

public class Test {

	public static HashMap<String,Integer> lexemes;
	public static HashMap<String,Integer> attributes;
	public static HashMap<String,ClassInfo> classes;
	public static HashMap<String,MethodInfo> methods;
	public static void main(String[] args) throws Exception {
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
			ClassAndInterVisitor<Object> firstLoader = new ClassAndInterVisitor<Object>();
			firstLoader.visit(tree);

			Visitor<Object> loader = new Visitor<Object>();
//			Visitor<T> loader = new Visitor<T>(firstLoader.classes, firstLoader.interfaces);

			loader.visit(tree);
//			System.out.println(tree.toStringTree(parser)); // print LISP-style tree

			lexemes = loader.lexemes;
			attributes = loader.attributes;
			classes = firstLoader.classes;

			methods = loader.methods;
//			System.out.println("Methods"+ methods.keySet());
		    Iterator it = (Iterator) classes.entrySet().iterator();
		    while (it.hasNext()) {
		        Map.Entry pair = (Map.Entry)it.next();
		        ClassInfo value = (ClassInfo) pair.getValue();
		        System.out.println("Class" + pair.getKey() );
		        System.out.println("Parents"+ " = " + value.extendsClass.toString());
		        System.out.println("Implements"+ " = " + value.implementInterfaces.toString());
		        System.out.println("References"+ " = " + value.referencesClasses.toString());
		        
		        it.remove(); // avoids a ConcurrentModificationException
		    }


	        try {
	        	System.out.println("Si");
	            main.run();
	        } catch (Exception e) {
	            System.err.println(e.getMessage());
	        }




		} catch (Exception e){
			System.err.println("Error (Test): " + e.getLocalizedMessage());
		}
	}



    private void run() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/javacodesmells?user=root&password=root&zeroDateTimeBehavior=convertToNull");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT word FROM javacodesmells.word where length(word) <= 2");
        System.out.println(resultSet.getRow());
        //System.out.println("Printing schema for table: " + resultSet.getMetaData().getTableName(1));
        //int columnCount = resultSet.getMetaData().getColumnCount();

        /*for (int i = 1; i <= columnCount; i++) {
            System.out.println(i + " " + resultSet.getMetaData().getColumnName(i));
        }

        System.out.println("Searching for example user.");
        boolean exampleUserFound = false;*/
        ArrayList<String> words = new ArrayList<String>();

        while (resultSet.next()) {
            words.add(resultSet.getString("word"));
        }
        System.out.println(words.size());
        ArrayList<String> notMatchAttributes = new ArrayList<String>();

	    Iterator it = (Iterator) attributes.entrySet().iterator();
	    boolean found = false;
	    while ( it.hasNext() ) {
	    	found = false;
	        Map.Entry pair = (Map.Entry)it.next();
	        String search = pair.getKey().toString();
	        System.out.println(pair.getKey() + " = " + pair.getValue());
	        
	        for(String word : words){
	        	 
	        	String s = "hello world i am from heaven";
//	        	System.out.println("Index of word"+ search.indexOf(word)); 
	        	if (search.indexOf(word) != -1 ) {
	        	  found = true;
	        	  if (word != null){
	        		  System.out.println("Hello I am in the db "+ word);
	        	  }
	        	  
	        	  System.out.println("Encontro a: " + search + " Con la palabra: " + word);
	        	  break;
	        	}

	        }

	        if( !found ){
	        	notMatchAttributes.add(search);
	        }
	        it.remove(); // avoids a ConcurrentModificationException
	    }
        for(String a: notMatchAttributes){
        	System.out.println("Not found ");
        	System.out.println(a);
        }
        System.out.println("Finalizo");

    }

}
