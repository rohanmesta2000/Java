package com.Thing.india.app;

public class Floor {
	public String name;
	public int noOfFloors;
	
	public Floor(String name,int noOfFloors)
	{
		System.out.println("Invoking constructor in Floor");
		this.name=name;
		this.noOfFloors=noOfFloors;
	}

	public void printInfo() {
		System.out.println("invoking in floor");
		System.out.println("Name of the floor is"+this.name);
		System.out.println("Number of floors is "+this.noOfFloors);
		
	}

}