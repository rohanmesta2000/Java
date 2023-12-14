package com.xworkz.automobile.repository;

import java.util.List;

import com.xworkz.automobile.model.Vehicle;

public interface AutomobileRepository {
	public void saveVehicleDetails(Vehicle vehicle);
	public void saveVehicleDetails(List<Vehicle> vehicle) ;
	public void updateVehicleDetailsByName(Vehicle vehicle);
	public List<Vehicle> fetchAllVehicles();

}
