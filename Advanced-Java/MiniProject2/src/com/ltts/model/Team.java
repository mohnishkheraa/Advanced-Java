package com.ltts.model;

public class Team {

	int teamId;
	String teamname;
	String ownerName;
	String coachName;
	int playerId;
	public Team(int teamId, String teamname, String ownerName, String coachName) {
		super();
		this.teamId = teamId;
		this.teamname = teamname;
		this.ownerName = ownerName;
		this.coachName = coachName;
	}
	public int getTeamId() {
		return teamId;
	}
	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}
	public String getTeamname() {
		return teamname;
	}
	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getCoachName() {
		return coachName;
	}
	public void setCoachName(String coachName) {
		this.coachName = coachName;
	}

	
	@Override
	public String toString() {
		return "Team [teamId=" + teamId + ", teamname=" + teamname + ", ownerName=" + ownerName + ", coachName="
				+ coachName + "]";
	}
	
	
}