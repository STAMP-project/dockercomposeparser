package eu.stamp.dockerComposeParser.model.secret;

public class SecretDescription {

	String file;
	boolean external;
	public String getFile() {
		return file;
	}
	public boolean isExternal() {
		return external;
	}
	public void setFile(String file) {
		this.file = file;
	}
	public void setExternal(boolean external) {
		this.external = external;
	}

}
