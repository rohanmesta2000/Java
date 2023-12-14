package com.xworkz.enginnering.service;

import com.xworkz.enginnering.dto.EngineerDto;
import com.xworkz.enginnering.repository.EngineerRepository;

public class EngineerServiceImpl implements EngineerService {
	
	private EngineerRepository engineerRepository;
	public EngineerServiceImpl(EngineerRepository engineerRepository) {
		this.engineerRepository=engineerRepository;
	}
	@Override
	public boolean validateAndSave(EngineerDto dto) {
		System.out.println("invoking in validateAndSave in EnginnerRepository");
		if(dto!=null) {
			System.out.println("dto is valid,then store enginnering details"+this.getClass().getSimpleName());
			int id=dto.getId();
			String name=dto.getName();
			String collegeName=dto.getCollegeName();
			if (id!=0&& name!=null&& !name.isEmpty()&& !collegeName.isEmpty()){
				this.engineerRepository.save(dto);
			}
		}
		return false;
	}
}
