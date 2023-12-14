package com.xworkz.app;

import java.io.Serializable;

public class Clone implements Serializable,Cloneable{
	int id;
	String name;
	int price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Clone [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	public Clone(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	
	@Override
	protected Clone clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return(Clone) super.clone();
		
	} 
}
