package com.xworkz.newspaper.boot;

import com.xworkz.newspaper.app.dto.PrinterDTO;
import com.xworkz.newspaper.app.impl.PrinterRepository;
import com.xworkz.newspaper.app.impl.PrinterRepositoryImpl;
import com.xworkz.newspaper.app.service.PrinterService;
import com.xworkz.newspaper.app.service.PrinterServiceImpl;

public class PrinterRunner {

	public static void main(String[] args) {
		System.out.println("invoking in main method");
		PrinterRepository printerRepository=new PrinterRepositoryImpl();
		PrinterService printerService=new PrinterServiceImpl(printerRepository); 
		PrinterDTO dto=new PrinterDTO("EpsonL390", "Epson", 873, "LaserJet Printers");
		
		boolean persisted=printerService.validateAndSave(dto);

	}

}
