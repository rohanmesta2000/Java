package com.slip.fall.app;

	public class Ladder {
	    public void climb() {
	        System.out.println("Climbing the ladder");
	        climb(30);
	        climb("Wooden");
	    }

	    public void climb(int steps) {
	        System.out.println("Climbing the ladder");
	        System.out.println("Steps: " + steps);
	    }

	    public void climb(String material) {
	        System.out.println("Climbing the ladder");
	        System.out.println("Material: " + material);
	    }

	    public void climb(int steps, String material) {
	        System.out.println("Climbing the ladder");
	        climb(steps);
	        climb(material);
	    }

		
	
}
