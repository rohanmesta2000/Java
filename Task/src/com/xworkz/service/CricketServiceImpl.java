package com.xworkz.service;

import com.xworkz.dto.CricketDTO;
import com.xworkz.repository.CricketRepository;

public class CricketServiceImpl implements CricketService {
	private CricketRepository cricketRepository;

	public CricketServiceImpl(CricketRepository cricketRepository) {
		this.cricketRepository = cricketRepository;
	}

	@Override
	public boolean validateAndSave(CricketDTO dto) {
		System.out.println("invoking in validateAndSave in CricketRepository");
		if (dto != null) {
			System.out.println("dto is valid,then store player details" + this.getClass().getSimpleName());
			String teamName = dto.getTeamName();
			int totalplayers = dto.getTotalPlayers();
			int runsScored = dto.getRunsScored();
			int wicketsTaken = dto.getWicketsTaken();
			double oversBowled = dto.getOversBowled();
			boolean isBatting = dto.isBatting();
			boolean isBowling = dto.isBowling();
			String captainName = dto.getCaptainName();
			String coachName = dto.getCoachName();
			String homeGround = dto.getHomeGround();
			if(teamName!=null && !teamName.isEmpty() && teamName.length()>=10 && teamName.length()<=50) {
				System.out.println("Cricket"+dto.getTeamName()+"is valid");
			}
			else {
				System.err.println("Cricket"+dto.getTeamName()+"is invalid");
			}
			
			if(totalplayers>0) {
				System.out.println("totalplayers is valid");
				
			}else {
				System.out.println("totalplayers is invalid");
			}
			if(runsScored>0) {
				System.out.println("runsScored is valid");
				
			}else {
				System.out.println("runsScored is invalid");
			}
			if(wicketsTaken>0) {
				System.out.println("wicketsTaken is valid");
				
			}else {
				System.out.println("wicketTaken is invalid");
			}
			if(oversBowled>0) {
				System.out.println("oversBowledis valid");
				
			}else {
				System.out.println("oversBowled is invalid");
			}
			
			if(captainName!=null && !captainName.isEmpty() && captainName.length()>=4 && captainName.length()<=50) {
				System.out.println("Cricket"+dto.getCaptainName()+"is valid");
			}
			else {
				System.err.println("Cricket"+dto.getCaptainName()+"is invalid");
			}
			
			if(coachName!=null && !coachName.isEmpty() && coachName.length()>=5 && coachName.length()<=10) {
				System.out.println("Cricket"+dto.getCoachName()+"is valid");
			}
			else {
				System.err.println("Cricket"+dto.getCoachName()+"is invalid");
			this.cricketRepository.save(dto);
			}

			if(homeGround!=null && !homeGround.isEmpty() && homeGround.length()>=5 && homeGround.length()<=20) {
				System.out.println("Cricket"+dto.getHomeGround()+"is valid");
			}
			else {
				System.err.println("Cricket"+dto.getHomeGround()+"is invalid");
			}
			
			if(!this.cricketRepository.isExist(dto)) {
				System.out.println("Already exist");
				this.cricketRepository.save(dto);
				return true;
			}
			else {
			System.err.println("not exist");
			}
			
		}
		return false;
	}

}
