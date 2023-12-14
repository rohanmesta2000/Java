package com.xworkz.automobile.service;

import java.util.List;

import com.xworkz.automobile.model.Vehicle;

public interface AutomobileService {
	public void validateAndSave(Vehicle vehicle);
	public void validateAndSave(List<Vehicle> vehicle);
	public List<Vehicle> fetchAllVehicles();

}
