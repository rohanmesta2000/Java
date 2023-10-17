package com.food.india.boot;

import com.food.india.app.Hotel;

public class foodKiller {
	public static void main(String[] args) {
		  System.out.println("invioking main method");	
		  Hotel hotel=new Hotel();
		  hotel.food();
		  hotel.food(30,"Dosa");
	}
}
