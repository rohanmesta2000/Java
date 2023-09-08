package com.xworkz.newspaper.app.impl;

import com.xworkz.newspaper.app.dto.DoctorDTO;

public interface DoctorRepository {
	int TOTAL_DOCTORS = 10;

	public void save(DoctorDTO dto);
}
