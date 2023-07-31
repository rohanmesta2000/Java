package com.xworkz.india.app;

public class Ingredent {
	public String ingredentName;
	public int quantity;
	public double cost;
	
 public Ingredent(String ingredentName,int quantity,double cost) {
	 this.ingredentName=ingredentName;
	 this.quantity=quantity;
	 this.cost=cost;
	 
}
 public void printInfo() {
	 System.out.println("Ingredent Name:" +this.ingredentName);
	 System.out.println("Quantity:" +this.quantity);
	 System.out.println("Cost:" +this.cost);
 }
}
