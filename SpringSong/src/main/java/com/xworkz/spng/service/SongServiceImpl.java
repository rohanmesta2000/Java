package com.xworkz.spng.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.spng.dto.SongDTO;
import com.xworkz.spng.repository.SongRepo;

@Service
public class SongServiceImpl implements SongService {
	@Autowired
	private SongRepo repo;

	public SongServiceImpl() {
		// TODO Auto-generated constructor stub
		System.out.println("created SongServiceImpl succesfully ");
	}

	@Override
	public boolean validateAndSave(SongDTO dto) {
		System.out.println("invoking validateAndSave in Songserviveimpl");
		System.out.println("dto passed " + dto);
		this.repo.save(dto);
		return true;
	}

}
