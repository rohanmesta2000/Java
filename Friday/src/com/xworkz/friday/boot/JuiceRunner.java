package com.xworkz.friday.boot;

import com.xworkz.friday.app.repository.JuiceRepository;
import com.xworkz.friday.app.repository.JuiceRepositoryImpl;
import com.xworkz.friday.app.service.JuiceService;
import com.xworkz.friday.app.service.JuiceServiceImpl;

public class JuiceRunner {

	public static void main(String[] args) {
		System.out.println("invoking in JuiceRunner");
		JuiceRepository juiceRepository=new JuiceRepositoryImpl();
		
		JuiceService juiceService=new JuiceServiceImpl(juiceRepository);
		
		juiceService.validateAndSave("Fanta");
		juiceService.validateAndSave("Fanta");
		

	}

}


