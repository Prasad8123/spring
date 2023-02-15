package com.xworkz.spring.services;

import com.xworkz.spring.dtos.FirstAidDto;
import com.xworkz.spring.exception.DtoIsNotValidException;

public interface FirstAidServices {
	
	
	boolean containsAndValidation(FirstAidDto aidDto) throws DtoIsNotValidException;

}
