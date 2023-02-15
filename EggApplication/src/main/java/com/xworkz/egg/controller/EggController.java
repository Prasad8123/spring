package com.xworkz.egg.controller;

import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.egg.dto.EggDto;
import com.xworkz.egg.service.EggService;

@Controller
@RequestMapping("/egg")
public class EggController {
	
	@Autowired
	private EggService eggService;
	
	public EggController() {
		
		System.out.println("created :"+this.getClass().getSimpleName());
	}
	
    @PostMapping
	public String getEgg(EggDto dto)
	{
		System.out.println("running getEgg.....");
	Set<ConstraintViolation<EggDto>> violation=this.eggService.validateAndSave(dto);
	if(!violation.isEmpty())
	{
		System.err.println("validation is  occuring give correct data....");
		
		
	}
	else
	{
		System.out.println("validation is not occuring.. data is entered is registered successfully......");
	               // violation.forEach(s->System.out.println("saved :"+s));
	}
	       
		return "Success";
	}
}
