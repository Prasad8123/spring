package com.xworkz.egg.controller;

import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.egg.dto.CmDto;
import com.xworkz.egg.service.CmService;



@Controller
@RequestMapping("/cm")
public class CmController {
	
	@Autowired
	private CmService cmService;
	
	public CmController() {
		
		System.out.println("created :"+this.getClass().getSimpleName());
	}

	@PostMapping
	public String getCm(CmDto dto)
	{
		System.out.println("running get cm .......");
		
		Set<ConstraintViolation<CmDto>>violation=this.cmService.validateAndSave(dto);
		if(!violation.isEmpty())
		{
			System.err.println("violation is occure..");
		}
		else
		{
			System.out.println("violation is not occure...");
		}
		
		return "Cm";
	}
}
