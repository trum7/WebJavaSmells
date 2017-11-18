import java.io.*;
import java.sql.*;
import java.util.*;

public class ExampleTest{
	public class VarInfo<T> {
		String name;
		String type ;
		private T value;
		boolean global;
		boolean constant;

		public VarInfo(String name, String type, T value) {
			this.name = name;
			this.type = type;
			this.setValue(value);
			this.global= false;
			this.constant = false;
		}
		public VarInfo(String name, String type, T value,Boolean global) {
			this.name = name;
			this.type = type;
			this.setValue(value);
			this.global = global;
			this.constant = false;
		}
		public VarInfo(Boolean constant,String name, String type, T value) {
			this.name = name;
			this.type = type;
			this.setValue(value);
			this.constant = constant;
			this.global = false;
		}

		public T getValue() {
			return value;
		}

		public void setValue(T value) {
			this.value = value;
		}
	    @Override
	    public String toString() {
	        return "ClassInfo: \n\tname=" ;            }
	}

	public class ContextTable {
		ArrayList< HashMap <String, VarInfo> > ctxtable;
		VarInfo test1;

		public ContextTable() {

			this.ctxtable = new ArrayList<HashMap<String, VarInfo>>();
			this.ctxtable.add(new HashMap<String,VarInfo>());

		}

		private void newContext() {
			this.ctxtable.add(new HashMap<String,VarInfo>());
		}

		private void popContext() {
			this.ctxtable.remove(this.ctxtable.size() -1 );

		}


		public HashMap<String, VarInfo> currentContext() {

			HashMap<String, VarInfo> current = this.ctxtable.get(this.ctxtable.size()-1);

			return current;
		}

		public void addData(String name , VarInfo info) {

			HashMap<String, VarInfo> current = currentContext();
			current.put(name, info);

		}

		public VarInfo getData( String name )
		{
			for ( int i = ctxtable.size( ) - 1; i >= 0; i-- )
			{
				VarInfo val = ctxtable.get( i ).get( name );
				if ( val != null )
					return val;
			}
			return null;
		}

		public boolean hasKey(String key) {
			Boolean exist = false;
			HashMap<String, VarInfo> current = currentContext();

			exist = current.containsKey(key);

			return exist;
		}

	}

	public class SymbolsTable {
		HashMap<String, String> symbols = new HashMap<String, String>();
		HashMap<Integer, String> instances = new HashMap<Integer, String>();

		public SymbolsTable() {
			this.symbols.put("$", "STRING");
			this.symbols.put("%", "INTEGER");
			this.symbols.put("&", "LONG");
			this.symbols.put("#", "DOUBLE");
			this.symbols.put("!", "SINGLE");

			this.instances.put(0, "double");
			this.instances.put(1, "integer");
			this.instances.put(2, "long");
			this.instances.put(3, "string");

		}

//		 public String key(String value){
//
//			 for (Entry<String, String> entry : symbols.entrySet()) {
//
//				 if (value.equals(entry.getValue())) {
//					 return entry.getKey();
//			       }
//			    }
//			return null;
//		 }

	}

}

