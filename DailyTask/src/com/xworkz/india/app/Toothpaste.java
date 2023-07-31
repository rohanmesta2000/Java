package com.xworkz.india.app;

public class Toothpaste {
	public String name;
	public String brand;
	public String company;
	public Ingredent[] ingredent; 
	  
	public Toothpaste(String name, String brand,String company, Ingredent[] ingredent)
	{
		this.name=name;
		this.brand=brand;
		this.company=company;
		this.ingredent=ingredent;
		}
	
 public void printinfo()
 {
	System.out.println("Name:"+this.name);
	System.out.println("Brand:"+this.brand);
	System.out.println("Company:"+this.company);
	for(int start=0;start<ingredent.length;start++)
	{
		Ingredent ref=ingredent[start];
		System.out.println("Ingredents are:" + ref.ingredentName);
}
 }
}
