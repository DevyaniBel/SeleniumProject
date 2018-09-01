package com.demo.FlowControl;

public class Ifelse {

	public static void main(String[] args) {
		int negativenumber = -22;
		boolean isNumber = false;
		int number = 0;
		int n1 = 7, n2 = 4, n3 = 3, largestNumber;
		String s1 = "I am an Indian";

		/*		if(isNumber) 

			System.out.println("Its a Number");//for only single line do not require curly braces

		if (negativenumber < 0) {  //else is a optional not a mandatory
			System.out.println("Its a negative one. Change it!");
			negativenumber = (-1) * negativenumber;
			System.out.println(negativenumber);
		}

		//--------------------------------------------------------
		int i = 10;
		if(9<10 || 11>=10 || i>=10) 
			System.out.println("It's true......!!");

		else 
			System.out.println("Its' not a number");

		if (negativenumber < 0) {  //else is a optional not a mandatory
			System.out.println("Its a negative one. Change it!");
			negativenumber = (-1) * negativenumber;
			System.out.println(negativenumber);
		}else
			System.out.println("Its a positive number");

		//---	--------------------------------------------------------------		

		if (number>0)
			System.out.println("Its positive number");

		else if(number<0)
			System.out.println("Its a negative number");

		else
		{
			System.out.println("Its a number");
		}*/
		/*if (s1.contains(" Indian")) {
			System.out.println("Test case passed");
		}else {
			System.out.println("Test case failed");
		}*/
		//--------------------------nestedif-----------------------------------------
		int i= 6;
		if(n1 > n2) //n1 = 7, n2= 4, n3 = 3
		{
			if (n1 > n3) {
				largestNumber = n1;
			}
			else {
				largestNumber = n3;
			}
		}
		else {
			if (n2>=n3) {
				largestNumber = n2;
			}
			else {
				largestNumber = n3;
			}
		}
		System.out.println("LargestNumber is "+largestNumber);
		if (!(i<5)) {
			System.out.println("Passed");
		}
		else {
			System.out.println("Failed");
		}
	}

}
