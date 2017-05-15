package proyecto1;


import java.util.HashMap;

public class InterfaceInfo {
	
	public String name;
	public HashMap<String,MethodInfo> methods ;

	
	public InterfaceInfo(){
		this.name = "NN";
		this.methods = new HashMap<String, MethodInfo>();
	}
}
