package com.xworkz.newspaper.app.service;

import com.xworkz.newspaper.app.dto.AadharDTO;
import com.xworkz.newspaper.app.impl.AadharRepository;

public class AadharServiceImpl implements AadharService {
	private AadharRepository aadharRepository;
	
	 public AadharServiceImpl(AadharRepository aadharRepository) {
		this.aadharRepository=aadharRepository;
	}

	@Override
	public boolean validateAndSave(AadharDTO dto) {
		System.out.println("invoking in validataAndSave");
		if(dto!=null) {
			System.out.println("dto is valid,then store id"+this.getClass().getSimpleName());
			String id=dto.getId();
			String name=dto.getName();
			int age=dto.getAge();
			String address=dto.getAddress();
			if(name!=null && !name.isEmpty() && name.length()>=3 && name.length()<=10) {
				System.out.println("aadharName"+dto.getName()+"is valid");
			}
			else {
				System.err.println("Newspaper"+dto.getName()+"is invalid");
			}
			
		if(age>=0 && age<=90) {
				System.out.println("Aadhar age is valid");
				
			}else {
				System.out.println("Aadhar age is invalid");
			}
		if(address!=null && !address.isEmpty() && address.length()>=3 && address.length()<=10) {
			System.out.println("Aadhar"+dto.getAddress()+"is valid");
		}
		else {
			System.err.println("Newspaper"+dto.getAddress()+"is invalid");
		}
			this.aadharRepository.save(dto);
			return true;
				}else {
					System.err.println("cannot store data,dto is invalid");
				}
			
		
		return false;
	}

}
