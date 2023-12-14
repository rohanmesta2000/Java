package com.xworkz.newspaper.boot;

import com.xworkz.newspaper.app.dto.AadharDTO;
import com.xworkz.newspaper.app.impl.AadharRepository;
import com.xworkz.newspaper.app.impl.AadharRepositoryImpl;
import com.xworkz.newspaper.app.service.AadharService;
import com.xworkz.newspaper.app.service.AadharServiceImpl;

public class AadharRunner {

	public static void main(String[] args) {
		System.out.println("Inoking main method...");
		
		AadharRepository aadharRepository=new AadharRepositoryImpl();
		AadharService aadharService=new AadharServiceImpl(aadharRepository);
		AadharDTO dto=new AadharDTO("490944210269", "Rohan", 23, "honnavar");
		
		boolean persisted=aadharService.validateAndSave(dto);
		System.out.println("Persisited:"+persisted);

	}

}
