package classFifa;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Entry {

	public static void main(String[] args) {
		
		ArrayList<String> teams = new ArrayList<String>();
		Entry e = new Entry();
		e.initiate();
//		
//		teams.add("Chelsea");
//		
//		Team t = new Team("Arsenal", 3, 1, teams);
//		System.out.println("done");
	}
	
	// Initiate tournament by adding a Team class to a list
	// the class contains a team name, points, number of games
	// and a list of oponents
	public void initiate() {
		
		ArrayList<String> teams = getTeams();
		ArrayList<String> oponents = new ArrayList<String>();
		ArrayList<Team> classList = new ArrayList<Team>();
		
		for (int i = 0; i < teams.size(); i++) {
			oponents = teams;
			oponents.remove(oponents.get(i));
			Team t = new Team(teams.get(i), 0, 0, oponents);
			classList.add(t);
		}
		System.out.println("done!");
	}
	
	// Register teams
	public ArrayList<String> getTeams() {
		
		ArrayList<String> teams = new ArrayList<String>();
		int teamCount = numberOfTeams();
		
		for (int i = 0; i < teamCount; i++) {
			int index = i + 1;
			System.out.println("Team " + index + ":" );
			Scanner input = new Scanner(System.in);
			String teamName = input.next();
			
			while (teams.contains(teamName.toLowerCase())) {
				System.out.println("Team already exist in list!");
				System.out.println("Enter team " + index + " : ");
				
				Scanner new_input = new Scanner(System.in);
				teamName = new_input.next();
			}
			
			teams.add(teamName.toLowerCase());
		}
		
		System.out.println(teams);
		return teams;
	}
	
	// Register number of teams
	// must be more than two teams
	public int numberOfTeams() {
		
		System.out.println("Number of teams: ");
		Scanner input = new Scanner(System.in);
		int number = Integer.parseInt(input.next());
		
//		int number = 0;
//		try {
//			Scanner input = new Scanner(System.in);
//			number = Integer.parseInt(input.next());
//			
//		} catch (NumberFormatException n) {
//			System.err.println("IndexOutOfBoundsException: " + n.getMessage() + " input was not a number");
//		} 		
		
		while (number < 2 ) {
			System.out.println("Please enter two or more teams");
			Scanner inputTwo = new Scanner(System.in);
			number = Integer.parseInt(inputTwo.next());
		}
		
		return number;
	}
	
	// Generate matchups for this round 
	public void generateRound() {
		
		ArrayList<String> matchTeams = new ArrayList<String>();
		
		// TODO
	}
}
