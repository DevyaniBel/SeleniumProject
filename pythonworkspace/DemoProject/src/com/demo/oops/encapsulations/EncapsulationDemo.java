package com.demo.oops.encapsulations;

public class EncapsulationDemo {
	private int balance = 100000;
	private String customerName = "Vishal";
	int FDamount = 30000;
	static String password ="Ramesh";

	public int getBalance(String cn) {
		if (cn == customerName) {
			System.out.println("Account balance is +balance");
			return balance;

		}else {
			System.out.println("Invalid Customer Name");
			return 0;
		}
	}
	public void setBalance(int balance1,String cn) {
		if (cn == customerName) {
			this.balance = balance+balance1;   //always represents instance variable
			System.out.println("Account balance is +balance1");

		}else { 
			System.out.println("Invalid Customer Name");
		}
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getFDamount() {
		return FDamount;
	}
	public void setFDamount(int fDamount) {
		FDamount = fDamount;
	}
	public static String getPassword() {
		return password;
	}
	public static void setPassword(String password) {
		EncapsulationDemo.password = password;
	}
	public EncapsulationDemo() {
		// TODO Auto-generated constructor stub
	}

}
