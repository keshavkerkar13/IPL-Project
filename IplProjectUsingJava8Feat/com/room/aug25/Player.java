package com.room.aug25;

public class Player {
	private int jerseyno;
	private String name;
	private int runs;
	private int wickets;
	private String Tname;
	public Player() {
		super();
	}
	public Player(int jerseyno, String name, int runs, int wickets, String tname) {
		super();
		this.jerseyno = jerseyno;
		this.name = name;
		this.runs = runs;
		this.wickets = wickets;
		Tname = tname;
	}
	@Override
	public String toString() {
		return "Player [jerseyno=" + jerseyno + ", name=" + name + ", runs=" + runs + ", wickets=" + wickets
				+ ", Tname=" + Tname + "]";
	}
	public int getJerseyno() {
		return jerseyno;
	}
	public void setJerseyno(int jerseyno) {
		this.jerseyno = jerseyno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getTname() {
		return Tname;
	}
	public void setTname(String tname) {
		Tname = tname;
	}

}
