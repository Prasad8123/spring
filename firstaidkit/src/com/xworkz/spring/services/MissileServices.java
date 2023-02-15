package com.xworkz.spring.services;

import com.xworkz.spring.dtos.MissileDto;
import com.xworkz.spring.exception.ArrayOutOfSizeException;

public interface MissileServices {
	
	boolean containsAndValidation(MissileDto missileDto) throws ArrayOutOfSizeException;

}
