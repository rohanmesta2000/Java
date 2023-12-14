package com.xworkz.newspaper.app.service;

import com.xworkz.newspaper.app.dto.PrinterDTO;
import com.xworkz.newspaper.app.impl.PrinterRepository;

public class PrinterServiceImpl implements PrinterService {
	private PrinterRepository printerRepository;

	public PrinterServiceImpl(PrinterRepository printerRepository) {
		this.printerRepository = printerRepository;
	}

	@Override
	public boolean validateAndSave(PrinterDTO dto) {
		System.out.println("invoking in validataAndSave in PrinterRepository");
		if (dto != null) {
			System.out.println("dto is valid,then store printer" + this.getClass().getSimpleName());
			String printerName = dto.getPrinterName();
			String brand = dto.getBrand();
			double price = dto.getPrice();
			String type = dto.getType();

			if (printerName != null && !printerName.isEmpty() && printerName.length() >= 3
					&& printerName.length() <= 10) {
				System.out.println("Printer" + dto.getPrinterName() + "is valid");
			} else {
				System.err.println("Printer" + dto.getPrinterName() + "is invalid");
			}
			if (brand != null && !brand.isEmpty() && brand.length() >= 3 && brand.length() <= 10) {
				System.out.println("Printer" + dto.getBrand() + "is valid");
			} else {
				System.err.println("Printer" + dto.getBrand() + "is invalid");
			}
			if (price > 0) {
				System.out.println("Printer price is valid");
			} else {
				System.err.println("Printer price is invalid");
			}
			this.printerRepository.save(dto);
			return true;
		} else {
			System.err.println("cannot store data,dto is invalid");
		}
		return false;
	}

}
