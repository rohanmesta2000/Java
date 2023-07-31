package com.Thing.india.app;



public class Lift {
	public String name;
	
	
	public Lift(String name)
	{
		this.name=name;
	}
	
	public void printInfo()
	{
		System.out.println("invoking in lift");
		System.out.println("Name of the lift is "+this.name);
	}

}