package com.demo.variables;
public class InstanceVariables {

	public String name;

	private int marks;

	public InstanceVariables (String StudName) {
		this.name = StudName;
	}

	public void setMarks(int StudMarks) {
		marks = StudMarks;
	}

	public void printStud(){
		System.out.println("Student Name = " +name);
		System.out.println("Marks = " + marks);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceVariables s = new InstanceVariables("John");
		s.setMarks(80);
		s.printStud();


	}

}
