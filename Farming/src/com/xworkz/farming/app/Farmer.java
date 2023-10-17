package com.xworkz.farming.app;

public class Farmer {
	private String name;
	private Land land;
	public Farmer(String name) {
		this.name=name;
	}
	public void setLand(Land land) {
		this.land=land;
	}
	public void farming() {
		System.out.println("farming in agriculture");
		this.land.cropsGrowing();
	}

}
