package flexi.java;
import java.sql.*;

// Database getTables

public class Sql13 {
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaFlexi",
            		"root", "anupinu@265!");
            
            PreparedStatement ps=con.prepareStatement ("select * from employee");
            ResultSet rs=ps.executeQuery();
            ResultSetMetaData rsmd=rs.getMetaData();
            
            DatabaseMetaData dbmd=con.getMetaData();
            
            // database,schema type, table name, table type 
            rs=dbmd.getTables("javaflexi", null, "employee", null);
            while (rs.next()) {
            	System.out.println(rs.getString(1)+ "\t"+rs.getString(2)+ "\t"+rs.getString(3)+
            			"\t"+rs.getString(4));
            	System.out.println("Total columns: " +rsmd.getColumnCount());
                System.out.println("Column name of 2nd column: " +rsmd.getColumnName(2));
                System.out.println("Column type name of 1st column: " +rsmd.getColumnTypeName(1));
                System.out.println("Name of the table of the 1st column: " +rsmd.getTableName(1));
                
            }
            
            con.close();
           
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}


