package com.demo.variables;

public class LocalVariables {

	public void salary(int salesbonus) {
		int currentmonthbonus=salesbonus;
		int sal =1000; //local variables which are only devlare in its method
		int days = 30;
		sal = sal + currentmonthbonus;

		System.out.println("Salary is  "+ sal);
		System.out.println("Days " +days);
	}

	//public void m1() {

	//System.out.println("Salary of m1 method is " + );
	//}
	public static void main (String args[]) {
		LocalVariables m = new LocalVariables();
		m.salary(0);
	}

}
