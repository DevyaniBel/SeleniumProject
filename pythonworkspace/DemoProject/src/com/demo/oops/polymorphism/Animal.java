package com.demo.oops.polymorphism;

public class Animal {
	public void makenoise() {
		System.out.println("Some sound");

	}
	public void makenoise(String y) {
		System.out.println("Some sound");

	}
	public void makenoise(int x) {
		System.out.println("Some sound");

	}
}
class Dog extends Animal{
	public void makenoise(int x) {
		// TODO Auto-generated method stub
		super.makenoise(x);
	}
}
class Cat extends Animal{
	public void make1() {

	}

}
class Rat extends Dog{
	public void make() {

	}
	public void make (int x) {

	}
}
class Man extends Rat{
	public void make() {
		
	}
	public void make1() {
		
	}
	public void make (int x) {

	}
	

}