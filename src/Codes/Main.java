
import java.util.ArrayList;
import java.util.HashMap;

public class Main{
	
	public class VarInfo<T> {
		String name;
		String type ;
		private T value;
		boolean global;
		boolean constant;
		ContextTable test22;
		
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
		public VarInfo( T value) {
			this.name = "";
			this.type = "";
			this.setValue(value);
			this.constant = false;
			this.global = false;
		}
		public VarInfo( T value,String name) {
			this.name = "";
			this.type = "";
			this.setValue(value);
			this.constant = false;
			this.global = false;
			
		}
		public void fun( T value) {
			this.name = "";
			this.type = "";
			this.setValue(value);
			this.constant = false;
			this.global = false;
		this.test22.hasKey("sasa2");
		this.test22.newContext();
		}
		public void fun2( T value) {
			this.name = "";
			this.type = "";
			this.setValue(value);
			this.constant = false;
			this.global = false;
			this.test22.hasKey("sasa2");
		this.test22.newContext();
		}
		
		
		
		
		
		public void fun12( T value) {
			this.name = "";
			this.type = "";
			this.setValue(value);
			this.constant = false;
			this.global = false;
			this.test22.hasKey("sasa2");
		this.test22.newContext();
		this.test22.hasKey("sasa2");
		this.test22.newContext();
		}
		public void fun22( T value) {
			this.name = "";
			this.type = "";
			this.setValue(value);
			this.constant = false;
			this.global = false;
			this.test22.hasKey("sasa2");
		this.test22.newContext();
		this.test22.hasKey("sasa2");
		this.test22.newContext();
			}
		
		public void fun32( T value) {
			this.name = "";
			this.type = "";
			this.setValue(value);
			this.constant = false;
			this.global = false;
			this.test22.hasKey("sasa2");
		this.test22.newContext();
		this.test22.hasKey("sasa2");
		this.test22.newContext();
		}
		public void fun42( T value) {
			this.name = "";
			this.type = "";
			this.setValue(value);
			this.constant = false;
			this.global = false;
			this.test22.hasKey("sasa2");
		this.test22.newContext();
		this.test22.hasKey("sasa2");
		this.test22.newContext();
		}
		public void fun52( T value) {
			this.name = "";
			this.type = "";
			this.setValue(value);
			this.constant = false;
			this.global = false;
			this.test22.hasKey("sasa2");
		this.test22.newContext();
		this.test22.hasKey("sasa2");
		this.test22.newContext();
		}
		public void fun62( T value) {
			this.name = "";
			this.type = "";
			this.setValue(value);
			this.constant = false;
			this.global = false;
			this.test22.hasKey("sasa2");
		this.test22.newContext();
		this.test22.hasKey("sasa2");
		this.test22.newContext();
		}
		public void fun72( T value) {
			this.name = "";
			this.type = "";
			this.setValue(value);
			this.constant = false;
			this.global = false;
			this.test22.hasKey("sasa2");
		this.test22.newContext();
		this.test22.hasKey("sasa2");
		this.test22.newContext();
		}
		public void fuwwn28( T value) {
			this.name = "";
			this.type = "";
			this.setValue(value);
			this.constant = false;
			this.global = false;
			this.test22.hasKey("sasa2");
		this.test22.newContext();
		}
		public void fun92( T value) {
			this.name = "";
			this.type = "";
			this.setValue(value);
			this.constant = false;
			this.global = false;
			this.test22.hasKey("sasa2");
		this.test22.newContext();
		}
		public void fu5n2( T value) {
			this.name = "";
			this.type = "";
			this.setValue(value);
			this.constant = false;
			this.global = false;
			this.test22.hasKey("sasa2");
		this.test22.newContext();
		}
		public void fu4n42( T value) {
			this.name = "";
			this.type = "";
			this.setValue(value);
			this.constant = false;
			this.global = false;
			this.test22.hasKey("sasa2");
		this.test22.newContext();
		}
		public void fu3n32( T value) {
			this.name = "";
			this.type = "";
			this.setValue(value);
			this.constant = false;
			this.global = false;
			this.test22.hasKey("sasa2");
		this.test22.newContext();
		}
		public void fun21( T value) {
			this.name = "";
			this.type = "";
			this.setValue(value);
			this.constant = false;
			this.global = false;
			this.test22.hasKey("sasa2");
		this.test22.newContext();
		}
		public void fun222( T value) {
			this.name = "";
			this.type = "";
			this.setValue(value);
			this.constant = false;
			this.global = false;
			this.test22.hasKey("sasa2");
		this.test22.newContext();
		}
		public void fun23( T value) {
			this.name = "";
			this.type = "";
			this.setValue(value);
			this.constant = false;
			this.global = false;
			this.test22.hasKey("sasa2");
		this.test22.newContext();
		}
		public void fun24( T value) {
			this.name = "";
			this.type = "";
			this.setValue(value);
			this.constant = false;
			this.global = false;
			this.test22.hasKey("sasa2");
		this.test22.newContext();
		}
		public void fun25( T value) {
			this.name = "";
			this.type = "";
			this.setValue(value);
			this.constant = false;
			this.global = false;
			this.test22.hasKey("sasa2");
		this.test22.newContext();
		}
		public void fun26( T value) {
			this.name = "";
			this.type = "";
			this.setValue(value);
			this.constant = false;
			this.global = false;
		}
		public void fun27( T value) {
			this.name = "";
			this.type = "";
			this.setValue(value);
			this.constant = false;
			this.global = false;
		}
		public void fun28( T value) {
			this.name = "";
			this.type = "";
			this.setValue(value);
			this.constant = false;
			this.global = false;
		}
		public void fun29( T value) {
			this.name = "";
			this.type = "";
			this.setValue(value);
			this.constant = false;
			this.global = false;
		}
		public void fun202( T value) {
			this.name = "";
			this.type = "";
			this.setValue(value);
			this.constant = false;
			this.global = false;
		}
		public void f12un2( T value) {
			this.name = "";
			this.type = "";
			this.setValue(value);
			this.constant = false;
			this.global = false;
		}
		public void fu2dn2( T value) {
			this.name = "";
			this.type = "";
			this.setValue(value);
			this.constant = false;
			this.global = false;
		}
		public void ffun2( T value) {
			this.name = "";
			this.type = "";
			this.setValue(value);
			this.constant = false;
			this.global = false;
		}
		public void fusn2( T value) {
			this.name = "";
			this.type = "";
			this.setValue(value);
			this.constant = false;
			this.global = false;
		}
		public void fugn2( T value) {
			this.name = "";
			this.type = "";
			this.setValue(value);
			this.constant = false;
			this.global = false;
		}
		public void fguns2( T value) {
			this.name = "";
			this.type = "";
			this.setValue(value);
			this.constant = false;
			this.global = false;
		}
		public void funa2( T value) {
			this.name = "";
			this.type = "";
			this.setValue(value);
			this.constant = false;
			this.global = false;
		}
		public void fugdn2( T value) {
			this.name = "";
			this.type = "";
			this.setValue(value);
			this.constant = false;
			this.global = false;
		}
		public void ffjun2( T value) {
			this.name = "";
			this.type = "";
			this.setValue(value);
			this.constant = false;
			this.global = false;
		}
		public void fuhnj2( T value) {
			this.name = "";
			this.type = "";
			this.setValue(value);
			this.constant = false;
			this.global = false;
		}
		public void funk2( T value) {
			this.name = "";
			this.type = "";
			this.setValue(value);
			this.constant = false;
			this.global = false;
		}
		
		
		
		
		
		public void fwwwuna2( T value) {
			this.name = "";
			this.type = "";
			this.setValue(value);
			this.constant = false;
			this.global = false;
		}
		public void fuwwgdn2( T value) {
			this.name = "";
			this.type = "";
			this.setValue(value);
			this.constant = false;
			this.global = false;
		}
		public void ffjwun2( T value) {
			this.name = "";
			this.type = "";
			this.setValue(value);
			this.constant = false;
			this.global = false;
		}
		public void fuhqqqnj2( T value) {
			this.name = "";
			this.type = "";
			this.setValue(value);
			this.constant = false;
			this.global = false;
		}
		public void fuqqnk2( T value) {
			this.name = "";
			this.type = "";
			this.setValue(value);
			this.constant = false;
			this.global = false;
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
			this.ctxtable = new ArrayList<HashMap<String, VarInfo>>();
			this.ctxtable.add(new HashMap<String,VarInfo>());
			this.ctxtable = new ArrayList<HashMap<String, VarInfo>>();
			this.ctxtable.add(new HashMap<String,VarInfo>());
			this.ctxtable = new ArrayList<HashMap<String, VarInfo>>();
			this.ctxtable.add(new HashMap<String,VarInfo>());
			this.ctxtable = new ArrayList<HashMap<String, VarInfo>>();
			this.ctxtable.add(new HashMap<String,VarInfo>());
			this.ctxtable = new ArrayList<HashMap<String, VarInfo>>();
			this.ctxtable.add(new HashMap<String,VarInfo>());
			this.ctxtable = new ArrayList<HashMap<String, VarInfo>>();
			this.ctxtable.add(new HashMap<String,VarInfo>());
			this.ctxtable = new ArrayList<HashMap<String, VarInfo>>();
			this.ctxtable.add(new HashMap<String,VarInfo>());
			this.ctxtable = new ArrayList<HashMap<String, VarInfo>>();
			this.ctxtable.add(new HashMap<String,VarInfo>());
			this.ctxtable = new ArrayList<HashMap<String, VarInfo>>();
			this.ctxtable.add(new HashMap<String,VarInfo>());
			this.ctxtable = new ArrayList<HashMap<String, VarInfo>>();
			this.ctxtable.add(new HashMap<String,VarInfo>());
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
		
		int a;
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