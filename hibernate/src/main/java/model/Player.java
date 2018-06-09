package model;

public class Player {
private int pid;
private String pName;
private int  tid;
private int pAge;
private Team team;

public Team getTeam() {
	return team;
}
public void setTeam(Team team) {
	this.team = team;
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getpName() {
	return pName;
}
public void setpName(String pName) {
	this.pName = pName;
}
public int getTid() {
	return tid;
}
public void setTid(int tid) {
	this.tid = tid;
}
public int getpAge() {
	return pAge;
}
public void setpAge(int pAge) {
	this.pAge = pAge;
}


}
