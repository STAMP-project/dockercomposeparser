package eu.stamp.dockerComposeParser.model.service;

import java.util.List;

public class Deploy {

	
	Integer replicas;
    Config update_config;
    RestartPolicy restart_policy;
    Placement placement;
    Mode mode;
    List<String> labels;
    
	public Integer getReplicas() {
		return replicas;
	}
	public Config getUpdate_config() {
		return update_config;
	}
	public RestartPolicy getRestart_policy() {
		return restart_policy;
	}
	public Placement getPlacement() {
		return placement;
	}
	public void setReplicas(Integer replicas) {
		this.replicas = replicas;
	}
	public void setUpdate_config(Config update_config) {
		this.update_config = update_config;
	}
	public void setRestart_policy(RestartPolicy restart_policy) {
		this.restart_policy = restart_policy;
	}
	public void setPlacement(Placement placement) {
		this.placement = placement;
	}
	public Mode getMode() {
		return mode;
	}
	public void setMode(Mode mode) {
		this.mode = mode;
	}
	public List<String> getLabels() {
		return labels;
	}
	public void setLabels(List<String> labels) {
		this.labels = labels;
	}
}
