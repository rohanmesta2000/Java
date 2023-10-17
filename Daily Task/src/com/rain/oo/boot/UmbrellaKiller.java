package com.rain.oo.boot;

import com.rain.oo.app.Umbrella;

public class UmbrellaKiller {

	public static void main(String[] args) {
		 System.out.println("invioking main method");	
		  Umbrella umbrella=new Umbrella();
		  umbrella.open();
		  umbrella.open(300,"Black");
	}

}
