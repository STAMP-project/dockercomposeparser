package eu.stamp.dockerComposeParser.model.network;

public class External {
	
	public External() {
		// TODO Auto-generated constructor stub
	}
	

	boolean value =true;
	String name;

	
	public boolean isValue() {
		return value;
	}
	public String getName() {
		return name;
	}
	public void setValue(boolean value) {
		this.value = value;
	}
	public void setName(String name) {
		this.name = name;
	}
	public External(boolean value) {
		this.value = value;	
	}
	
}
