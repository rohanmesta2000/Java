package com.repair.india.boot;

import com.repair.india.app.Garage;

public class GarageKiller {

	public static void main(String[] args) {
		System.out.println("Invoking main in GarageKiller");
		Garage garage=new Garage();
		garage.multifunction();
		garage.protectVehical();

	}

}
