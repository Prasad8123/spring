package com.xworkz.bakery.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.bakery.dto.BakeryDto;
import com.xworkz.bakery.repositery.BakeryRepositery;

@Service
public class BakeryServiceImpl implements BakeryService {

	@Autowired
	private BakeryRepositery repositery;
	public BakeryServiceImpl() {
		
		System.out.println("created :"+this.getClass().getSimpleName());
	}
	
	
	@Override
	public boolean validateAndSave(BakeryDto dto) {
		
		System.out.println("Running validateAndSave for BakeryServiceImpl " +dto);
		boolean saved=this.repositery.save(dto);
		System.out.println("saved :"+saved);
		return false;
	}

}
