package proyecto1;

public class MethodInfo {
	
	public String name ;
	public String belongs; 
	public int length;
	public int paramNum;
	public int count;
	
	public MethodInfo() {
		this.name = "NN";
		this.belongs = "NN"; 
		this.length = 0;
		this.paramNum = 0;
		this.count = 0;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBelongs() {
		return belongs;
	}
	public void setBelongs(String belongs) {
		this.belongs = belongs;
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
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "MethodInfo [name=" + name + ", belongs=" + belongs + ", length=" + length + ", paramNum=" + paramNum
				+ ", count=" + count + "]";
	}
	
	
	
	
	
	
}