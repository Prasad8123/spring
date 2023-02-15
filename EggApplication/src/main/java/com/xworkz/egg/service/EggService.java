package com.xworkz.egg.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.egg.dto.EggDto;

public interface EggService {
	
	
	Set<ConstraintViolation<EggDto>> validateAndSave(EggDto dto);

}
