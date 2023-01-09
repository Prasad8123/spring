package com.xworkz.spring.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.classes.SpringBoolean;
import com.xworkz.spring.classes.SpringDouble;
import com.xworkz.spring.classes.SpringStr;
import com.xworkz.spring.classes.Springlist;
import com.xworkz.spring.classes.Springmap;
import com.xworkz.spring.classes.Springstrbuff;
import com.xworkz.spring.classes.Springstrbuild;


public class SpringRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("----------String--------------------");
		ApplicationContext spring=new AnnotationConfigApplicationContext(SpringStr.class);
		
		System.out.println("------------boolean----------------------------");
		
		ApplicationContext spring1=new AnnotationConfigApplicationContext(SpringBoolean.class);
		
		SpringBoolean ref=spring1.getBean(SpringBoolean.class);
		System.out.println(ref.test());
		System.out.println(ref.getString());
		System.out.println(ref.city());
		System.out.println(ref.java());
		
		System.out.println("------------------double------------------------");
		
		ApplicationContext spring2=new AnnotationConfigApplicationContext(SpringDouble.class);
		
		SpringDouble ref1=spring2.getBean(SpringDouble.class);
		System.out.println(ref1.rate());
		System.out.println(ref1.dosa());
		System.out.println(ref1.loptop());
		
		
		System.out.println("----------------ArrayList------------------------");
		
		ApplicationContext spring3=new AnnotationConfigApplicationContext(Springlist.class);
		
	          System.out.println("-------------hashmap----------------------");
  
	     ApplicationContext spring4=new AnnotationConfigApplicationContext(Springmap.class);
		
	     
	     System.out.println("------------string buffer-----------------------");
	     
	     ApplicationContext spring5=new AnnotationConfigApplicationContext(Springstrbuff.class);
	     
	     Springstrbuff br=spring5.getBean(Springstrbuff.class);
	     System.out.println(br.getString());
	     System.out.println(br.test());
	     System.out.println(br.name());
	     System.out.println(br.ref());
	     
	     
	       System.out.println("------------string buffer builder-----------------------");
	     
	     ApplicationContext spring6=new AnnotationConfigApplicationContext(Springstrbuild.class);
	     Springstrbuild bd=spring6.getBean(Springstrbuild.class);
	     System.out.println(bd.getString());
	     System.out.println(bd.name());
	}

}
