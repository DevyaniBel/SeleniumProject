package com.demo.variables;

public class StaticVariables {
	int rollno;
	String name;
	public static String college = "IIT";
	String city = "Mumbai";
	static String x= "xyz";
	//public StaticVariables(int r, String n, String college) {
	public StaticVariables(int r, String n) {

		this.rollno = r;
		this.name = n;
		//this.college = college;			//"this" keyword cannot be used on static variables
	}

	public void display(String collegeName)
	{
		college=college+collegeName;
		System.out.println(rollno+ " " + name + " " +collegeName);
	}
	public void display()
	{
		System.out.println(rollno+" "+ name+" "+college+ " "+ city);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVariables s1 = new StaticVariables (1, "John");   //can create n no. of object of same class with differ obj name
		StaticVariables s2 = new StaticVariables (2, "Chia");
		s1.display();
		s2.display();
	}

}

