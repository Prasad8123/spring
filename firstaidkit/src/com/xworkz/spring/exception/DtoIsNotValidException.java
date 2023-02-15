package com.xworkz.spring.exception;

public class DtoIsNotValidException extends Exception {
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "data is not vaild";
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "data is not valid";
		
	}

}
