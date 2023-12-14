package com.xworkz.application.boot;

import com.xworkz.application.app.dto.ApplicationDto;
import com.xworkz.application.repository.ApplicationRepository;
import com.xworkz.application.repository.ApplicationRepositoryImpl;
import com.xworkz.application.service.ApplicationService;
import com.xworkz.application.service.ApplicationServiceImpl;

public class ApplicationRunner {

	public static void main(String[] args) {
		System.out.println("invoking in ApplicationRunner");
		ApplicationRepository applicationRepository = new ApplicationRepositoryImpl();
		ApplicationService applicationService = new ApplicationServiceImpl(applicationRepository);
		ApplicationDto dto = new ApplicationDto(1, "JAVA", "James Gosling", "Sun Microsystems", "Java20");
		boolean persisted = applicationService.validateAndSave(dto);
		System.out.println("Persisted" + persisted);

	}

}
