package com.xworkz.bowser.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.bowser.beans.Airtel;
import com.xworkz.bowser.beans.Jio;
import com.xworkz.bowser.beans.Provider;
import com.xworkz.bowser.configuartion.SpringConfig;

public class Runner {

	public static void main(String[] args) {

		ApplicationContext spring = new AnnotationConfigApplicationContext(SpringConfig.class);
		System.out.println(Arrays.toString(spring.getBeanDefinitionNames()));
		System.out.println(spring.getBeanDefinitionCount());

		Airtel airtel = spring.getBean(Airtel.class);
		airtel.getProvider();

		Jio jio = spring.getBean(Jio.class);
		jio.getProvider();

	}

}
