package proyecto1;

public class MethodInfo {
	
	public String name = "NN";
	public int length = 0;
	public int paramNum = 0;
	public int count = 0;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getParamNum() {
		return paramNum;
	}
	public void setParamNum(int paramNum) {
		this.paramNum = paramNum;
	}
	@Override
	public String toString() {
		return "MethodInfo [name=" + name + ", length=" + length + ", paramNum=" + paramNum + ", count=" + count + "]";
	}
	
	
}