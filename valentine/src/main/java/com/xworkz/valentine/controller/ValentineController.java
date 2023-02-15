package com.xworkz.valentine.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.valentine.dto.ValentineDto;
import com.xworkz.valentine.service.ValentineService;

@Controller
@RequestMapping("/valentine")
public class ValentineController {
	
	private List<String> place= Arrays.asList("cubben park","BTM","Mall","x-workz",
			
			"jp nagara","indira nagara","restorant");
	
    private List<String> gift= Arrays.asList("watch","i-phone","chocolate","dress");
    
    @Autowired
    private ValentineService valentineService;
	
	public ValentineController() {
		
		System.out.println("created :"+this.getClass().getSimpleName());
	}

	@GetMapping
	public String getValentine(Model model)
	{
		System.out.println("running get valentine on get mapping.....");
		 
		model.addAttribute("place", place);
		model.addAttribute("gift", gift);
		
		return "Valentine";
	}
	
	@PostMapping
	public String getValentine(ValentineDto dto,Model model)
	{
		System.out.println("running get valentine on post mapping.....");
	Set<ConstraintViolation<ValentineDto>>	violation=this.valentineService.validateAndSave(dto);
	
	if(violation.isEmpty())
	{
		System.out.println("violation is not occuring in controller to sending the data to repo...");
		return "Success";
	}
	
	else
	{
		model.addAttribute("error", violation);
		model.addAttribute("place", place);
		model.addAttribute("gift", gift);
		System.err.println("violation is occuring in contoller...");
		return "Valentine";
	}
	}
}
