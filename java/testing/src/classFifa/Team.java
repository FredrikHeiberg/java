package classFifa;

import java.util.ArrayList;

public class Team {
	
	private String name;
	private int points;
	private int matchesPlayed;
	private ArrayList<String> teamsMeet;
	
	public Team(String name, int points, int matchesPlayed, ArrayList<String> teamsMeet) {
		this.name = name;
		this.points = points;
		this.matchesPlayed = matchesPlayed;
		this.teamsMeet = teamsMeet;
	}
	
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getPoints() {
//		return points;
//	}
//	public void setPoints(int points) {
//		this.points = points;
//	}
//	public int getMatchesPlayed() {
//		return matchesPlayed;
//	}
//	public void setMatchesPlayed(int matchesPlayed) {
//		this.matchesPlayed = matchesPlayed;
//	}
//	public ArrayList<String> getTeamsMeet() {
//		return teamsMeet;
//	}
//	public void setTeamsMeet(ArrayList<String> teamsMeet) {
//		this.teamsMeet = teamsMeet;
//	}
		
}
