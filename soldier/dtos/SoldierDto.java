package com.xworkz.soldier.dtos;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SoldierDto extends AbstractAuditDto {
	
	@NotNull
	@NotBlank
	@Size(min=3,max=20, message="name should be greater than 3 and lesser than 20")
	private String name;
	@Min(value=1,message ="id should be greater than 0")
	@Max(value=10,message="id should be lesser than 10 ")
	private int id;
	@Min(value=18,message="age should be greater than 18")
	@Max(value=35,message="age should be lessar than 35")
	private int age;
	@NotNull
	@NotBlank
	@Size(min=3,max=10,message ="rank should be min is 3 max is 10")
	private String rank;
	@NotNull
	@NotBlank
	@Size(min=4,max=30,message="conutry should be min is 4 max is 30")
	private String country;
	@NotNull
	@NotBlank
	@Size(min=3,max=20,message="batallian is should be min is 3 max is 20")
	private String batallian;

}
