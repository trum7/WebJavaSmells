package proyecto1;

import java.util.ArrayList;
import java.util.HashMap;

public class ClassInfo {
	public String name;
	public int length ;
	public HashMap<String,Integer> attributes ;
	public HashMap<String,Integer> primitiveAttributes ;
	public HashMap<String,MethodInfo> methods ;
	public ArrayList<String> extendsClass;
	public ArrayList<String> implementInterfaces;
	
	public ClassInfo(){
		this.name = "NN";
		this.length = 0;
		this.attributes = new HashMap<String,Integer>();
		this.primitiveAttributes = new HashMap<String,Integer>();
		this.methods= new HashMap<String,MethodInfo>();
		this.extendsClass = new ArrayList<String>();
		this.implementInterfaces = new ArrayList<String>();
	}

	@Override
	public String toString() {
		return "ClassInfo [name=" + name + ", length=" + length + ", attributes=" + attributes.toString()
				+ ", primitiveAttributes=" + primitiveAttributes + ", methods=" + methods.toString() + ", extendsClass="
				+ extendsClass.toString() + ", implementsInterfaces = "+implementInterfaces.toString() ;
	}

	
	

	
}
