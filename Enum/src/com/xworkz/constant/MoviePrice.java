package com.xworkz.constant;

public enum MoviePrice {

	Kgf(120,5438790l,12);
	
	private int price;
	private Long gst;
	private double discount;
	
	private MoviePrice(int price, Long gst, double discount) {
		this.price=price;
		this.gst=gst;
		this.discount=discount;
		
	}
	
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Long getGst() {
		return gst;
	}
	public void setGst(Long gst) {
		this.gst = gst;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	
	
	
	
}
