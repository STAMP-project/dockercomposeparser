package eu.stamp.dockerComposeParser.model.service;

import java.util.List;

public class Healthcheck {

	 List<String> test;
	 String interval;
	 String timeout;
	int retries;
	boolean disable=false;
	public List<String> getTest() {
		return test;
	}
	public String getInterval() {
		return interval;
	}
	public String getTimeout() {
		return timeout;
	}
	public int getRetries() {
		return retries;
	}
	public boolean isDisable() {
		return disable;
	}
	public void setTest(List<String> test) {
		this.test = test;
	}
	public void setInterval(String interval) {
		this.interval = interval;
	}
	public void setTimeout(String timeout) {
		this.timeout = timeout;
	}
	public void setRetries(int retries) {
		this.retries = retries;
	}
	public void setDisable(boolean disable) {
		this.disable = disable;
	}
}
