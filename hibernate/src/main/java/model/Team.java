package model;

import java.util.List;

public class Team {
	private int tid;
	private String tName;
	private List<Player> player;
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
	public List<Player> getPlayer() {
		return player;
	}
	public void setPlayer(List<Player> player) {
		this.player = player;
	}
	

}
