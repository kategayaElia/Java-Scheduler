package taskmanagement;

import java.util.Scanner;

import models.Employee;
import models.Team;

public class TeamService {
	
//	Scanner scanner = new Scanner(System.in);
//	
//	public static void createTeam(String teamName) {
//		Team team = new Team();
//		team.setTeamName(teamName);
//		
//		//todo save this data in the db.
//		
//	}
	
	 Scanner scanner = new Scanner(System.in);

		public Team createTeam() {
			
			System.out.println("Enter Team Id");
			String teamId = scanner.nextLine();
			
			System.out.println("Enter Team Name");
			String teamName = scanner.nextLine();
			
			System.out.println("Enter Team Members");
			String teamMembers = scanner.nextLine();
			
			scanner.nextLine();
			
			
			Team team = new Team();
			team.setTeamId(teamId);
			team.setTeamName(teamName);

			System.out.println("My Team Details :");
			
			System.out.println(" Team Id " + teamId);
			System.out.println(" Team Name " + teamName);
			System.out.println(" Team Members " + teamMembers);
			
			return team;
		
			//todo save this data in the db.	
		}

}
