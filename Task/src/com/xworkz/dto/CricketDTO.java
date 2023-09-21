package com.xworkz.dto;

public class CricketDTO {
	private String teamName;
    private int totalPlayers;
    private int runsScored;
    private int wicketsTaken;
    private double oversBowled;
    private boolean isBatting;
    private boolean isBowling;
    private String captainName;
    private String coachName;
    private String homeGround;
  
    
	public CricketDTO(String teamName, int totalPlayers, int runsScored, int wicketsTaken, double oversBowled,
			boolean isBatting, boolean isBowling, String captainName, String coachName, String homeGround) {
		super();
		this.teamName = teamName;
		this.totalPlayers = totalPlayers;
		this.runsScored = runsScored;
		this.wicketsTaken = wicketsTaken;
		this.oversBowled = oversBowled;
		this.isBatting = isBatting;
		this.isBowling = isBowling;
		this.captainName = captainName;
		this.coachName = coachName;
		this.homeGround = homeGround;
	}
	public CricketDTO() {
		super();
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public int getTotalPlayers() {
		return totalPlayers;
	}
	public void setTotalPlayers(int totalPlayers) {
		this.totalPlayers = totalPlayers;
	}
	public int getRunsScored() {
		return runsScored;
	}
	public void setRunsScored(int runsScored) {
		this.runsScored = runsScored;
	}
	public int getWicketsTaken() {
		return wicketsTaken;
	}
	public void setWicketsTaken(int wicketsTaken) {
		this.wicketsTaken = wicketsTaken;
	}
	public double getOversBowled() {
		return oversBowled;
	}
	public void setOversBowled(double oversBowled) {
		this.oversBowled = oversBowled;
	}
	public boolean isBatting() {
		return isBatting;
	}
	public void setBatting(boolean isBatting) {
		this.isBatting = isBatting;
	}
	public boolean isBowling() {
		return isBowling;
	}
	public void setBowling(boolean isBowling) {
		this.isBowling = isBowling;
	}
	public String getCaptainName() {
		return captainName;
	}
	public void setCaptainName(String captainName) {
		this.captainName = captainName;
	}
	public String getCoachName() {
		return coachName;
	}
	public void setCoachName(String coachName) {
		this.coachName = coachName;
	}
	public String getHomeGround() {
		return homeGround;
	}
	public void setHomeGround(String homeGround) {
		this.homeGround = homeGround;
	}
	@Override
	public String toString() {
		return "CricketDTO [teamName=" + teamName + ", totalPlayers=" + totalPlayers + ", runsScored=" + runsScored
				+ ", wicketsTaken=" + wicketsTaken + ", oversBowled=" + oversBowled + ", isBatting=" + isBatting
				+ ", isBowling=" + isBowling + ", captainName=" + captainName + ", coachName=" + coachName
				+ ", homeGround=" + homeGround + "]";
	}
    
    
    @Override
    public boolean equals(Object obj) {
    	if(obj !=null) {
    		if(obj instanceof CricketDTO) {
    			CricketDTO ref=(CricketDTO)obj;
    			if (this.captainName.equals(ref.captainName)&& this.homeGround.equals(ref.homeGround));
    			System.out.println("Instance are same");
    			return true;
    		}
    	}
    	return super.equals(obj);
    }

}
