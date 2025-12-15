package flexi.java;
/*
import java.sql.*;

public class Sql1 {
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaFlexi", "root", "anupinu@265!");
            
            Statement s = con.createStatement();
            s.executeUpdate("update employee set salary = 2000 where empname='Rajesh'");

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

----------------------------------------------------------
import java.sql.*;

public class Sql1 {
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaFlexi", "root", "anupinu@265!");
            
            Statement s = con.createStatement();
            s.execute("create table Department (DeptName varchar(10) primary key, location varchar(10), Budget int)");
			
			con.close();
			
		}catch(Exception e) {System.out.println(e);}
	}
}

-----------------------------------------------------------------

import java.sql.*;

public class Sql1 {
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaFlexi",
            		"root", "anupinu@265!");
            		
            Statement s = con.createStatement();
            s.execute("create table Employee1(EmpId int primary key, Name varchar(10), "
            		+ "Dept_name varchar(10), Salary float, "
            		+ "foreign key (Dept_name) references Department(DeptName))");
			
			con.close();
			
		}catch(Exception e) {System.out.println(e);}
	}
}
-----------------------------------------------------------------
*/

//Example for Prepared statement create and execute
import java.sql.*;

public class Sql1 {
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaFlexi",
            		"root", "anupinu@265!");
            
            Statement s = con.createStatement();
            s.execute("CREATE TABLE IF NOT EXISTS meeting(Participant varchar(10), MeetingID varchar(4), "
            		+ "Day varchar(10))");
            
            String query="INSERT INTO meeting(Participant, MeetingID, Day) VALUES (?,?,?)";
            
            PreparedStatement pstmt=con.prepareStatement(query);
            pstmt.setString(1,"Gajanand");
            pstmt.setString(2,"1150");
            pstmt.setString(3,"Friday");
            int n=pstmt.executeUpdate();
            
            System.out.println(n+" Rows affected");
			
			con.close();
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}



