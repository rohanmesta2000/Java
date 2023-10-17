package com.xworkz.application.repository;

import com.xworkz.application.app.dto.ApplicationDto;

public interface ApplicationRepository {
 int TOTAL_APP=10;
 
 void save(ApplicationDto dto);
}
