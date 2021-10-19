package com.spring.hackerearth.exception;

public class InvalidRecipeId extends RuntimeException{
	
	private String message;

	@Override
	public String toString() {
		return "InvalidRecipeId [message=" + message + "]";
	}

	public InvalidRecipeId(String message) {
		super();
		this.message = message;
	}
	

}
