package taskmanagement;

import java.util.Scanner;

import models.Employee;
import models.Team;
import models.Teamtask;

public class TeamTaskService{
	
	Scanner scanner = new Scanner(System.in);

	public Teamtask createTeamTask() {
		
		System.out.println("Enter Teamtask Id");
		String teamtaskId = scanner.nextLine();
		
		System.out.println("Enter Teamtask Name");
		String teamtaskName = scanner.nextLine();

		
		scanner.nextLine();
		
		
		Teamtask tasks = new Teamtask();
		tasks.setTeamTaskId(0);
		tasks.setTeamTaskName(teamtaskName);

		System.out.println("My Teamtask Details :");
		
		System.out.println(" My Teamtask Id " + teamtaskId);
		System.out.println(" My Teamtask Name " + teamtaskName);
		
		return tasks;
		
		//todo save this data in the db.	
	}
	
}