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

public class MissileDto extends AbstractAuditDto {
	
	@NotNull
	@Size(min=3,max=20,message="name should be greater than 3 and lesser than 20")
	private String name;
	@NotNull
	@Size(min=3,max=20,message="range should be greater than 3 and lesser than 20")
	private String range;
	@NotNull
	@Size(min=3,max=20,message="type should be greater than 3 and lesser than 20")
	private String type;

}
