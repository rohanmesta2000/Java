package com.specs.prm.app;

public class Specs {
	public void lens() {
		System.out.println("invoking lens in main method");
		lens(1.9);
		lens("Conclave");
	}
	public void lens(double power) {
		System.out.println("invoking lens in main method");
		System.out.println("power" +power);
		
	}
	public void lens(String type) {
		System.out.println("invoking lens in main method");
		System.out.println("type" +type);
		
	}
	public void lens(double power ,String type) {
		System.out.println("invoking lens in main method");
		lens(power);
		lens(type);
		
	}
}
