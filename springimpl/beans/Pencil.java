package com.xworkz.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Pencil {
	
	@Autowired
	@Qualifier("pencilName")
	private String name;
	@Autowired
	@Qualifier("type")
	private String type;
	@Autowired
	@Qualifier("price")
	private int price;
	@Autowired
	@Qualifier("color")
	private String color;
	@Autowired
	@Qualifier("sharp")
	private boolean isSharp;
	@Autowired
	@Qualifier("stolen")
	private boolean isStolen;
	
	public Pencil() {
		System.out.println("pencil is created by spring");
	}

	@Override
	public String toString() {
		return "Pencil [name=" + name + ", type=" + type + ", price=" + price + ", color=" + color + ", isSharp="
				+ isSharp + ", isStolen=" + isStolen + "]";
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

}
