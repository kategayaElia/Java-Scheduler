
import taskmanagement.MyDbconnect;
import taskmanagement.TaskService;
import taskmanagement.TeamService;
import taskmanagement.TeamTaskService;
import taskmanagement.EmployeeService;
public class Main {

	public static void main(String[] args) {
		
		MyDbconnect my = new MyDbconnect();
		my.mydbconnectmtd();
		
		System.out.println("............................");
		
		EmployeeService myemp = new EmployeeService();
		myemp.createEmp();
		
		System.out.println("............................");
		
		TaskService myTask = new TaskService();
		myTask.createTask();
		
		System.out.println("............................");
		
		TeamService myTeam = new TeamService();
		myTeam.createTeam();
		
        System.out.println("............................");
		
        TeamTaskService myTeamTask = new TeamTaskService();
		myTeamTask.createTeamTask();

	}

}
