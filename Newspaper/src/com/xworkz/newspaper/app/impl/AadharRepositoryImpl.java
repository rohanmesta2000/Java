package com.xworkz.newspaper.app.impl;

import com.xworkz.newspaper.app.dto.AadharDTO;

public class AadharRepositoryImpl implements AadharRepository{
	private AadharDTO[] dtos=new AadharDTO[TOTAL_AADHAR];
	int position;

	@Override
	public void save(AadharDTO dto) {
		System.out.println("invoking save in AadharRepositoryImpl");
		if(this.position<TOTAL_AADHAR) {
			this.dtos[position]=dto;
			System.out.println("stored"+dto+"in position"+this.position);
			this.position++;
		} 
		else {
			System.err.println("storage is full,cannot store aadhar");
		}
		
	}

}
