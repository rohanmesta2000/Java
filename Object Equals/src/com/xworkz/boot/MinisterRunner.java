package com.xworkz.boot;

import com.xworkz.app.Minister;

public class MinisterRunner {
	public static void main(String[] args) {
		System.out.println("Invoking main  in Minister");
	   Minister minister=new Minister("Rohit", "Finance", 98, "Democratic Party", 1000, true);
	   Minister minister1=new Minister("Rohit", "Health", 78, "Bjp Party", 2000, false);
	   System.out.println(minister);
	   boolean same=minister.equals(minister1);
	   System.out.println("Minister and Minister1 are same"+same);
	}
	}

