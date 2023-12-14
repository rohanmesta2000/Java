package com.xworkz.newspaper.app.service;

import com.xworkz.newspaper.app.dto.WeatherDTO;
import com.xworkz.newspaper.app.impl.WeatherRepository;

public class WeatherServiceImpl implements WeatherService {
	private WeatherRepository weatherRepository;
	
	 public WeatherServiceImpl(WeatherRepository weatherRepository) {
		this.weatherRepository=weatherRepository;
	}

	@Override
	public boolean validateAndSave(WeatherDTO dto) {
		System.out.println("Invoking validateAndSave in weatherServiceImpl ");
		if(dto!=null) {
			System.out.println("DTo is valid");
			String weatherName=dto.getWeatherName();
			double temperature=dto.getTemperature();
			double humidity=dto.getHumidity();
			String location=dto.getLocation();
			
			this.weatherRepository.save(dto);
			return true;
		}else {
			System.err.println("cannot store data ,Dto is invalid");
		}
		return false;
	}

}
