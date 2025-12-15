package flexi.java;
import java.sql.*;

// Database getTables

public class Sql12 {
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaFlexi",
            		"root", "anupinu@265!");
            
            DatabaseMetaData dbmd=con.getMetaData();
            // defining the table type more
            String table[]={"TABLE", "VIEW"};
            
            ResultSet rs=dbmd.getTables(null, null, null, table);
            while (rs.next()) {
            	System.out.println(rs.getString(1)+ "\t"+rs.getString(2)+ "\t"+rs.getString(3)+
            			"\t"+rs.getString(4));
            }
            
            con.close();
           
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}


