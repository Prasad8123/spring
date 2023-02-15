package com.xworkz.spring.dtos;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@NoArgsConstructor
@Setter
@Getter
@ToString
public abstract class AbstractAuditDto implements Serializable{
	
	
	private String created;
	private LocalDateTime createdDate;
	private String updated;
	private LocalDateTime updatedDate;
	

}
