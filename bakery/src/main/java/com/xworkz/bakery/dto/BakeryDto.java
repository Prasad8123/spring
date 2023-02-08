package com.xworkz.bakery.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@AllArgsConstructor
@Setter
@Getter
@ToString
public class BakeryDto {
	
	private String bakeryName;
	private String bakeryOwnerName;
	private String bakeryOwnerWifeName;
	private boolean isMarried;
	private String famouseFor;
	private int since;

}
