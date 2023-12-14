package com.xworkz.application.repository;

import com.xworkz.application.app.dto.ApplicationDto;

public class ApplicationRepositoryImpl implements ApplicationRepository{
	private ApplicationDto[] dtos=new ApplicationDto[TOTAL_APP];
	private int position;

	@Override
	public void save(ApplicationDto dto) {
		if (this.position <TOTAL_APP) {
			this.dtos[position] = dto;
			System.out.println("Stored " + dto + " in position " + this.position);
			this.position++;
		} else {
			System.err.println("Storage is Full, cannot store the application data...");

		}
		
	}

}
