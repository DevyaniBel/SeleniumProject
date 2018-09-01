package com.demo.oops.abstraction;

public class ElectricGuitar extends StringInstrument{

	public ElectricGuitar() {
		// TODO Auto-generated constructor stub
		super();
		this.name = "Guitar";
		this.numberOfStrings = 6;
	}

	public ElectricGuitar (int numberOfStrings) {
		super();
		this.name = "Guitar";
		this.numberOfStrings = numberOfStrings;
	}
	public void play() {
		System.out.println("An Electric "+numberOfStrings+ "-string "+name + " is rocking !");

	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void click() {
		// TODO Auto-generated method stub
		
	}
}
