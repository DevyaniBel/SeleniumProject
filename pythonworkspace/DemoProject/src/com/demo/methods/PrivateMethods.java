package com.demo.methods;

public class PrivateMethods {

	public void apply() {
		
		System.out.println("Apply Called");
		this.validate();
	}
	private void validate(){

		System.out.println("Validate Called");

	}	
}
