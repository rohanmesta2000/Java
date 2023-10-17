package com.power.i.app;

	public class Gadget {
	    public void activate() {
	        System.out.println("invoking activate in main method");
	        activate(200);
	        activate("Smart");
	    }

	    public void activate(int power) {
	        System.out.println("invoking activate in main method");
	        System.out.println("power: " + power);
	    }

	    public void activate(String type) {
	        System.out.println("invoking activate in main method");
	        System.out.println("type: " + type);
	    }

	    public void activate(int power, String type) {
	        System.out.println("invoking activate in main method");
	        activate(power);
	        activate(type);
	    }
	}

