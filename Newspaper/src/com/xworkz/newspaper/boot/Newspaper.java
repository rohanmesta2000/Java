package com.xworkz.newspaper.boot;

import com.xworkz.newspaper.app.dto.NewspaperDTO;
import com.xworkz.newspaper.app.impl.NewspaperRepository;
import com.xworkz.newspaper.app.impl.NewspaperRepositoryImpl;
import com.xworkz.newspaper.app.service.NewspaperService;
import com.xworkz.newspaper.app.service.NewspaperServiceImpl;

public class Newspaper {
 public static void main(String[] args) {
	System.out.println("invoking in runner file...");
	NewspaperRepository newspaperRepository = new NewspaperRepositoryImpl();
	NewspaperService newspaperService=new NewspaperServiceImpl(newspaperRepository);
	NewspaperDTO dto=new NewspaperDTO(90, "India", "English", 90);
	boolean persisted =newspaperService.validateAndSave(dto);
	System.out.println("Persisted:"+persisted);
}
}
