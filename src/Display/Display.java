package Display;
//STEP 1. Import required packages
import java.sql.*;  
class Display{  
	public static void main(String args[])
	{  
		try{  
//STEP 2: Register JDBC driver
			Class.forName("com.mysql.jdbc.Driver"); 
//STEP 3: Open a connection
			Connection con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/first","root","pict123");  				
			System.out.println("Connection Established!"); 
//STEP 4: Execute a query
			Statement stmt=con.createStatement();  									
			ResultSet rs=stmt.executeQuery("select * from registration");  			
			while(rs.next())  
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getInt(4));  
			con.close();  
			}catch(Exception e){ System.out.println(e);}  
	}  
}  