package com.xworkz.egg.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@ToString
@Entity
@Table(name="egg")
public class EggDto {
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="hotelName")
	@NotNull
	@Size(min=3,max=20 , message="Enter the name greater than 3 and lesserthan 20")
	private String hotelName;
	
	@Column(name="dish")
	@NotNull
	@NotBlank(message="select at list one item inly")
	private String dish;
	
	@Column(name="dish_type")
	@NotNull
	@NotBlank(message="select at list one item inly")
	private String type;
	
	@Column(name="quantity")
	@Min(value=1 , message="enter quantity is greater than 0")
	@Max(value=5, message="enter quantity is lesser than 6")
	private Integer quantity;
	
	@Column(name="price")
	private Double price;

}
