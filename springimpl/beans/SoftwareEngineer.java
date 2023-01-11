package com.xworkz.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SoftwareEngineer {
	
	
	@Autowired
	@Qualifier("engineerName")
	private String  name;
	@Autowired
	@Qualifier("salary")
	private double salary;
	@Autowired
	@Qualifier("companyName")
	private String companyName;
	@Autowired
	@Qualifier("experiance")
	private int experiance;
	
	public SoftwareEngineer() {
		
		System.out.println("software engineering created by spring");
	}

	@Override
	public String toString() {
		return "SoftwareEngineer [name=" + name + ", salary=" + salary + ", companyName=" + companyName
				+ ", experiance=" + experiance + "]";
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public String getCompanyName() {
		return companyName;
	}

	public int getExperiance() {
		return experiance;
	}


	
	

}
