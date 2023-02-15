package com.xworkz.valentine.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name="valentine_table")
public class ValentineEntity {
	
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="valentineName")
	private String valentineName;
	
	@Column(name="place")
	private String place;
	
	@Column(name="gift")
	private String gift;



}
