package model;

import java.util.Set;

public class Team {
	private int tid;
	private String tName;
	private Set<Player> player;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String gettName() {
		return tName;
	}
	public void settName(String tName) {
		this.tName = tName;
	}
	public Set<Player> getPlayer() {
		return player;
	}
	public void setPlayer(Set<Player> saveplayer) {
		this.player = saveplayer;
	}
	

}
