package com.xworkz.spring.repository;

import org.springframework.stereotype.Component;

import com.xworkz.spring.dtos.MissileDto;
import com.xworkz.spring.exception.ArrayOutOfSizeException;

@Component
public class MissileRepoImpl implements MissileRepository{
	
	
	int i=0;
	MissileDto dto[]=new MissileDto[3];
	
	public MissileRepoImpl() {
		System.out.println("MissileRepoImpl const with no arugms....");
	}

	@Override
	public boolean save(MissileDto missileDto) throws ArrayOutOfSizeException {
		
		System.out.println("save method started");
		System.out.println("missile dto passed : " + missileDto );
		if(this.dto.length >5)
		{
			dto[i++]=missileDto;
			for(int i=0; i<dto.length;i++)
			{
				System.out.println(dto[i]);
			}
			
		}
		else
			{
				throw new ArrayOutOfSizeException();
			}
		System.out.println("save method ended");

		return true;
		}
		
	

}
