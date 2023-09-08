package com.xworkz.newspaper.app.impl;

import com.xworkz.newspaper.app.dto.PrinterDTO;

public class PrinterRepositoryImpl implements PrinterRepository {
 private PrinterDTO[] dtos=new PrinterDTO[TOTAL_COPIES];
 int position;
 
	@Override
	public void save(PrinterDTO dto) {
	 System.out.println("invoking save in PrinterRepsoitryImpl...");
		
		if(this.position<TOTAL_COPIES) {
			this.dtos[position]=dto;
			System.out.println("Stored"+dto+"in position"+this.position);
			this.position++;
		}
		else {
			System.err.println("Storage is full,cannot store printer...");
		}
		
	}

}
