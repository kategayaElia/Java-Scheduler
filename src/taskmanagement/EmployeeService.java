package taskmanagement;

import java.util.Scanner;
import models.Employee; 

public class EmployeeService {
	
    Scanner scanner = new Scanner(System.in);

	public Employee createEmp() {
		
		System.out.println("Enter Employees Id");
		String empId = scanner.nextLine();
		
		System.out.println("Enter Employees Name");
		String empName = scanner.nextLine();
		
		System.out.println("Enter Employees Team");
		String empTeam = scanner.nextLine();
		
		scanner.nextLine();
		
		
		Employee employee = new Employee();
		employee.setId(empId);
		employee.setName(empName);
		employee.setEmployeeTeam(empTeam);

		System.out.println("My Employee Details :");
		
		System.out.println(" Employee Id: " + employee.getId());
		System.out.println(" Employee Name: " + employee.getName());
		System.out.println(" Employee Team: " + employee.getEmployeeTeam());
		
		return employee;
	
		//todo save this data in the db.	
	}
	
		
	
}
