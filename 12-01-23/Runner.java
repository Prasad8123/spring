package com.xworkz.spring.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.beans.autowired.Engine;
import com.xworkz.spring.beans.autowired.Ghost;
import com.xworkz.spring.beans.autowired.NewsPaper;
import com.xworkz.spring.beans.autowired.Snake;
import com.xworkz.spring.configuartion.ConfigConst;

public class Runner {

	public static void main(String[] args) {
		
		
		ApplicationContext spring=new AnnotationConfigApplicationContext(ConfigConst.class);
		System.out.println(Arrays.toString(spring.getBeanDefinitionNames()));

		
		NewsPaper paper=spring.getBean(NewsPaper.class);
		System.out.println(paper);
		System.out.println(paper.getName());
		System.out.println(paper.getId());
		System.out.println(paper.getLanguage());
		System.out.println(paper.getOwnerName());
		System.out.println(paper.getPrice());
		
		
		Snake s=spring.getBean(Snake.class);
		System.out.println(s);
		System.out.println(s.getName());
		System.out.println(s.getColor());
		System.out.println(s.getType());
		System.out.println(s.getLength());
		System.out.println(s.isPoisionous());
		
		
		Engine e=spring.getBean(Engine.class);
		System.out.println(e);
		System.out.println(e.getName());
		System.out.println(e.getCompany());
		System.out.println(e.getNumber());
		System.out.println(e.getType());
		System.out.println(e.getVersion());
		System.out.println(e.isStrokes());
		
		
		Ghost g=spring.getBean(Ghost.class);
		System.out.println(g);
		System.out.println(g.getName());
		System.out.println(g.getGender());
		System.out.println(g.getDethResaon());
		System.out.println(g.getClouth());
		System.out.println(g.getHairLength());
		System.out.println(g.getNailLength());
		System.out.println(g.getTypeOfDeth());
		System.out.println(g.getLocation());
		System.out.println(g.getDateOfDeth());
		System.out.println(g.isVisible());
	
	}

}
