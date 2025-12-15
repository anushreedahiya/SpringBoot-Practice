package flexi.java;
import java.sql.*;

// Database getTables

public class Sql11 {
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaFlexi",
            		"root", "anupinu@265!");
            
            DatabaseMetaData dbmd=con.getMetaData();
            
            /*
            ResultSet rs=dbmd.getTables(null, null, null, null);
            // overall there are 10 columns
            // catalog, schema pattern=null(mostly)
            // gives only table name no rows or column
            // database name, null, table name, its type be it system table or table made by us
            while (rs.next()) {
            	System.out.println(rs.getString(1)+ "\t"+rs.getString(2)+ "\t"+rs.getString(3)+
            			"\t"+rs.getString(4));
            }
            */
            // filtering our search
            ResultSet rs=dbmd.getTables("javaflexi", null, null, null);
            while (rs.next()) {
            	System.out.println(rs.getString(1)+ "\t"+rs.getString(2)+ "\t"+rs.getString(3)+
            			"\t"+rs.getString(4));
            }
            // to filter more, removing null and writing name that satisfy search condition
            
            con.close();
           
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}


