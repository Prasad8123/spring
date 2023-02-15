package com.xworkz.spring.services;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.spring.dtos.FirstAidDto;
import com.xworkz.spring.exception.DtoIsNotValidException;
import com.xworkz.spring.repository.FirstaidRepository;


@Component
public class FirstAidServicesImpl implements FirstAidServices {
	
	@Autowired
	private Validator validator;
	@Autowired
	private FirstaidRepository repository;
	
	
      public FirstAidServicesImpl() {
    	  
    	  System.out.println("FirstAidServicesImpl const with no arugs.......");
	}
	
	
	@Override
	public boolean containsAndValidation(FirstAidDto aidDto) throws DtoIsNotValidException
	{
		System.out.println("containsAndValidation method started");
		
		System.out.println("first aid dto passed : " +aidDto);
	    
		
		Set<ConstraintViolation<FirstAidDto>> violation = this.validator.validate(aidDto);
		if(!violation.isEmpty())
		{
			throw new DtoIsNotValidException();
			
		}
		else
		{
			System.out.println("data is vaild");
			boolean saved=this.repository.save(aidDto);
			System.out.println("saved first aid : " +saved);
			System.out.println("containsAndValidation method ended");

			
			return saved;
			
		}	
		
	}

}
