package com.xworkz.bakery.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.bakery.dto.BakeryDto;
import com.xworkz.bakery.service.BakeryService;

@Controller
@RequestMapping("/bakery")
public class BakeryControler {
	@Autowired
	private BakeryService bakeryService;
	
	public BakeryControler() {
		
		System.out.println("created :"+this.getClass().getSimpleName());
	}
	
	@PostMapping
	public String getBakeryDetails(BakeryDto dto ,Model model)
	{
		System.out.println("Running getBakeryDto  : "+dto);
		model.addAttribute("bakeryName", dto.getBakeryName());
		model.addAttribute("bakeryOwnerName", dto.getBakeryOwnerName());
		model.addAttribute("bakeryOwnerWifeName", dto.getBakeryOwnerWifeName());
		model.addAttribute("isMarried", dto.isMarried());
		model.addAttribute("bakerySince", dto.getSince());
		model.addAttribute("bakeryFamousFor", dto.getFamouseFor());
	     boolean saved =this.bakeryService.validateAndSave(dto);
	     System.out.println("Saved : "+saved);
		return "Display";
	}

}
