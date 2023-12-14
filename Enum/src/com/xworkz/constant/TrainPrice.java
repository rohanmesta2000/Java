package com.xworkz.constant;

public enum TrainPrice {
	FIRST_CLASS(90),SECOND_CLASS(150),SLEEPER_CLASS(450);
	
	private int price;
	private TrainPrice(int price) {
		this.price=price;
	
	}
	public int getPrice() {
		return price;
	}
	
}
