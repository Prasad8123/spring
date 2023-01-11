package com.xworkz.spring.beans.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NewsPaper {
	
	private String name;
	@Autowired
	@Qualifier("id")
	private int id;
	private String ownerName;
	@Autowired
	@Qualifier("language")
	private String language;
	private double price;
	

	@Autowired
	public NewsPaper(@Qualifier("name")String  name, int id,@Qualifier("ownerName") String ownerName, String language, double price) {
		super();
		this.name = name;
		this.id = id;
		this.ownerName = ownerName;
		this.language = language;
		this.price = price;
	}

	@Override
	public String toString() {
		return "NewsPaper [name=" + name + ", id=" + id + ", ownerName=" + ownerName + ", language=" + language
				+ ", price=" + price + "]";
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public String getLanguage() {
		return language;
	}

	public double getPrice() {
		return price;
	}


   @Autowired
   @Qualifier("price")
	public void setPrice(double price) {
		this.price = price;
	}

	
	
	

}
