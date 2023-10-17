package com.xworkz.enginnering.repository;

import com.xworkz.enginnering.dto.EngineerDto;

public  class EngineerRepositoryImpl implements EngineerRepository {
	private EngineerDto[] dtos = new EngineerDto[TOTAL_SEATS];
	private int position;

	@Override
	public void save(EngineerDto dto) {
		if (this.position < TOTAL_SEATS) {
			this.dtos[position] = dto;
			System.out.println("Stored " + dto + " in position " + this.position);
			this.position++;
		} else {
			System.err.println("Storage is Full, cannot the data of the  student...");

		}

	}
}
