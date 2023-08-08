package database;

public class Tables {
   
    public static String teamsTableQuery = "CREATE TABLE teams (\n" +
            "Id int NOT NULL AUTO_INCREMENT,\n" +
            "Name varchar(255) NOT NULL,\n" +
            "PRIMARY KEY (Id)\n" +
            ");";
    public static String tasksTableQuery = "CREATE TABLE tasks (\n" +
            "Id int NOT NULL AUTO_INCREMENT,\n" +
            "Name varchar(255) NOT NULL,\n" +
            "PRIMARY KEY (Id)\n" +
            ");";
    public static String calendarTableQuery = "CREATE TABLE calendars (\n" +
            "Id int NOT NULL AUTO_INCREMENT,\n" +
            "TheDate date,\n" +
            "PRIMARY KEY (Id)\n" +
            ");";
    public static String employeesTableQuery = "CREATE TABLE employees (\n" +
            "Id int NOT NULL AUTO_INCREMENT,\n" +
            "Name varchar(255) NOT NULL,\n" +
            "TeamId int,\n" +
            "PRIMARY KEY (Id),\n" +
            "CONSTRAINT FK_TeamEmployee FOREIGN KEY (TeamId) REFERENCES teams(Id)\n" +
            ");";
    public static String teamTasksTableQuery = "CREATE TABLE teamtasks (\n" +
            "Id int NOT NULL AUTO_INCREMENT,\n" +
            "TeamId int,\n" +
            "TaskId int,\n" +
            "TheDate date,\n" +
            "PRIMARY KEY (Id),\n" +
            "CONSTRAINT FK_TeamTeamTask FOREIGN KEY (TeamId) REFERENCES teams(Id),\n" +
            "CONSTRAINT FK_TsskTeamTask FOREIGN KEY (TaskId) REFERENCES tasks(Id),\n" +
            "CONSTRAINT UC_TeamTasks UNIQUE (TeamId, TaskId)\n" +
            ");";
    public static String calendarTeamTasksTableQuery = "CREATE TABLE calendar_teamtasks (\n" +
            "CalendarId int,\n" +
            "TeamtasksId int,\n" +
            "CONSTRAINT FK_CalendarTeamTask FOREIGN KEY (CalendarId) REFERENCES calendars(Id),\n" +
            "CONSTRAINT FK_TeamTaskCalendar FOREIGN KEY (TeamtasksId) REFERENCES teamtasks(Id)\n" +
            ");";

}
