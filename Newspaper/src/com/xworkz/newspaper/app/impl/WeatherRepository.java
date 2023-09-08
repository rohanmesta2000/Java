package com.xworkz.newspaper.app.impl;

import com.xworkz.newspaper.app.dto.WeatherDTO;

public interface WeatherRepository {
	int TOTAL_ENTRIES=10;
	void save(WeatherDTO dto);

}
