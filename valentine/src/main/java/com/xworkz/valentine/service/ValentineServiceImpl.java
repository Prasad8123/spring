package com.xworkz.valentine.service;


import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.valentine.dto.ValentineDto;
import com.xworkz.valentine.entity.ValentineEntity;
import com.xworkz.valentine.repository.ValentineRepository;

@Service
public class ValentineServiceImpl implements ValentineService {
	
	@Autowired
	private ValentineRepository valentineRepository;
	
	public ValentineServiceImpl() {
		
		System.out.println("created :"+this.getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<ValentineDto>> validateAndSave(ValentineDto dto) {
		
		System.out.println("running validate and save.....");
		
	ValidatorFactory validatorFactory=	Validation.buildDefaultValidatorFactory();
	Validator  validator=validatorFactory.getValidator();
         Set<ConstraintViolation<ValentineDto>> violation=  validator.validate(dto);
         
         if(violation !=null && !violation.isEmpty())
         {
        	 System.err.println("violation is occuring in service.....");
        	 violation.forEach(e->System.err.println(e.getMessage()));
        	 return violation;
         }
		
         else
         {
        	 System.out.println("violation is not occuring in service.....");
        	
        	 ValentineEntity entity=new ValentineEntity();
        	 entity.setName(dto.getName());
        	 entity.setValentineName(dto.getValentineName());
        	 entity.setPlace(dto.getPlace());
        	 entity.setGift(dto.getGift());
        	 this.valentineRepository.save(entity);
        	 
        	 return Collections.emptySet();
         }
	}

}
