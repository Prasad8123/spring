package com.xworkz.spring.repository;

import com.xworkz.spring.dtos.MissileDto;
import com.xworkz.spring.exception.ArrayOutOfSizeException;

public interface MissileRepository {
	
	boolean save(MissileDto missileDto) throws ArrayOutOfSizeException;

}
