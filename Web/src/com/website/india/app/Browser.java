package com.website.india.app;

public class Browser {
	public Internet internet=new Internet();
	public void  retrieve()
	{
		System.out.println("Invoking  retrieve() in Browser");
		this.internet.download();
	}
	public void display()
	{
		System.out.println("Invoking display() in Browser");
		this.internet.search();
	}
	
		
	}
