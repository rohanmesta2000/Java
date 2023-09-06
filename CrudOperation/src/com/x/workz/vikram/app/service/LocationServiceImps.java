package com.x.workz.vikram.app.service;

import com.x.workz.vikram.app.Location;

public class LocationServiceImps implements LocationService {
 private Location location;
 public LocationServiceImps(Location location) {
	 this.location=location;
 }
	@Override
	public boolean validateAndSave(String location) {
		System.out.println("invoking validAndSave in Loactionservice impl");
		if (location != null && !location.isEmpty() && location.length() >= 3 && location.length() <= 10) {
			System.out.println("location  is valid then store  place " + this.getClass().getSimpleName());
			if(! this.location.isExist(location)) {
				this.location.save("Sagar");
				return true;
			}
			else {
				System.err.println("LoactionName" +location+"is already exist, please inser another");
			}
			
		}
		else {
			System.err.println("cannot store data ,location name is invalid");
		}
		return false;
	}

}
