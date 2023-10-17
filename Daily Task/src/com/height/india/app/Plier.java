package com.height.india.app;

	public class Plier {
	    public void grip() {
	        System.out.println("invoking grip in main method");
	        grip(10);
	        grip("Red");
	    }

	    public void grip(int pressure) {
	        System.out.println("invoking grip in main method");
	        System.out.println("pressure: " + pressure);
	    }

	    public void grip(String material) {
	        System.out.println("invoking grip in main method");
	        System.out.println("material: " + material);
	    }

	    public void grip(int pressure, String material) {
	        System.out.println("invoking grip in main method");
	        grip(pressure);
	        grip(material);
	    }
	}

