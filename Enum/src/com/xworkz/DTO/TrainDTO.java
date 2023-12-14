package com.xworkz.DTO;

import com.xworkz.constant.TrainPrice;

public class TrainDTO {

	private String name;
	private TrainPrice price;
	private int seatNo;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public TrainPrice getPrice() {
		return price;
	}
	public void setPrice(TrainPrice price) {
		this.price = price;
	}
	public int getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}
	@Override
	public String toString() {
		return "TrainDTO [name=" + name + ", price=" + price + ", seatNo=" + seatNo + "]";
	}
	public TrainDTO(String name, TrainPrice price, int seatNo) {
		super();
		this.name = name;
		this.price = price;
		this.seatNo = seatNo;
	}
	public TrainDTO() {
		// TODO Auto-generated constructor stub
	}
	
	
	
}


