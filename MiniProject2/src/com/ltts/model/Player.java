package com.ltts.model;


public class Player {
	private int id;
	private String playerName;
	private String dob;
	private String country;
	private String skill;
	private String batStyle;
	private int runs;
	private int wickets;
	private int tid;
	private int matches;
	public Player() {
		super();
	}

	public Player(int id, String playerName, String dob, String country, String skill, String batStyle,
			int runs, int wickets,int tid, int matches) {
		super();
		this.id = id;
		this.playerName = playerName;
		this.dob = dob;
		this.country = country;
		this.skill = skill;
		this.batStyle = batStyle;
		this.runs = runs;
		this.wickets = wickets;
		this.tid=tid;
		this.matches = matches;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public String getBatStyle() {
		return batStyle;
	}

	public void setBatStyle(String batStyle) {
		this.batStyle = batStyle;
	}

	public int getMatches() {
		return matches;
	}

	public void setMatches(int matches) {
		this.matches = matches;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
	
	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", playerName=" + playerName + ", dob=" + dob + ", country=" + country + ", skill="
				+ skill + ", batStyle=" + batStyle + ", runs=" + runs + ", wickets=" + wickets + ", matches=" + matches
				+ ", tid=" + tid + "]";
	}


	
	
}