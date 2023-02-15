package com.xworkz.spring.repository;

import org.springframework.stereotype.Component;

import com.xworkz.spring.dtos.FirstAidDto;


@Component
public class FirstaidRepositoryImpl implements FirstaidRepository {
	
	
	
	public FirstaidRepositoryImpl() {
		
		System.out.println("FirstaidRepositoryImpl const with no args..");
	}

	@Override
	public boolean save(FirstAidDto aidDto) {
		
		System.out.println("save method is started");
		System.out.println("first aid dto passed : " +aidDto);
		System.out.println("save method is started");
		return true;
	}

}
