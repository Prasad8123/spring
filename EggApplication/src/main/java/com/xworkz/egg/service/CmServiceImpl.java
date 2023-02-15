package com.xworkz.egg.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;


import org.springframework.stereotype.Service;

import com.xworkz.egg.dto.CmDto;




@Service
public class CmServiceImpl implements CmService {
	

	
	public CmServiceImpl() {
		
		System.out.println("created :"+this.getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<CmDto>> validateAndSave(CmDto dto) {
   
		System.out.println("running validateAndSave...." +dto);
		
		ValidatorFactory validatorFactory=Validation.buildDefaultValidatorFactory();
		    Validator validator= validatorFactory.getValidator();
		    
		   Set<ConstraintViolation<CmDto>> violation=validator.validate(dto);
		   
		   if(violation !=null && !violation.isEmpty())
		   {
			   System.err.println("data is not validate....");
			   violation.forEach(s->System.err.println(s.getMessage()));
			   return violation;
		   }
		
		   else
		   {
			   System.out.println("data is validate...");
			
			   return Collections.emptySet();
		   }
	}

}
