package com.xworkz.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Rubber {
	
	@Autowired
	@Qualifier("rubberName")
	private String name;
	@Autowired
	@Qualifier("type1")
	private String type;
	@Autowired
	@Qualifier("price1")
	private int price;
	@Autowired
	@Qualifier("color1")
	private String color;
	@Autowired
	@Qualifier("sharp1")
	private boolean isSharp;
	@Autowired
	@Qualifier("stolen1")
	private boolean isStolen;
	@Autowired
	@Qualifier("size")
	private String size;
	
	
	@Override
	public String toString() {
		return "Rubber [name=" + name + ", type=" + type + ", price=" + price + ", color=" + color + ", isSharp="
				+ isSharp + ", isStolen=" + isStolen + ", size=" + size + "]";
	}


	public String getName() {
		return name;
	}


	public String getType() {
		return type;
	}


	public int getPrice() {
		return price;
	}


	public String getColor() {
		return color;
	}


	public boolean isSharp() {
		return isSharp;
	}


	public boolean isStolen() {
		return isStolen;
	}


	public String getSize() {
		return size;
	}



	

}
