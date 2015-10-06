package fifaGenerator;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Entry {
	
	public int nOfTeams = 0;
	public ArrayList<String> teamList = new ArrayList<String>();

	public static void main(String[] args) {
		Entry e = new Entry();
		e.start();
	}
	
	public void start() {
		int rounds = numberOfRounds();
		numberOfTeams();
		teams();
		
		for (int i = 0; i < rounds; i++) {
			System.out.println(i);
			generateNextRound();
		}
	}
	
	// Generate teamList (exclude duplicates)
	public void teams() {
		
		//ArrayList<String> teamList = new ArrayList<String>();
		int number = nOfTeams;
		
		for (int i = 0; i < number; i++) {
			int index = i + 1;
			
			System.out.println("Enter team " + index + " : ");
			
			Scanner user_input = new Scanner(System.in);
			String teamName = user_input.next();
			
			if (teamList.contains(teamName)) {
				System.out.println("Team already exist in list!");
				System.out.println("Enter team " + index + " : ");
				
				Scanner new_input = new Scanner(System.in);
				teamName = new_input.next();
			}
			
			teamList.add(teamName);
		}
	}
	
	// Select number of Teams
	public void numberOfTeams() {
		
		System.out.println("Enter number of teams: ");
		
		Scanner user_input = new Scanner(System.in);
		
		nOfTeams = Integer.parseInt(user_input.next());
	}
	
	// Decide how many times teams play each other
	public int numberOfRounds() {
		Scanner user_input = new Scanner(System.in);
		
		System.out.println("How many times shal the teams meet each other?: ");
		int number = Integer.parseInt(user_input.next());
		
		return number;
	}
	
	// Generate next round match ups
	public void generateNextRound() {
		
		//ArrayList<String> listOfTeams = teams();
		ArrayList<String> listOfTeams = teamList;
		ArrayList<String> teamsPlayed = new ArrayList<String>();
		
		System.out.println(listOfTeams);
		System.out.println(teamList);
		
		int index = 1;
		
		while (listOfTeams.size() > 0) {

			Random randomizer = new Random();
			
			String homeTeam = listOfTeams.get(randomizer.nextInt(listOfTeams.size()));
			String awayTeam = "";
			
			teamsPlayed.add(homeTeam);
			listOfTeams.remove(homeTeam);
			
			if (listOfTeams.size() == 0) {
				awayTeam = teamsPlayed.get(randomizer.nextInt(teamsPlayed.size()));
			}
			
			else {
				awayTeam = listOfTeams.get(randomizer.nextInt(listOfTeams.size()));
				
				teamsPlayed.add(awayTeam);
				listOfTeams.remove(awayTeam);
			}

			System.out.println("Match " + index + ": " + homeTeam + " - " + awayTeam);
			index += 1;
		}
	}
}
	