package com.xworkz.button.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.button.dto.BeverageDto;
import com.xworkz.button.dto.ChatDto;
import com.xworkz.button.dto.EducationDto;
import com.xworkz.button.dto.MobileDto;

@Component
@RequestMapping("/")
public class ControllerClass {
	
	public ControllerClass() {
		
		System.out.println("created :"+this.getClass().getSimpleName());
	}

	@GetMapping("/email")
	public String getEmail(Model model)
	{
		String email="Prasad.xworkz@gmail.com";
		model.addAttribute("email",email);
		return "index";
	}
	
	@GetMapping("/mobile")
	public String getMobile(Model model)
	{
		long mobile=8123858077l;
		model.addAttribute("mobile", mobile);
		return "index";
	}
	
	@GetMapping("/Aadher")
	public String getAadher(Model model)
	{
		long aadher=270051288687l;
		model.addAttribute("Aadher",aadher);
		return "index";
	}
	
	@GetMapping("/age")
	public String getAge(Model model)
	{
		int age=23;
		model.addAttribute("age", age);
		return "index";
	}
	
	@GetMapping("/dob")
	public String getDob(Model model)
	{
		LocalDateTime date= LocalDateTime.of(2000,06,24,12,00);
		model.addAttribute("date", date);
		return "index";
	}
	
	@GetMapping("/salary")
	public String getSalary(Model model)
	{
		double salary=30000;
		model.addAttribute("salary", salary);
		return "index";
	}
	
	@GetMapping("/friend")
	public String getFriend(Model model)
	{
		List<String> friend=new ArrayList<String>();
		friend.add("naveen");
		friend.add("vinayak");
		friend.add("vishak");
		friend.add("ganesha");
		friend.add("mani");
		
		model.addAttribute("friend",friend);
		return "index";
	}
	
	@GetMapping("/place")
	public String getPlace(Model model)
	{
		List<String> place=new ArrayList<String>();
		place.add("humpi");
		place.add("mysore");
		place.add("beluru");
		place.add("halebidu");
		place.add("darmasthala");
		
		model.addAttribute("place",place);
		return "index";
	}
	
	@GetMapping("/skill")
	public String getSkill(Model model)
	{
		List<String> skill=new ArrayList<String>();
		skill.add("Core Java");
		skill.add("mySql");
		skill.add("html");
		skill.add("css");
		skill.add("spring");
		skill.add("servlet");
		model.addAttribute("skill", skill);
		return "index";
	}
	
	
	@GetMapping("/edu")
	public String getEducation(Model model)
	{
		EducationDto dto=new EducationDto();
		dto.setCourceName("BE");
		dto.setDuartion("4 years");
		dto.setBranch("cse");
		dto.setSemister(8);
		dto.setFirstYearFees(40000);
		dto.setSecondYearFees(45000);
		dto.setThiredYearFees(45000);
		dto.setFourthYearFees(50000);
		
		model.addAttribute("dto", dto);
		return "index";
	}
	
	@GetMapping("/mob")
	public String getMobileDto(Model model)
	{
		MobileDto dto1 =new MobileDto("prasad",8123858077l,"ballari","Aadher",23);
		MobileDto dto2 =new MobileDto("naveen",8123676435l,"banglore","Aadher",24);
		MobileDto dto3 =new MobileDto("vinayaka",812674875l,"thumakuru","Aadher",26);
		MobileDto dto4 =new MobileDto("gaanesha",8124647564l,"shivamoga","Aadher",23);
		MobileDto dto5 =new MobileDto("sunil",81565335477l,"ballari","Aadher",22);
		
		List<MobileDto> list=new ArrayList<MobileDto>();
		list.add(dto1);
		list.add(dto2);
		list.add(dto3);
		list.add(dto4);
		list.add(dto5);

		model.addAttribute("mob", list);
		return "index";
	}
		
		@GetMapping("/beverage")
		public String getBeverageDto(Model model)
		{
			BeverageDto dto1=new BeverageDto("water", 20);
			BeverageDto dto2=new BeverageDto("milk", 30);
			BeverageDto dto3=new BeverageDto("juice", 40);
			BeverageDto dto4=new BeverageDto("wine", 100);
			BeverageDto dto5=new BeverageDto("spirites", 80);
			
			List<BeverageDto> list=new ArrayList<BeverageDto>();
			list.add(dto1);
			list.add(dto2);
			list.add(dto3);
			list.add(dto4);
			list.add(dto5);
			model.addAttribute("beve", list);
			return "index";
		}
	
		@GetMapping("/chat")
		public String getChat(Model model)
		{
			ChatDto dto1=new ChatDto("pani puri",30);
			ChatDto dto2=new ChatDto("masala puri",35);
			ChatDto dto3=new ChatDto("dry puri",40);
			ChatDto dto4=new ChatDto("masala mandaki",30);
			ChatDto dto5=new ChatDto("bel puri",40);
			ChatDto dto6=new ChatDto("vada pav",50);
			ChatDto dto7=new ChatDto("barguar",30);
			ChatDto dto8=new ChatDto("masala sondige",20);
			ChatDto dto9=new ChatDto("masala ovlaki",40);
			ChatDto dto10=new ChatDto("gobi",50);
			
			List<ChatDto> list=new ArrayList<ChatDto>();
			list.add(dto1);
			list.add(dto2);
			list.add(dto3);
			list.add(dto4);
			list.add(dto5);
			list.add(dto6);
			list.add(dto7);
			list.add(dto8);
			list.add(dto9);
			list.add(dto10);
			
			model.addAttribute("chat", list);
			
			return "index";
		}
}
