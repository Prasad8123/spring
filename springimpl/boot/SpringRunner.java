package com.xworkz.spring.boot;


import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.classes.Actor;
import com.xworkz.spring.classes.Rocket;
import com.xworkz.spring.classes.Season;
import com.xworkz.spring.configuartion.SpringConfig;

public class SpringRunner {
	
	
	public static void main(String[] args) {
		
		
		ApplicationContext spring=new AnnotationConfigApplicationContext(SpringConfig.class);
		System.out.println(Arrays.toString(spring.getBeanDefinitionNames()));
	
		Rocket rocket=spring.getBean("rocket",Rocket.class);
		System.out.println(rocket);
	    System.out.println(rocket.getName());	
		System.out.println(rocket.getCountry());;
		System.out.println(rocket.getBudget());;
		
		
		Rocket rocket1=spring.getBean("rock",Rocket.class);
		System.out.println(rocket1);
		System.out.println(rocket1.getName());
		System.out.println(rocket1.getCountry());
		System.out.println(rocket1.getBudget());
		
		
		Actor actor=spring.getBean("actor",Actor.class);
		System.out.println(actor);
		System.out.println(actor.getName());
		System.out.println(actor.getLanguage());
		System.out.println(actor.getAge());
		
		
		Actor act1=spring.getBean("acting",Actor.class);
		System.out.println(act1);
	    System.out.println(act1.getName());
	    System.out.println(act1.getLanguage());
	    System.out.println(act1.getAge());
		
	    
	    Season s=spring.getBean("season",Season.class);
	    System.out.println(s);
	    System.out.println(s.getName());
	    System.out.println(s.getDuration());
	    System.out.println(s.getStartingMonth());
	    
	    Season s2=spring.getBean("ses",Season.class);
	    System.out.println(s2);
	    System.out.println(s2.getName());
	    System.out.println(s2.getDuration());
	    System.out.println(s2.getStartingMonth());
	}

}
