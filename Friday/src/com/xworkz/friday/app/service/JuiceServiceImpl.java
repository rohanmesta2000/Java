package com.xworkz.friday.app.service;

import com.xworkz.friday.app.repository.JuiceRepository;

public class JuiceServiceImpl implements JuiceService {
	private JuiceRepository juiceRepository;

	public JuiceServiceImpl(JuiceRepository juiceRepository) {
		this.juiceRepository = juiceRepository;
	}

	@Override
	public boolean validateAndSave(String juice) {
		System.out.println("invoking validAndSave in juiceservice impl");
		if (juice != null && !juice.isEmpty() && juice.length() >= 3 && juice.length() <= 10) {
			System.out.println("juice  is valid then store  juice " + this.getClass().getSimpleName());
			if(! this.juiceRepository.isExist(juice)) {
			this.juiceRepository.save("Fanta");
			return true;
		}
		else {
			System.err.println("JuiceName" +juice+"is already exist, please inser another");
		}
	}
	else {
			System.err.println("cannot store data ,juice name is invalid");
		}
		return false;
	}

}
