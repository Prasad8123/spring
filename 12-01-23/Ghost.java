package com.xworkz.spring.beans.autowired;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Ghost {
	
	@Autowired
	@Qualifier("ghostName")
	private String name;
	@Autowired
	@Qualifier("ghostType")
	private Type type;
	@Autowired
	@Qualifier("ghostColor")
	private String color;
	@Autowired
	@Qualifier("nailLength")
	private int nailLength;
	@Autowired
	@Qualifier("dateOfDeth")
	private LocalDate dateOfDeth;
	@Autowired
	@Qualifier("hairLength")
	private int hairLength;
	private String gender;
	private boolean isVisible;
	private String dethResaon;
	private String typeOfDeth;
	private String clouth;
	private String location;
	
	
	
	
	
	public Ghost(String name, Type type, String color, int nailLength, LocalDate dateOfDeth, int hairLength,
		@Qualifier("gender")	String gender,@Qualifier("visible") boolean isVisible,@Qualifier("dethResaon") String dethResaon,@Qualifier("typeOfDeth") String typeOfDeth,@Qualifier("clouth") String clouth,@Qualifier("location") String location) {
		super();
		this.name = name;
		this.type = type;
		this.color = color;
		this.nailLength = nailLength;
		this.dateOfDeth = dateOfDeth;
		this.hairLength = hairLength;
		this.gender = gender;
		this.isVisible = isVisible;
		this.dethResaon = dethResaon;
		this.typeOfDeth = typeOfDeth;
		this.clouth = clouth;
		this.location = location;
		
	}


	@Override
	public String toString() {
		return "Ghost [name=" + name + ", type=" + type + ", color=" + color + ", nailLength=" + nailLength
				+ ", dateOfDeth=" + dateOfDeth + ", hairLength=" + hairLength + ", gender=" + gender + ", isVisible="
				+ isVisible + ", dethResaon=" + dethResaon + ", typeOfDeth=" + typeOfDeth + ", clouth=" + clouth
				+ ", location=" + location + "]";
	}


	public String getName() {
		return name;
	}


	public Type getType() {
		return type;
	}


	public String getColor() {
		return color;
	}


	public int getNailLength() {
		return nailLength;
	}


	public LocalDate getDateOfDeth() {
		return dateOfDeth;
	}


	public int getHairLength() {
		return hairLength;
	}


	public String getGender() {
		return gender;
	}


	public boolean isVisible() {
		return isVisible;
	}


	public String getDethResaon() {
		return dethResaon;
	}


	public String getTypeOfDeth() {
		return typeOfDeth;
	}


	public String getClouth() {
		return clouth;
	}


	public String getLocation() {
		return location;
	}	

}
