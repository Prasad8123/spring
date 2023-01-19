package com.xworkz.spring.services;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.spring.dtos.MissileDto;
import com.xworkz.spring.repository.MissileRepository;


@Component
public class MissileServicesImpl implements MissileServices{

	
	private Validator validator;
	
	@Autowired
	private MissileRepository missileRepo;
	
	@Autowired
	public MissileServicesImpl(Validator validator) {
		
		this.validator=validator;
	}
	
	
	
	@Override
	public boolean containsAndValidation(MissileDto missileDto) {
		
		System.out.println("containsAndValidation method started");
		System.out.println("missile dto passed : " +missileDto);
		
		Set<ConstraintViolation<MissileDto>>violation=this.validator.validate(missileDto);
		if(!violation.isEmpty())
		{
			System.err.println("data is error");
			violation.forEach(v->System.err.println(v.getMessage()));
			return false;
		}
		else
		{
			System.out.println("data is valid");
			boolean saved=this.missileRepo.save(missileDto);
			System.out.println("saved :"+saved);
			System.out.println("containsAndValidation method ended");
			return saved;
		}
		
	}

}
