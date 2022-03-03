package dbAllOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Select {

	public void displayData()
	{
		

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
			System.out.println("Connection success");
			Statement stmt=connection.createStatement();
			ResultSet set=stmt.executeQuery("SELECT * FROM `6625`.user");
			while(set.next())// this will check that how many entries are in db 
			{
				System.out.println(set.getInt("id")+" "+set.getString("name"));
				
			}
			set.close();
				
			Statement stmt1=connection.createStatement();
			String query2="SELECT * FROM `6625`.account";
			
			
		} catch (Exception e) {
System.out.println("Error"+e);
		
		}
		
	}
	
	
}
