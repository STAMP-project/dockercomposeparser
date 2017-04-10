package eu.stamp.dockerComposeParser.model.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import eu.stamp.dockerComposeParser.model.common.LabelsOrArgs;

public class Service {
	
	String image;
	List<String> ports;
	List<String> volumes;
	String command;
	List<String> expose;

	List<String> links;
	LabelsOrArgs labels;
	Build build;
	Map<String,String> environements = new HashMap<String, String>();
	List<Network> networks;
	String network_mode;
	Deploy deploy;
	List<String> depends_on;
	String stop_grace_period;
	List<String> devices;
	List<String> dns;
	List<String> dns_search;
	List<String> tmpfs;
	List<String> entrypoint;
	List<String> env_file;
	List<String> external_links;
	List<String> extra_hosts;
	Healthcheck healthcheck;
	IsolationMode isolation;
	

	public List<String> getExternal_links() {
		return external_links;
	}
	public void setExternal_links(List<String> external_links) {
		this.external_links = external_links;
	}
	public List<String> getEnv_file() {
		return env_file;
	}
	public void setEnv_file(List<String> env_file) {
		this.env_file = env_file;
	}
	public List<String> getDevices() {
		return devices;
	}
	public List<String> getEntrypoint() {
		return entrypoint;
	}
	public void setDevices(List<String> devices) {
		this.devices = devices;
	}
	public void setEntrypoint(List<String> entrypoint) {
		this.entrypoint = entrypoint;
	}
	public List<String> getTmpfs() {
		return tmpfs;
	}
	public void setTmpfs(List<String> tmpfs) {
		this.tmpfs = tmpfs;
	}
	public List<String> getDns_search() {
		return dns_search;
	}
	public void setDns_search(List<String> dns_search) {
		this.dns_search = dns_search;
	}
	public List<String> getDns() {
		return dns;
	}
	public void setDns(List<String> dns) {
		this.dns = dns;
	}
	public List<String> getDepends_on() {
		return depends_on;
	}
	public void setDepends_on(List<String> depends_on) {
		this.depends_on = depends_on;
	}
	public Build getBuild() {
		return build;
	}
	public void setBuild(Build build) {
		this.build = build;
	}
	public LabelsOrArgs getLabels() {
		return labels;
	}
	public void setLabels(LabelsOrArgs labels) {
		this.labels = labels;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public List<String> getPorts() {
		return ports;
	}
	public void setPorts(List<String> ports) {
		this.ports = ports;
	}
	public List<String> getVolumes() {
		return volumes;
	}
	public void setVolumes(List<String> volumes) {
		this.volumes = volumes;
	}
	public String getCommand() {
		return command;
	}
	public void setCommand(String command) {
		this.command = command;
	}
	public List<String> getExpose() {
		return expose;
	}
	public void setExpose(List<String> exposes) {
		this.expose = exposes;
	}
	public List<String> getLinks() {
		return links;
	}
	public void setLinks(List<String> links) {
		this.links = links;
	}
	
	public void setEnvironment(List<String> s){
		for (String s1 : s){
			StringTokenizer s2 = new StringTokenizer(s1, "=");
			environements.put(s2.nextToken(),s2.nextToken());
		}
	}
	public Map<String, String> getEnvironements() {
		return environements;
	}
	public void setEnvironements(Map<String, String> environements) {
		this.environements = environements;
	}
	public Deploy getDeploy() {
		return deploy;
	}
	public void setDeploy(Deploy deploy) {
		this.deploy = deploy;
	}
	public String getStop_grace_period() {
		return stop_grace_period;
	}
	public void setStop_grace_period(String stop_grace_period) {
		this.stop_grace_period = stop_grace_period;
	}

	public String getNetwork_mode() {
		return network_mode;
	}
	public List<String> getExtra_hosts() {
		return extra_hosts;
	}
	public Healthcheck getHealthcheck() {
		return healthcheck;
	}
	public IsolationMode getIsolation() {
		return isolation;
	}
	public void setNetwork_mode(String network_mode) {
		this.network_mode = network_mode;
	}
	public void setExtra_hosts(List<String> extra_hosts) {
		this.extra_hosts = extra_hosts;
	}
	public void setHealthcheck(Healthcheck healthcheck) {
		this.healthcheck = healthcheck;
	}
	public void setIsolation(IsolationMode isolation) {
		this.isolation = isolation;
	}
	public List<Network> getNetworks() {
		return networks;
	}
	public void setNetworks(List<Network> networks) {
		this.networks = networks;
	}



}
