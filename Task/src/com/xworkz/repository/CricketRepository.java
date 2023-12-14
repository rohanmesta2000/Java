package com.xworkz.repository;

import com.xworkz.dto.CricketDTO;


public interface CricketRepository {
	int TOTAL_PLAYERS = 11;
    void save(CricketDTO dto);
     boolean isExist(CricketDTO  dto);
     CricketDTO findByName(String teamName);
}
