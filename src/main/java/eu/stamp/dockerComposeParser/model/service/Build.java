package eu.stamp.dockerComposeParser.model.service;

import com.fasterxml.jackson.annotation.JsonAnySetter;

import eu.stamp.dockerComposeParser.model.common.LabelsOrArgs;

public class Build {
	
	 String context;
	 String dockerfile;
	 LabelsOrArgs args;
	 
	 
	 public Build() {
	}
	 
	public  Build(String s) {
		 this.context = s;
	}
	 
	public String getContext() {
		return context;
	}
	public String getDockerfile() {
		return dockerfile;
	}
	public LabelsOrArgs getArgs() {
		return args;
	}
	public void setContext(String context) {
		this.context = context;
	}
	public void setDockerfile(String dockerfile) {
		this.dockerfile = dockerfile;
	}
	public void setArgs(LabelsOrArgs args) {
		this.args = args;
	}
	
	@JsonAnySetter
    public void setDynamicService(String name) {
       this.context = name ;
    }


}

