package com.xworkz.spring.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;

import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
public class FirstAidDto extends AbstractAuditDto {
	
	
	@NotNull
	@NotBlank
	@Size(min=3,max=20, message="name should be greater than 3 and lesser than 20")
	private String name;
	
	@NotNull
	@NotBlank
	@Size(min=4,max=30,message="conutry should be min is 4 max is 30")
	private String country;

}
