package com.xworkz.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HardwareShop {
	
	@Autowired
	private int id;
	@Autowired
	@Qualifier("name")
	private String name;
	@Autowired
	@Qualifier("no")
	private String gstNo;
	@Autowired
	@Qualifier("owerName")
	private String ownerName;
	@Autowired
	private String address;
	
	
	  @Override public String toString() { return "HardwareShop [id=" + id +
	  ", name=" + name + ", gstNo=" + gstNo + ", ownerName=" + ownerName +
	  ", address=" + address + "]"; }
	 


	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public String getGstNo() {
		return gstNo;
	}


	public String getOwnerName() {
		return ownerName;
	}


	public String getAddress() {
		return address;
	}


	
	
	

}
