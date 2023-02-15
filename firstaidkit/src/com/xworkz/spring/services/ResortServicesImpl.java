package com.xworkz.spring.services;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.spring.dtos.ResortDto;
import com.xworkz.spring.repository.ResortRepository;

@Component
public class ResortServicesImpl implements Resortservices {
	
	
	private Validator validator;
	private ResortRepository resortRepo;
	
	@Autowired
	public ResortServicesImpl(Validator validator, ResortRepository resortRepo) {
		
		this.validator=validator;
		this.resortRepo=resortRepo;
	}

	@Override
	public boolean containsAndValidation(ResortDto dto) {
		
		System.out.println("containsAndValidation method started");
		System.out.println("resort dto passed : " +dto);
		
		Set<ConstraintViolation<ResortDto>> violation = this.validator.validate(dto);
		if(!violation.isEmpty())
		{
			System.err.println("there is error");
			violation.forEach(v->System.err.println(v.getMessage()));
			return false;
		}
		else
		{
			System.out.println("data is valid");
			boolean saved=this.resortRepo.save(dto);
			System.out.println("saved : " +saved);
			System.out.println("containsAndValidation method ended");

			return saved;
		}
		
	}

}
