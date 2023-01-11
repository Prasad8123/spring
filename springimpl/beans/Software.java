package com.xworkz.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Software {

	@Autowired
	@Qualifier("appName")
	private String name;
	@Autowired
	@Qualifier("version")
	private double version;
	@Autowired
	@Qualifier("developer")
	private String developer;
	@Autowired
	private double data;
	@Autowired
	@Qualifier("free")
	private boolean isFree;
	
	public Software() {
		
		System.out.println("software is createrd by spring");
	}

	@Override
	public String toString() {
		return "Software [name=" + name + ", version=" + version + ", developer=" + developer + ", data=" + data
				+ ", isFree=" + isFree + "]";
	}

	public String getName() {
		return name;
	}

	public double getVersion() {
		return version;
	}

	public String getDeveloper() {
		return developer;
	}

	public double getData() {
		return data;
	}

	public boolean isFree() {
		return isFree;
	}

	
	
}
