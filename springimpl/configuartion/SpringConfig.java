package com.xworkz.spring.configuartion;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.spring.classes.Actor;
import com.xworkz.spring.classes.Rocket;
import com.xworkz.spring.classes.Season;

@Configuration
@ComponentScan("com.xworkz.spring")
public class SpringConfig {

	
	  @Bean 
	  public Rocket rock()
	  {
	  System.out.println("rocket registering with spring");
	  Rocket rock=new Rocket();
	  rock.getName();
	  rock.getCountry();
	  rock.getBudget();
	  return rock; 
	  }
	 
	@Bean
	  public Actor acting()
	  {
		  System.out.println("actor registering with spring");
		  Actor actor=new Actor("yesh","kannada",35);
		  actor.getName();
		  actor.getLanguage();
		  actor.getAge();
		  return actor;
		  
	  }
	
	
	@Bean
	public Season ses()
	{
		System.out.println("season registerd with spring");
		Season s=new Season();
		s.setName("winter");
		s.getName();
		s.setDuration("3 month");
		s.getDuration();
		s.setStartingMonth("jun");
		s.getStartingMonth();
		return s;
		
	}
	
}
