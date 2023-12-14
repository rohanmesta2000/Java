package com.xworkz.newspaper.app.impl;

import com.xworkz.newspaper.app.dto.AadharDTO;

public interface AadharRepository {
	int TOTAL_AADHAR=10;
	
	void save(AadharDTO dto);

}
