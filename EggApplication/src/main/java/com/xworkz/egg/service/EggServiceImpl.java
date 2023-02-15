package com.xworkz.egg.service;

import java.util.Collections;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.egg.dto.EggDto;
import com.xworkz.egg.repository.EggRepository;

@Service
public class EggServiceImpl implements EggService {

	@Autowired
	private EggRepository eggRepository;

	public EggServiceImpl() {

		System.out.println("created :" + this.getClass().getSimpleName());
	}

	@Override
	public Set<ConstraintViolation<EggDto>> validateAndSave(EggDto dto) {

		System.out.println("runnning validateAndSave for EggServiceImpl....");
		System.out.println("dto:"+dto);
		ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();

		Validator validator = validatorFactory.getValidator();
		Set<ConstraintViolation<EggDto>> violation = validator.validate(dto);

		if (violation != null && !violation.isEmpty())

		{
			System.err.println("Enterd data is not valied....");
			violation.forEach(s -> System.err.println(s.getMessage()));
			return violation;
		} else {
			System.out.println("Entered data is vailed......");
			boolean saved = this.eggRepository.save(dto);
			System.out.println("saved :" + saved);
			return Collections.emptySet();
		}

	}

}
