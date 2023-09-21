package com.xworkz.repository;

import com.xworkz.dto.CricketDTO;


public class CricketRepositoryImpl implements CricketRepository{
	private CricketDTO[] dtos = new CricketDTO[TOTAL_PLAYERS];
	int position;
	@Override
	public void save(CricketDTO dto) {
		if (this.position <TOTAL_PLAYERS) {
			this.dtos[position] = dto;
			System.out.println("Players " + dto + " in position " + this.position);
			this.position++;
		} else {
			System.err.println("Players is Full, cannot add to the team...");

		}
		
	}
	@Override
	public boolean isExist(CricketDTO dto) {
		for(int i=0;i<this.position;i++)
		{
			CricketDTO temp=this.dtos[i];
			if(temp!=null && temp.equals(dtos));
			return true;
		}
		return false;
	}
	@Override
	public CricketDTO findByName(String teamName) {
		for(int i=0;i<this.position;i++) {
			CricketDTO ref =dtos[i];
			if(ref.getTeamName().equals(teamName)) {
				System.out.println("it can be in position"+i);
				return ref;
			}else {
				System.err.println("it cannot be found");
			}
		}
		return null;
	}
}
