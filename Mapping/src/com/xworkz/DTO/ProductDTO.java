package com.xworkz.DTO;

import java.time.LocalDate;

public class ProductDTO implements Comparable<ProductDTO> {

  private String name;
  private int price;
  private int id;
  private int quantity;
  private LocalDate mfgDate;
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
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public LocalDate getMfgDate() {
	return mfgDate;
}
public void setMfgDate(LocalDate mfgDate) {
	this.mfgDate = mfgDate;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + id;
	result = prime * result + ((mfgDate == null) ? 0 : mfgDate.hashCode());
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + price;
	result = prime * result + quantity;
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	ProductDTO other = (ProductDTO) obj;
	if (id != other.id)
		return false;
	if (mfgDate == null) {
		if (other.mfgDate != null)
			return false;
	} else if (!mfgDate.equals(other.mfgDate))
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (price != other.price)
		return false;
	if (quantity != other.quantity)
		return false;
	return true;
}
@Override
public String toString() {
	return "ProductDTO [name=" + name + ", price=" + price + ", id=" + id + ", quantity=" + quantity + ", mfgDate="
			+ mfgDate + "]";
}
public ProductDTO(String name, int price, int id, int quantity, LocalDate mfgDate) {
	super();
	this.name = name;
	this.price = price;
	this.id = id;
	this.quantity = quantity;
	this.mfgDate = mfgDate;
}
public ProductDTO() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public int compareTo(ProductDTO o) {
	// TODO Auto-generated method stub
	return 0;
}
  
  
  
	
}
