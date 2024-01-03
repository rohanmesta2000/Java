package com.xworkz.spng.repository;

import org.springframework.stereotype.Repository;

import com.xworkz.spng.dto.SongDTO;

@Repository
public class SongRepoImpl implements SongRepo {
	public SongRepoImpl() {
		// TODO Auto-generated constructor stub
		System.out.println("created SongRepoimpl succesfully");
	}

	@Override
	public void save(SongDTO dto) {
		// TODO Auto-generated method stub
		System.out.println("invoking in SongRepo suceesfully");
		System.out.println("Dto" + dto);

	}

}
