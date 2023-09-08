package com.xworkz.newspaper.app.service;

import com.xworkz.newspaper.app.dto.NewspaperDTO;
import com.xworkz.newspaper.app.impl.NewspaperRepository;

public class NewspaperServiceImpl implements NewspaperService {
	private NewspaperRepository newspaperRepository;
	public NewspaperServiceImpl(NewspaperRepository newspaperRepository) {
		this.newspaperRepository=newspaperRepository;
	}

	@Override
	public boolean validateAndSave(NewspaperDTO dto) {
		System.out.println("invoking in validataAndSave inNewspaperRepository");
		if(dto!=null) {
			System.out.println("dto is valid,then store country name"+this.getClass().getSimpleName());
			int price=dto.getPrice();
			String Name=dto.getName();
			int noOfPages=dto.getNoOfPages();
			String Brand=dto.getBrand();
			if(Name!=null && !Name .isEmpty() && Name.length()>=3 && Name.length()<=10) {
				System.out.println("Newspaper"+dto.getName()+"is valid");
			}
			else {
				System.err.println("Newspaper"+dto.getName()+"is invalid");
			}
			if(Brand!=null && !Brand.isEmpty() && Brand.length()>=3 && Brand.length()<=10) {
				System.out.println("Newspaper"+dto.getBrand()+"is valid");
			}
			else {
				System.err.println("Newspaper"+dto.getBrand()+"is invalid");
			}
			if(noOfPages>0 && price>0) {
				System.out.println("Newspaper pages and prices are valid");
				
			}else {
				System.out.println("Newspaper pages and prices are invalid");
			}
			this.newspaperRepository.save(dto);
			return true;
				}else {
					System.err.println("cannot store data,dto is invalid");
				}
		return false;
	}

 
 

}
