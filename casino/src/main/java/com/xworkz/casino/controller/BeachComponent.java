package com.xworkz.casino.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.casino.dto.BeachDto;



@Component
@RequestMapping("/beach")
public class BeachComponent {
	

	public BeachComponent() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
	
	@PostMapping
	public String doSend(BeachDto dto) {
		System.out.println("Running doSend");
		System.out.println(dto);
		
		return "BeachDisplay.jsp";
	}

}
