package com.xworkz.bakery.repositery;

import org.springframework.stereotype.Repository;

import com.xworkz.bakery.dto.BakeryDto;


@Repository
public class BakeryRepoImpl implements BakeryRepositery {
	
	public BakeryRepoImpl() {
		
		System.out.println("created :"+this.getClass().getSimpleName());
	}

	@Override
	public boolean save(BakeryDto dto) {
		
		System.out.println("running save for BakeryRepoImpl "+dto);
		return false;
	}

}
