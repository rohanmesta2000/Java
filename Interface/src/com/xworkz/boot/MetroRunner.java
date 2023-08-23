package com.xworkz.boot;

import com.xworkz.app.Metro;
import com.xworkz.div.SpeedMetro;

public class MetroRunner {

	public static void main(String[] args) {
		Metro metro=new SpeedMetro();
		metro.ticket();
		metro.passenger();
		metro.junction();
	}

}
