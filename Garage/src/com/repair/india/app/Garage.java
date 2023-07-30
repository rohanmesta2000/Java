package com.repair.india.app;


public class Garage {
	public Mechanic mechanic=new Mechanic();
	public void protectVehical()
	{
		System.out.println("Invoking protectVehical() in Garage");
		this.mechanic.modify();
	}
	public void multifunction()
	{
		System.out.println("Invoking multifunction() in Garage");
		this.mechanic.repair();
	}

}
