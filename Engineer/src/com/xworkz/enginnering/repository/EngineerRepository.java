package com.xworkz.enginnering.repository;

import com.xworkz.enginnering.dto.EngineerDto;

public interface EngineerRepository  {
	int TOTAL_SEATS = 10;

    void save(EngineerDto dto);

}
