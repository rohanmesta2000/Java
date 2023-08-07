package com.food.india.app;

public class Hotel {
	public void food() {
		System.out.println("invoking heat in ironBox ");
		food(30);
		food("Dosa");
	}
	public  void food(float cost) {
		System.out.println("invoking food in hotel");
		System.out.println("Cost" +cost);
	}
	public void food(String type) {
		System.out.println("invoking food in hotel");
		System.out.println("Type" +type);
	}
	public  void food(float cost,String type) {
		System.out.println("invoking food in hotel");
		food(cost);
		food(type);
	}
}
