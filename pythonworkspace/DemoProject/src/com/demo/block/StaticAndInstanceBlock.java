package com.demo.block;

public class StaticAndInstanceBlock {

	int speed;
	static String city = "Delhi";

	public StaticAndInstanceBlock() {
		System.out.println("Speed pf Car is " + speed+" Test drive city is "+city);
	}
	{
		speed = 120 ;
		System.out.println("Instance Block executed");
	}
	static {
		city = "Mumbai";
		System.out.println("Static block executed");
	}

	public static void main(String[] args) {
		StaticAndInstanceBlock s1 = new StaticAndInstanceBlock();


	}

}
