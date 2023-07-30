package com.taste.sagar.boot;

import com.taste.sagar.app.Hotel;

public class HotelKiller {
	public static void main(String[] args) {
		System.out.println("Invoking main in HotelKiller");
		Hotel hotel=new Hotel();
		hotel.eat();
		hotel.taste();
	}

}
