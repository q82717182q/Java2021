package com.yao.demo.enumdemo;


import java.util.stream.Stream;

public enum EvaAirDomainAndSystemCodeEnum {
	EVAAIR("Evaair","Taiwan","_SYS_JT3"),
	EVAA("EVAA","Taiwan","_SYS_JT3"),
	AMERICA("America","America","_SYS_JT3"),
	ASIA("Asia","Asia","_SYS_JT3"),
	Europe("Europe","Europe","_SYS_JT3"),
	;
	private String domainName;
	private String domainNameDisplay;
	private String systemCode;
	
	private EvaAirDomainAndSystemCodeEnum(String domainName, String domainNameDisplay, String systemCode) {
		this.domainName = domainName;
		this.domainNameDisplay = domainNameDisplay;
		this.systemCode = systemCode;
	}
	
	public String getDomainName() {
		return domainName;
	}
	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}
	public String getDomainNameDisplay() {
		return domainNameDisplay;
	}
	public void setDomainNameDisplay(String domainNameDisplay) {
		this.domainNameDisplay = domainNameDisplay;
	}
	public String getSystemCode() {
		return systemCode;
	}
	public void setSystemCode(String systemCode) {
		this.systemCode = systemCode;
	}
	
	public static String getDomainNameDisplay(String domainName) {
//		return Stream.of(EvaAirDomainAndSystemCodeEnum.values())
//				.filter(e -> e.getDomainName().equalsIgnoreCase(domainName))
//				.map(e -> e.getDomainNameDisplay()).toString();
		return Stream.of(EvaAirDomainAndSystemCodeEnum.values())
		.filter(e -> e.getDomainName().equalsIgnoreCase(domainName))
		.findAny().map(e -> e.getDomainNameDisplay()).orElse("");
	}
	
	public static void main(String[] args) {
		System.out.println("-----------------------------0");
		
		System.out.println("-----------------------------1");
		System.out.println(getDomainNameDisplay("EurOpe"));
	}
}
