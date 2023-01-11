package com.xworkz.spring.beans.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Engine {
	
	private String name;
	private String type;
	@Autowired
	@Qualifier("number")
	private int number;
	@Autowired
	@Qualifier("version")
	private int version;
	private String company;
	private boolean strokes;
	
	
    @Autowired
	public Engine(@Qualifier("engineName")String name,@Qualifier("engineType") String type, int number, int version,@Qualifier("companyName") String company, boolean strokes) {
		super();
		this.name = name;
		this.type = type;
		this.number = number;
		this.version = version;
		this.company = company;
		this.strokes = strokes;
	}

	@Override
	public String toString() {
		return "Engine [name=" + name + ", type=" + type + ", number=" + number + ", version=" + version + ", company="
				+ company + ", strokes=" + strokes + "]";
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public int getNumber() {
		return number;
	}

	public int getVersion() {
		return version;
	}

	public String getCompany() {
		return company;
	}

	public boolean isStrokes() {
		return strokes;
	}


   @Autowired
   @Qualifier("strokes")
	public void setStrokes(boolean strokes) {
		this.strokes = strokes;
	}
	
	

}
