package com.xwrokz.presentation.app;

public class Bike {
	private String name;
	private int price;
	private String type;
	 
	public void details(){
		System.out.println("invoking in main method");
	}
	
	public void details(String name){
		System.out.println("invoking in String name method");
	}
	
	public void details(String name, int price){
		System.out.println("invoking in String ,int method");
	}
	
	public void details(String name, int price,String type){
		System.out.println("invoking in String ,int , string type method");
	}
	
}
