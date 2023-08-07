package com.rain.oo.app;

public class Umbrella {
	public void open() {
		System.out.println("invoking open in main method");
		open(300);
		open("Black");
	}
	public void open(double cost) {
		System.out.println("invoking oepn in main method");
		System.out.println("cost" +cost);
		
	}
	public void open(String color) {
		System.out.println("invoking open in main method");
		System.out.println("color" +color);
		
	}
	public void open(double cost ,String color) {
		System.out.println("invoking open in main method");
		open(cost);
		open(color);
		
	}

}
