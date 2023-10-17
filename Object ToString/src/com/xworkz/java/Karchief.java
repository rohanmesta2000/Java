package com.xworkz.java;

public class Karchief {
	
		private String karchiefName;
	    private String pattern;
	    private double length;
	    private String material;
	    private boolean isPrinted;
	    private String manufacturer;
	    private int numberOfLayers;
	    

	    public Karchief() {

	    }

	    public Karchief(String karchiefName, String pattern, double length,String material, boolean isPrinted, String manufacturer, int numberOfLayers) {
	        this.karchiefName = karchiefName;
	        this.pattern = pattern;
	        this.length = length;
	        this.material = material;
	        this.isPrinted = isPrinted;
	        this.manufacturer = manufacturer;
	        this.numberOfLayers = numberOfLayers;
	    }

	    @Override
	    public String toString() {
	        return "Karchief Name: " + karchiefName +  "\nPattern: " + pattern + "\nLength: " + length + "\nMaterial: " + material + "\nIs Printed: " + isPrinted +  "\nManufacturer: " + manufacturer + "\nNumber of Layers: "+ numberOfLayers;
	    }
	}

