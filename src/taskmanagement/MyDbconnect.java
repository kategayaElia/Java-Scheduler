package taskmanagement;


import java.sql.*;

public class MyDbconnect {
    public void mydbconnectmtd() {
        String url = "jdbc:mysql://localhost/";
        String dbName = "repeatdb";
        String driver = "com.mysql.cj.jdbc.Driver";
        String userName = "root";
        String password = "Kiutech2018@";

        try {
//            Class.forName(driver).newInstance();
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(url + dbName, userName, password);

            Statement stmt = conn.createStatement();

            String sql;

//            sql = "CREATE SCHEMA myUserDetails2";
//            stmt.executeUpdate(sql);

            sql = "USE repeatdb";
            stmt.executeUpdate(sql);

            sql = "CREATE TABLE employee_details" +
                    "(id INTEGER not NULL, " +
                    " name VARCHAR(255), " +
                    " task VARCHAR(255), " +
                    " PRIMARY KEY ( id ))";
            stmt.executeUpdate(sql);
            
            sql = "CREATE TABLE task" +
                    "(id INTEGER not NULL, " +
                    " name VARCHAR(255), " +
                    " PRIMARY KEY ( id ))";
            stmt.executeUpdate(sql);
            
            sql = "CREATE TABLE team" +
                    "(id INTEGER not NULL, " +
                    " name VARCHAR(255), " +
                    " team_members VARCHAR(255), " +
                    " PRIMARY KEY ( id ))";
            stmt.executeUpdate(sql);
            
            sql = "CREATE TABLE team_task" +
                    "(id INTEGER not NULL, " +
                    " name VARCHAR(255), " +
                    " team_members VARCHAR(255), " +
                    " PRIMARY KEY ( id ))";
            stmt.executeUpdate(sql);

            stmt.close();
            conn.close();

            System.out.println("Database created successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
