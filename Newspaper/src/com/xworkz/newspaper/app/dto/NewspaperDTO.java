package com.xworkz.newspaper.app.dto;

import java.io.Serializable;

public class NewspaperDTO implements Serializable{
	private int price;
	private String name;
	private String brand;
	private int noOfPages;
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getNoOfPages() {
		return noOfPages;
	}
	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}
	public NewspaperDTO(int price, String name, String brand, int noOfPages) {
		super();
		this.price = price;
		this.name = name;
		this.brand = brand;
		this.noOfPages = noOfPages;
	}
	
	
	

}
