package game;

import java.util.ArrayList;

public class Team {
	static public Team team = new Team();
  
	static Team getTeam() {
		return team;
	}
		
	private ArrayList<String> nameTeam = new ArrayList<>();

	
	private Team() {}
	
	public ArrayList<String> getNameTeam() {
		return nameTeam;
	}

	public void setNameTeam(String nameTeam) {
		this.nameTeam.add(nameTeam);
	}
		
}
