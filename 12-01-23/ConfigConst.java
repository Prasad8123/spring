package com.xworkz.spring.configuartion;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.spring.beans.autowired.Type;

@Configuration
@ComponentScan("com.xworkz.spring.beans.autowired")
public class ConfigConst {
	
	
	public ConfigConst() {
		
		System.out.println("configuration is registered with spring");
	}
	
	@Bean
	public String name()
	{
		System.out.println("name is registered with spring");
		return "vijayavani news paper";
	}

	
	@Bean
	public Integer id()
	{
		System.out.println("id is registered with spring ");
		return 32;
		
		
	}
	
	@Bean
	public String ownerName()
	{
		System.out.println("owner name is registred with spring");
		return "prasad";
	}
	
	@Bean
	public String language()
	{
		System.out.println("language is registered with spring");
		return "kannada";
	}
	
	@Bean
	public double price()
	{
		System.out.println("price is registered with spring");
		return 4;
	}
	
	@Bean 
	public String snakeName()
	{
		System.out.println("snake name is registered with spring");
		return "Anakonda";
	}
	
	@Bean 
	public int length()
	{
		System.out.println("length is registered with spring");
		return 15;
	}
	
	@Bean
	public String color()
	{
		System.out.println();
		return "black";
	}
	
	@Bean
	public String type()
	{
		System.out.println("type is registered with spring");
		return "big snake";
	}
	
	@Bean
	public boolean poisionous()
	{
		System.out.println("poisionous is registered with spring");
		return true;
	}
	
	@Bean
	public String engineName()
	{
		System.out.println("engineName is registered with spring");
		return "hondai";
	}
	
	@Bean
	public String engineType() {
		System.out.println("engine type is registerd with spring");
		return "bike";
	}
	
	@Bean
	public int number()
	{
		System.out.println("number is registered with spring");
		return 245324;
	}
	
	@Bean
	public int version()
	{
		System.out.println("version is registered with spring");
		return 6;
	}
	
	@Bean
	public String companyName()
	{
		System.out.println("company name is registerd with spring");
		return "hero hunda";
	}
	
	@Bean
	public boolean strokes()
	{
		System.out.println("strokes is registered with spring");
		return false;
	}
	
	@Bean
	public String ghostName()
	{
		System.out.println("name is registered with spring");
		return "chandramuki";
	}
	
	@Bean
	public Type ghostType() {
		System.out.println("type is registeresd with spring");
		return Type.DEMONE;
	}
	
	@Bean
	public String ghostColor()
	{
		System.out.println("color is registered with spring");
		return "white";
	}
	
	@Bean
	public int nailLength()
	{
		System.out.println("nail length is registerd with spring");
		return 5;
	}
	
	@Bean
	public int hairLength()
	{
		System.out.println("hair lengt is registered with spring");
		return 6;
	}
	
	@Bean
	public LocalDate dateOfDeth()
	{
		System.out.println("date of deth is registerd with spring");
		return LocalDate.of(2022, 12, 31);
	}
	
	@Bean
	public String gender()
	{
		System.out.println("gender is registered with spring");
		return "female";
	}
	
	@Bean
	public String dethResaon()
	{
		System.out.println("resaon is registered with spring");
		return "love";
	}
	@Bean
	public String typeOfDeth()
	{
		System.out.println("type of deth is registered with spring");
		return "sucaid";
		
	}
	
	@Bean
	public String location()
	{
		System.out.println("location is rigetsred with spring");
		return "harichandra ghat";
	}
	
	@Bean
	public boolean visible()
	{
		System.out.println("visible is regisred with spring");
		return false;
	}
	
	@Bean
	public String clouth()
	{
		System.out.println("clouth is registered with spring");
		return "white sari";
	}
}
