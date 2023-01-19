package com.xworkz.spring.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.configuartion.SpringConfiguartion;
import com.xworkz.spring.dtos.FirstAidDto;
import com.xworkz.spring.dtos.MissileDto;
import com.xworkz.spring.dtos.ResortDto;
import com.xworkz.spring.services.FirstAidServices;
import com.xworkz.spring.services.MissileServices;
import com.xworkz.spring.services.Resortservices;

public class SpringRunner {

	public static void main(String[] args) {
		
		
		ApplicationContext spring=new AnnotationConfigApplicationContext(SpringConfiguartion.class);
		System.out.println(Arrays.toString(spring.getBeanDefinitionNames()));
		
		
		
		FirstAidServices service=spring.getBean(FirstAidServices.class);
		
	         boolean save=service.containsAndValidation(new FirstAidDto("prasad","india"));
	         System.out.println("saved " +save);
	         
	         System.out.println(System.lineSeparator());
			
	    MissileServices missile=spring.getBean(MissileServices.class);
	         
	    boolean saved=missile.containsAndValidation(new MissileDto("Brahmos","200 km","Anti misiile"));
	    System.out.println("saved : " +saved);
	         
	      
	   System.out.println(System.lineSeparator());   
		
		Resortservices resort=spring.getBean(Resortservices.class);
		boolean b=resort.containsAndValidation(new ResortDto("re","bellary"));
		System.out.println(b);	

	}

}

