package com.demo.methods;

public class ProtectedMethod {

	protected void userNameDisplay() {
		System.out.println("Mr. Peter username MrPeter");
	}

	protected void passDisplay() {
		System.out.println("Password is 12345");
	}
	public static void main(String[] args) {
		ProtectedMethod promethod = new ProtectedMethod();
		promethod.userNameDisplay();
		promethod.passDisplay();
	}
}