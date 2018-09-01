package com.demo.oops.interfaces;

public interface Enemy {

	public void speak(); 
	// TODO Auto-generated constructor stub
	public abstract void moveTo(int x, int y); //only signature, no body
	public abstract void attack(String code);
	public abstract void heal (int percentage);
	public abstract void evenOnDeath();

	public void run();


}

