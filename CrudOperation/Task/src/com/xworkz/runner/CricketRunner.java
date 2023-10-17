package com.xworkz.runner;

import com.xworkz.dto.CricketDTO;
import com.xworkz.repository.CricketRepository;
import com.xworkz.repository.CricketRepositoryImpl;
import com.xworkz.service.CricketService;
import com.xworkz.service.CricketServiceImpl;

public class CricketRunner {

	public static void main(String[] args) {
		System.out.println("invoking in main method");
		CricketRepository cricketRepository = new CricketRepositoryImpl();
		CricketService cricketService = new CricketServiceImpl(cricketRepository);
		CricketDTO dto = new CricketDTO("Mumbai Indians", 11, 10329, 900, 300, false, false, "Rohit", "Rahul",
				"Mumbai");

		boolean persisted = cricketService.validateAndSave(dto);
		System.out.println("Persisted" + persisted);

	}

}
