package com.xworkz.egg.service;

import java.util.Set;

import javax.validation.ConstraintViolation;

import com.xworkz.egg.dto.CmDto;



public interface CmService {
	
	
	Set<ConstraintViolation<CmDto>> validateAndSave(CmDto dto);

}
