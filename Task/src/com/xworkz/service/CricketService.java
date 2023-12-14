package com.xworkz.service;

import com.xworkz.dto.CricketDTO;

public interface CricketService {

boolean validateAndSave(CricketDTO dto);
 default CricketDTO findbyworkingFor(String teamName) {
	 return null;
 }
 }

