package models;

public class Teamtask {

	private int teamTaskId;
	
	private String teamTaskName;
	
	private Team task;

	public Teamtask() {	
		
	} 
    
	public Teamtask (String teamTaskName) {			
		this.teamTaskName = teamTaskName;
	}

	public Teamtask(int teamTaskId, String teamTaskName, Team task) {

		this.teamTaskId = teamTaskId;
		this.teamTaskName = teamTaskName;
		this.task = task;
	}

	public int getTeamTaskId() {
		return teamTaskId;
	}

	public void setTeamTaskId(int teamTaskId) {
		this.teamTaskId = teamTaskId;
	}

	public String getTeamTaskName() {
		return teamTaskName;
	}

	public void setTeamTaskName(String teamTaskName) {
		this.teamTaskName = teamTaskName;
	}

	public Team getTask() {
		return task;
	}

	public void setTask(Team task) {
		this.task = task;
	}
		
}
