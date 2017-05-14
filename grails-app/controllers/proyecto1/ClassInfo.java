package proyecto1;

import java.util.HashMap;

public class ClassInfo {
	public String name;
	public int length ;
	public HashMap<String,MethodInfo> methods ;
	
	public ClassInfo(){
		this.name = "NN";
		this.length = 0;
		this.methods= new HashMap<String,MethodInfo>();
	}

	@Override
	public String toString() {
		return "ClassInfo [name=" + name + ", length=" + length + ", methods=" + methods.toString() + "]";
	}
}
