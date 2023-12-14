package com.xworkz.app;

public interface Car {
	int model();
	
	Car car=()->{
		System.out.println("Invoking in car Speed");
		return 100;
	};
	
	public static void main(String[] args) {
		int c=car.model();
		System.out.println(c);
		
	}
	
	

}
