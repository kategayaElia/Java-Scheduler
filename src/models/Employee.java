package models;

public class Employee {
    
	public static final String PERSONFILE = null;

	private String id;
	
	private String  name;
	
    private String employeeTeam;
    
    public Employee() {
    	
    }
    
    public Employee(String name) {
    	this.name = name;
    }

	public Employee(String id, String name, String employeeTeam) {

		this.id = id;
		this.name = name;
		this.employeeTeam = employeeTeam;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmployeeTeam() {
		return employeeTeam;
	}

	public void setEmployeeTeam(String employeeTeam) {
		this.employeeTeam = employeeTeam;
	}

	public static String getPersonfile() {
		return PERSONFILE;
	} 
    
}
