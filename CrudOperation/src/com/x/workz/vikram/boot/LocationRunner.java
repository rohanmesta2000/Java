package com.x.workz.vikram.boot;

import com.x.workz.vikram.app.Location;
import com.x.workz.vikram.app.LocationImos;
import com.x.workz.vikram.app.service.LocationService;
import com.x.workz.vikram.app.service.LocationServiceImps;

public class LocationRunner {

	public static void main(String[] args) {
		System.out.println("invoking in loactionRunner");
		Location location=new LocationImos();
		LocationService locationService=new LocationServiceImps(location);
		locationService.validateAndSave("Sagar");
		locationService.validateAndSave("Sagar");

	}

}
