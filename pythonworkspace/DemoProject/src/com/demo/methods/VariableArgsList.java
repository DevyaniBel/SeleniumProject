package com.demo.methods;

public class VariableArgsList {

	static void displayAll(int...test) {  //at a time one datatype will be accessible
		for (int value : test) {
			System.out.println(value);
		}
		System.out.println("Done");
	}
	public static void main(String[] args) {
		displayAll(100,200);
		displayAll(0,10,20,30);
		displayAll();
	}

}
