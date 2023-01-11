package com.xworkz.spring.beans.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Snake {
	
	private String name;
	@Autowired
	@Qualifier("length")
	private int length;
	@Autowired
	@Qualifier("color")
	private String color;
	private String type;
	private boolean poisionous;
	
	

	@Autowired
	public Snake(@Qualifier("snakeName") String name, int length, String color,@Qualifier("type") String type,@Qualifier("poisionous") boolean poisionous) {
		super();
		this.name = name;
		this.length = length;
		this.color = color;
		this.type = type;
		this.poisionous = poisionous;
	}

	@Override
	public String toString() {
		return "Snake [name=" + name + ", length=" + length + ", color=" + color + ", type=" + type + ", poisionous="
				+ poisionous + "]";
	}

	public String getName() {
		return name;
	}

	public int getLength() {
		return length;
	}

	public String getColor() {
		return color;
	}

	public String getType() {
		return type;
	}

	public boolean isPoisionous() {
		return poisionous;
	}


	
	

}
