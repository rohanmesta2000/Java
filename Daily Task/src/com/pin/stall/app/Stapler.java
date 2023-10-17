package com.pin.stall.app;


	public class Stapler {
	    public void staple() {
	        System.out.println("Stapling with default settings");
	        staple(5);
	        staple("Standard");
	    }

	    public void staple(int pageCount) {
	        System.out.println("Stapling with specified page count: " + pageCount);
	    }

	    public void staple(String type) {
	        System.out.println("Stapling with specified type: " + type);
	    }

	    public void staple(int pageCount, String type) {
	        System.out.println("Stapling with specified page count: " + pageCount + " and type: " + type);
	        staple(pageCount);
	        staple(type);
	    }
	}


