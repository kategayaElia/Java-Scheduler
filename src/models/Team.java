package models;

import java.util.ArrayList;

public class Team {
	
	    public String teamId;
	    public String teamName;
	    public String teamMembers;
	    
		public Team () {
				
		} 
        
		public Team (String teamName) {			
			this.teamName = teamName;
		}

		public Team(String teamId, String teamName, String teamMembers) {
		
			this.teamId = teamId;
			this.teamName = teamName;
			this.teamMembers = teamMembers;
		}

		public String getTeamId() {
			return teamId;
		}

		public void setTeamId(String teamId) {
			this.teamId = teamId;
		}

		public String getTeamName() {
			return teamName;
		}

		public void setTeamName(String teamName) {
			this.teamName = teamName;
		}

		public String getTeamMembers() {
			return teamMembers;
		}

		public void setTeamMembers(String teamMembers) {
			this.teamMembers = teamMembers;
		}

		
		
}
