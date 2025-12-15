package flexi.java;
import java.sql.*;

// knowing info related to our database
// database meta data method is used get related data
// getMetaData collect the data

public class Sql10 {
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaFlexi",
            		"root", "anupinu@265!");
            
            DatabaseMetaData dbmd= con.getMetaData();
           
            System.out.println("Driver Name: " +dbmd.getDriverName());
            System.out.println("Driver Version: " +dbmd.getDriverVersion());
            System.out.println("UserName: " +dbmd.getUserName());
            System.out.println("Database Product Name: " +dbmd.getDatabaseProductName());
            System.out.println("Databasev Product Version: " +dbmd.getDatabaseProductVersion());
            
            con.close();
           
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}


