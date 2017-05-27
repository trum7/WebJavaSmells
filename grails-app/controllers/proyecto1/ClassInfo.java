package proyecto1;

import java.util.ArrayList;
import java.util.HashMap;

public class ClassInfo {
	public String name;
	public int length ;
	public int setGetter;
	public boolean isDataClass;
	public HashMap<String,Integer> attributes ;
	public HashMap<String,Integer> primitiveAttributes ;
	public HashMap<String,MethodInfo> methods ;
	public ArrayList<String> extendsClass;
	public ArrayList<String> implementInterfaces;
	public ArrayList<String> referencesClasses;
	
	public ClassInfo(){
		this.name = "NN";
		this.length = 0;
		this.setGetter = 0;
		this.isDataClass = false;
		this.attributes = new HashMap<String,Integer>();
		this.primitiveAttributes = new HashMap<String,Integer>();
		this.methods= new HashMap<String,MethodInfo>();
		this.extendsClass = new ArrayList<String>();
		this.implementInterfaces = new ArrayList<String>();
		this.referencesClasses = new ArrayList<String>();
	}

	@Override
	public String toString() {
		return "ClassInfo: \n\tname=" + name + ",\n\tlength=" + length + ",\n\tattributes=" + attributes.toString()
				+ ", \n\tprimitiveAttributes=" + primitiveAttributes + ", \n\tmethods=" + methods.toString() 
				+ "\n\tIs data class= "+ isDataClass + ", \n\textendsClass="
				+ extendsClass.toString() + ", \n\timplementsInterfaces = "+implementInterfaces.toString()
				+", \n\treferencesClasses= " + referencesClasses.toString() ;
	}

	
	

	
}
