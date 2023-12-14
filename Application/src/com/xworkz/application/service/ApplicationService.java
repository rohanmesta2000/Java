package com.xworkz.application.service;

import com.xworkz.application.app.dto.ApplicationDto;

public interface ApplicationService {
	boolean validateAndSave(ApplicationDto dto);
}
