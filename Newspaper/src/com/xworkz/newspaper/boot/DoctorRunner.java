package com.xworkz.newspaper.boot;

import com.xworkz.newspaper.app.dto.DoctorDTO;
import com.xworkz.newspaper.app.impl.DoctorRepository;
import com.xworkz.newspaper.app.impl.DoctorRepositoryImpl;
import com.xworkz.newspaper.app.service.DoctorService;
import com.xworkz.newspaper.app.service.DoctorServiceImpl;

public class DoctorRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main.....");
        DoctorRepository doctorRepository = new DoctorRepositoryImpl();
        DoctorService doctorService = new DoctorServiceImpl(doctorRepository);
        DoctorDTO dto = new DoctorDTO("Dr.Rohan", "Cardiologist", 10, "KMC Hospital");
        boolean persisted = doctorService.validateAndSave(dto);
        System.out.println("Persisted: " + persisted);

	}

}
