package com.xworkz.DTO;

import com.xworkz.constant.ShoeSize;
import com.xworkz.constant.ShoeType;

public class ShoeDTO {

private String brand;
private ShoeSize size;
private ShoeType type;
private int cost;
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public ShoeSize getSize() {
	return size;
}
public void setSize(ShoeSize size) {
	this.size = size;
}
public ShoeType getType() {
	return type;
}
public void setType(ShoeType type) {
	this.type = type;
}
public int getCost() {
	return cost;
}
public void setCost(int cost) {
	this.cost = cost;
}


@Override
public String toString() {
	return "ShoeDTO [brand=" + brand + ", size=" + size + ", type=" + type + ", cost=" + cost + "]";
}
public ShoeDTO() {
	super();
	this.brand = brand;
	this.size = size;
	this.type = type;
	this.cost = cost;
}





	
}
