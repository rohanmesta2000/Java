package com.xworkz.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.spring.dto.EngineDTO;
import com.xworkz.spring.repo.EngineRepo;

@Service
public class EngineServiceimpl implements EngineService {
@Autowired
	private EngineRepo repo;

	public EngineServiceimpl() {
		// TODO Auto-generated constructor stub
		System.out.println("created EngineServiceImpl succesfully ");
	}

	@Override
	public boolean validateAndSave(EngineDTO dto) {
		// TODO Auto-generated method stub

		System.out.println("invoking validateAndSave in EngineServiveimpl");
		System.out.println("dto passed " + dto);
		this.repo.save(dto);
		return true;
	}

}
