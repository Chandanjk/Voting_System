package updateTable;

//STEP 1. Import required packages
import java.sql.*;  
class updateTable{  
	public static void main(String args[])
	{  
		try{  
//STEP 2: Register JDBC driver
			Class.forName("com.mysql.jdbc.Driver"); 
//STEP 3: Open a connection
			Connection conn=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/first","root","pict123");  				
			System.out.println("Connection Established!"); 
//STEP 4: Execute a query
			System.out.println("Updating statement...");
			Statement stmt = conn.createStatement();
		    String sql = "UPDATE Registration " +
		                   "SET age = 22 WHERE id in (100, 101)";
		    stmt.executeUpdate(sql);
		    System.out.println("Updated statement Successfully!");
		    conn.close();
		}catch(Exception e){ System.out.println(e);}  
	}  
}  