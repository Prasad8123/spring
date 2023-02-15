package com.xworkz.valentine.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
public class ValentineDto {
	
	@Size(min=3 ,max=20 ,message="name should be greater than 3 and lesser than 20")
	private String name;
	@Size(min=3 ,max=20 ,message="name should be greater than 3 and lesser than 20")
	private String valentineName;
	@NotBlank(message="place should be selected")
	private String place;
	@NotBlank(message="gift should be selected")
	private String gift;

}
