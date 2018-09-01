package com.demo.FlowControl;

public class DoWhileLoop {

	// ***WhileLoop         till the condition is going false it wil keep on iterate

	public static void main(String[] args) {
		int i =1;
		while (i<=10) {
			System.out.println("Line " + i);
			++i;
		}
		// *******Dowhile

		do {
			System.out.println(i+ " is the value of variables");
			i = i+1;
		}
		while(i<10);
	}
}

