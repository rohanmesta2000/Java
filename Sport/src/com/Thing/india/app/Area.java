package com.Thing.india.app;



public class Area {

	public String name;
	public Corporator corporator=new Corporator("Rahul");
	public Area(String name)
	{
		System.out.println("Invoking string constructor in Area");
		this.name=name;
	}
	public void printInfo() {
		System.out.println("invoking in main");
		System.out.println("Name of the area is "+this.name);
		corporator.printInfo();
		
	}
	
	
}
