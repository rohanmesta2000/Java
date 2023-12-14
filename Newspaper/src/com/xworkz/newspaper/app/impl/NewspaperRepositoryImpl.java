package com.xworkz.newspaper.app.impl;

import com.xworkz.newspaper.app.dto.NewspaperDTO;

public class NewspaperRepositoryImpl implements NewspaperRepository{
	private  NewspaperDTO[] dtos=new NewspaperDTO[TOTAL_PAPERS];
	private int position;
	@Override
	public void save(NewspaperDTO dto) {
		System.out.println("invoking in main method"+this.getClass().getName());
		if (position<TOTAL_PAPERS);{
		this.dtos[position]=dto;
		System.out.println(dto+ "is saved at a position"+this.position);
		this.position++;
		}
		
	}

}
