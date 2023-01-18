package com.xworkz.soldier.repositry;

import com.xworkz.soldier.dtos.SoldierDto;

public class SoldierRepostryImpl implements SoldierRepostry {

	
	public SoldierRepostryImpl() {
		
		System.out.println("SoldierRepostryImpl const with no argums");
	}
	
	@Override
	public  boolean save(SoldierDto dto) {
		
		System.out.println("save method strated");
		System.out.println("dto passed : "+dto);
		return true;
	}

}
