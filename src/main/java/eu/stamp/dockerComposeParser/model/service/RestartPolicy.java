package eu.stamp.dockerComposeParser.model.service;

public class RestartPolicy {

	RestartCondition condition;
	String delay;
	int max_attempts;
	String window;

	public RestartCondition getCondition() {
		return condition;
	}

	public String getDelay() {
		return delay;
	}

	public int getMax_attempts() {
		return max_attempts;
	}

	public String getWindow() {
		return window;
	}

	public void setCondition(RestartCondition condition) {
		this.condition = condition;
	}

	public void setDelay(String delay) {
		this.delay = delay;
	}

	public void setMax_attempts(int max_attempts) {
		this.max_attempts = max_attempts;
	}

	public void setWindow(String window) {
		this.window = window;
	}

}
