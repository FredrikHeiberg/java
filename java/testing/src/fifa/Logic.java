package fifa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Logic {

	public static void main(String[] args) {
		Logic l = new Logic();
		l.start();
	}
	
	public void start() {
		
		System.out.println("How many teams?: ");
		int numberOfTeams = numberInput();
		System.out.println("How many rounds?: ");
		int numberOfRounds = numberInput();
		
		selectTeams(numberOfTeams);
	}
	
	// Select number of teams / number of rounds
	public int numberInput() {
		
		Scanner input = new Scanner(System.in);
		int number = Integer.parseInt(input.next());
		return number;
	}	
	
	// Select what teams to participate (exclude duplicates)
	public void selectTeams(int numberOfTeams) {
		
		HashMap<String, int[]> teamList = new HashMap<String, int[]>();
		// {points, num matches}
		int[] numMatch = {0,0};
		
		
		for (int i = 0; i < numberOfTeams; i++) {
			int index = i + 1;
			
			System.out.println("Enter team " + index + " : ");
			
			Scanner inputTeam = new Scanner(System.in);
			String teamName = inputTeam.next();
			
			if (teamList.containsKey(teamName)) {
				System.out.println("Team already exist in list!");
				System.out.println("Enter team " + index + " : ");
				
				Scanner inputTeam2 = new Scanner(System.in);
				teamName = inputTeam2.next();
			}
			
			//teamList.put(teamName, numMatch[]);
		}
	}
	
}
