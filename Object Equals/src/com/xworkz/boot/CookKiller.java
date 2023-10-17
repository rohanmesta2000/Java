package com.xworkz.boot;

import com.xworkz.app.Cook;

public class CookKiller {
	public static void main(String[] args) {
		System.out.println("Invoking main in CookRunner");
		Cook cook1 = new Cook("Mayur", "Italian Cuisine", 10, "Italian", 50000.0, false);
	    Cook cook2 = new Cook("Mayur", "French Cuisine", 10, "Italian", 55000.0, true);

	    System.out.println(cook1);
	    boolean same = cook1.equals(cook2);
	    System.out.println("Cook1 and Cook2 are the same: " + same);
	}
}
