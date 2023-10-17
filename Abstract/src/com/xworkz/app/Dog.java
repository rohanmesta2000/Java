package com.xworkz.app;

public class Dog {
	
		public void makeSound() {
			System.out.println("invoking makeSound() in Dog");
		}

		public void eat() {
			System.out.println("invoking eat() in Dog");
		}

		
		public void sleep() {
			System.out.println("invoking sleep() in Dog");
		}

		
		public String getType() {
			System.out.println("invoking getType() in Dog");
			return "Dog";
		}

		
		public boolean isPet() {
			System.out.println("invoking isPet() in Dog");
			return true;
		}
	}


