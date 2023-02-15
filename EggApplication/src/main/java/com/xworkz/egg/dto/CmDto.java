package com.xworkz.egg.dto;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
public class CmDto {
	
	@NotNull
	@Size(min=3,max=20 , message="name should be greater than 3 and lesser than 20")
	private String cmName;
	@NotBlank(message="select party")
	private String party;
	@NotBlank(message="select state")
	private String state;

	private Integer tenure;
	@NotNull
	@NotBlank(message="write portfolio")
	private String portfolio;

}
