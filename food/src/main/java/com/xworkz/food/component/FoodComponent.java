package com.xworkz.food.component;


import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class FoodComponent {

	public FoodComponent() {

		System.out.println("created :" + this.getClass().getSimpleName());
	}

	@GetMapping("/food")
	public String onFood(@RequestParam String name,@RequestParam String type,@RequestParam int quantity,@RequestParam double price) {
		System.out.println("Food Name :" + name);
		System.out.println("Food Type :" + type);
		System.out.println("Food Quantity :" + quantity);
		System.out.println("Food Price :" + price);

		return "foodItem.jsp";
	}

}
