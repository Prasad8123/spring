package com.xworkz.soldier.services;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.soldier.dtos.SoldierDto;
import com.xworkz.soldier.repositry.SoldierRepostry;

public class SoldierServicesImpl implements SoldierServices{
	
	
	public SoldierRepostry repostry;
	
	public SoldierServicesImpl() {
		
		System.out.println("SoldierServicesImpl const with no argums...");
	}
	
	public void setSoldierRepostry(SoldierRepostry repostry)
	{
		this.repostry=repostry;
	}

	@Override
	public boolean containsAndValidation(SoldierDto dto) {
		
		
		System.out.println("containsAndValidation method is started");
		
		System.out.println("dto passed : " +dto);
		
		 ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
		    Validator validator= factory.getValidator();
		    Set<ConstraintViolation<SoldierDto>> violation=validator.validate(dto);
		    if(!violation.isEmpty())
		    {
		    	System.err.println("there is a error");
		    	violation.forEach(v->System.err.println(v.getMessage()));
		    	return false;
		    }
		    
		    else
		    {
		    	System.out.println("data is valid");
		    	boolean saved= repostry.save(dto);
		    	System.out.println("dto is saved using reposirty : " +saved);
		   
		    	return saved;
		    }
		    
		
	//	System.out.println("containsAndValidation method is ended");

	//	return true;
	}

}
