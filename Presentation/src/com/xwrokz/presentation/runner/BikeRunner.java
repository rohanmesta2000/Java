package com.xwrokz.presentation.runner;

import com.xwrokz.presentation.app.Bike;
import com.xwrokz.presentation.app.BikePresentation;

public class BikeRunner {

	public static void main(String[] args) {
		System.out.println("im riding bike");
		Bike bike = new Bike();
		Bike bike1 = new BikePresentation();
		bike1.details();
		bike.details("Ninja");
		bike.details("Ninja", 12467);
		bike.details("Ninja", 326547, "highSpeedEngine");

	}
	
	

}
