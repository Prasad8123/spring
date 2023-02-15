package com.xworkz.casino.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.casino.dto.BeachDto;

@Component
@RequestMapping("/beach")
public class BeachController {
	
	public BeachController() {
		
		System.out.println("created :" + this.getClass().getSimpleName());
	}

	@PostMapping
	public String getDisplay(BeachDto dto)
	{
		System.out.println("Running getDisplay....");
		
		System.out.println("DTO :"+dto);
		
		return "BeachDisplay.jsp";
	}
}
