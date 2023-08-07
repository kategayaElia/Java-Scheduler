package models;
;

public class Task {

	    public String taskId;
	    public String taskName;
	    
	    
		public Task () {
			
			
		} 
        
		public Task (String taskName) {	
			
			this.taskName = taskName;
			
		}

		public Task(String taskId, String taskName) {
			this.taskId = taskId;
			this.taskName = taskName;
		}

		public String getTaskId() {
			return taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public String getTaskName() {
			return taskName;
		}

		public void setTaskName(String taskName) {
			this.taskName = taskName;
		}	
	    
}
