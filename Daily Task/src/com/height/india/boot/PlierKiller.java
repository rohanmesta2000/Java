package com.height.india.boot;

import com.height.india.app.Plier;

public class PlierKiller {

	public static void main(String[] args) {
		System.out.println("invioking main method");	
		  Plier plier=new Plier();
		  plier.grip();
		  plier.grip(10,"Red");

	}

}
