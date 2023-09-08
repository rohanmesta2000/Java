package com.xworkz.newspaper.boot;

import com.xworkz.newspaper.app.dto.WeatherDTO;
import com.xworkz.newspaper.app.impl.WeatherRepository;
import com.xworkz.newspaper.app.impl.WeatherRepositoryImpl;
import com.xworkz.newspaper.app.service.WeatherService;
import com.xworkz.newspaper.app.service.WeatherServiceImpl;

public class WeatherRunner {
 public static void main(String[] args) {
	System.out.println("invoking main....");
	WeatherRepository weatherRepository=new WeatherRepositoryImpl();
	WeatherService weatherService=new WeatherServiceImpl(weatherRepository);
	WeatherDTO dto=new WeatherDTO("neeraj", 69.5, 30, "kundapura");
	boolean persisted=weatherService.validateAndSave(dto);
	System.out.println("Persisted"+persisted);
}
}
