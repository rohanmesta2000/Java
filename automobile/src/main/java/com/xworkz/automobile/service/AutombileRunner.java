package com.xworkz.automobile.service;

import com.xworkz.automobile.model.Vehicle;
import com.xworkz.automobile.repository.AutomobileRepository;
import com.xworkz.automobile.repository.AutomobileRepositoryimpl;

public class AutombileRunner {
	public static void main(String[] args) {

		Vehicle vehicle = new Vehicle("Thar", "Red", "4wheeler", 2013);
		Vehicle vehicle1=new Vehicle("Swift", "orange", "car", 2019);
		AutomobileRepository repo = new AutomobileRepositoryimpl();
		repo.saveVehicleDetails(vehicle1);

	}
}
