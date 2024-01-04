package com.xworkz.spring.repo;

import org.springframework.stereotype.Repository;

import com.xworkz.spring.dto.EngineDTO;

@Repository
public class EngineRepoImpl implements EngineRepo {
	public EngineRepoImpl() {
		// TODO Auto-generated constructor stub
		System.out.println("created EngineRepoImpl successfully");
	}

	@Override
	public void save(EngineDTO dto) {
		// TODO Auto-generated method stub
		System.out.println("invoking in SongRepo suceesfully");
		System.out.println("Dto" + dto);

	}

}
