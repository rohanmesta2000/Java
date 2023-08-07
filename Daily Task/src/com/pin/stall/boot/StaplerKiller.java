package com.pin.stall.boot;

import com.pin.stall.app.Stapler;

public class StaplerKiller {

	public static void main(String[] args) {
		 System.out.println("invioking main method");	
		  Stapler stapler=new Stapler();
		  stapler.staple();
		  stapler.staple(5,"Standard");
	}
}
