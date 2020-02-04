package createTable;
//STEP 1. Import required packages
import java.sql.*;
import com.mysql.*;

public class createTable {
   
   public static void main(String[] args) {
   
   try{ 
//STEP 2: Register JDBC driver
		Class.forName("com.mysql.jdbc.Driver"); 
//STEP 3: Open a connection
		Connection conn=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/first","root","12345687");  				
		System.out.println("Connection Established!"); 
		 
//STEP 4: Execute a query
      System.out.println("Creating table in given database...");
      Statement stmt = conn.createStatement();
      
      String sql = "CREATE TABLE REGISTRATION " +
                   "(id INTEGER not NULL, " +
                   " first VARCHAR(255), " + 
                   " last VARCHAR(255), " + 
                   " age INTEGER, " + 
                   " PRIMARY KEY ( id ))"; 

      stmt.executeUpdate(sql);
      System.out.println("Created table in given database...");
      conn.close();
   }catch(Exception e){ System.out.println(e);}  
	}  
}   
      
   