package com.xworkz.soldier.boot;

import com.xworkz.soldier.dtos.SoldierDto;
import com.xworkz.soldier.repositry.SoldierRepostry;
import com.xworkz.soldier.repositry.SoldierRepostryImpl;
import com.xworkz.soldier.services.SoldierServicesImpl;

public class SoldierRunner {

	public static void main(String[] args) {
		
		
		SoldierDto dto1=new SoldierDto("prasad", 1, 23, "1st rank", "india", "leader");
		SoldierDto dto2=new SoldierDto("naveen", 2, 24, "2st rank", "india", "co-leader");
	
		
		SoldierServicesImpl soldier=new SoldierServicesImpl();
		
		SoldierRepostry repostry=new SoldierRepostryImpl();
		soldier.setSoldierRepostry(repostry);
		soldier.containsAndValidation(dto1);
		
		
		SoldierRepostry repostry1=new SoldierRepostryImpl();
		soldier.containsAndValidation(dto2);
		soldier.setSoldierRepostry(repostry1);
		
		
		
		
	
		
		

		
		

	}

}
