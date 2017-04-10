package eu.stamp.dockerComposeParser.model.service;

public class Config {
	   int parallelism;
       String delay;
	public int getParallelism() {
		return parallelism;
	}
	public String getDelay() {
		return delay;
	}
	public void setParallelism(int parallelism) {
		this.parallelism = parallelism;
	}
	public void setDelay(String delay) {
		this.delay = delay;
	}


}

