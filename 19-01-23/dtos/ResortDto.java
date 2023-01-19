package com.xworkz.spring.dtos;

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
public class ResortDto extends AbstractAuditDto {
	
	
	@NotNull
	@Size(min=3,max=20,message="name should be greater than 3 and lesser than 20")
	private String name;
	

	@NotNull
	@Size(min=5,max=40,message="location should be greater than 3 and lesser than 20")
	private String location;
	

}
