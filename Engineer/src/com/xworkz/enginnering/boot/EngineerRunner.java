package com.xworkz.enginnering.boot;

import com.xworkz.enginnering.dto.EngineerDto;
import com.xworkz.enginnering.repository.EngineerRepository;
import com.xworkz.enginnering.repository.EngineerRepositoryImpl;
import com.xworkz.enginnering.service.EngineerService;
import com.xworkz.enginnering.service.EngineerServiceImpl;

public class EngineerRunner {

	public static void main(String[] args) {
		System.out.println("invoking in main method");
		EngineerRepository engineerRepository=new EngineerRepositoryImpl();
		EngineerService engineerService=new EngineerServiceImpl(engineerRepository);
		EngineerDto dto=new EngineerDto(8,"Rohan", "SDMIT");
		
		boolean persisted=engineerService.validateAndSave(dto);
		System.out.println("Persisted"+persisted);
		

	}

}
