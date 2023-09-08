package com.xworkz.newspaper.app.impl;

import com.xworkz.newspaper.app.dto.WeatherDTO;

public class WeatherRepositoryImpl implements WeatherRepository{
private WeatherDTO[] dtos=new WeatherDTO[TOTAL_ENTRIES];
int position;
	@Override
	public void save(WeatherDTO dto) {
		System.out.println("invoking save in WeatherRepsoitryImpl...");
		
		if(this.position<TOTAL_ENTRIES) {
			this.dtos[position]=dto;
			System.out.println("Stored"+dto+"in position"+this.position);
			this.position++;
		}
		else {
			System.err.println("Storage is full,cannot store weather data...");
		}
		
	}

}
