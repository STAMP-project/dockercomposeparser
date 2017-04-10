package eu.stamp.dockerComposeParser.model.service;

import java.util.List;

public class NetworkDetails {

	
	
	public NetworkDetails() {
		// TODO Auto-generated constructor stub
	}
	
	
	String ipv4_address;
	String ipv6_address;
	
	List<String> aliases;

	List<String> link_local_ips;

	public List<String> getAliases() {
		return aliases;
	}
	public void setAliases(List<String> aliases) {
		this.aliases = aliases;
	}
	public String getIpv4_address() {
		return ipv4_address;
	}
	public String getIpv6_address() {
		return ipv6_address;
	}
	public List<String> getLink_local_ips() {
		return link_local_ips;
	}
	public void setIpv4_address(String ipv4_address) {
		this.ipv4_address = ipv4_address;
	}
	public void setIpv6_address(String ipv6_address) {
		this.ipv6_address = ipv6_address;
	}
	public void setLink_local_ips(List<String> link_local_ips) {
		this.link_local_ips = link_local_ips;
	}
	
	
}
