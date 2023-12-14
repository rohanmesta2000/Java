package com.xworkz.friday.app.repository;

public class JacketImps implements Jacket{
	
	    private String[] brand = new String[MAX_JACKETS];
	   private int position;

		@Override
		public void addJacket(String brand){
			System.out.println("invoking in main method");
			 if (this.position < MAX_JACKETS) {
		            this.brand[position] = brand;
			System.out.println("Added Jacket - Brand: " + brand + "at postion"+this.position);
            this.position++;
			
		}
			 else {
		            System.err.println("Data store is fully error in the jacket list.");
		        }
	
		}
		}
