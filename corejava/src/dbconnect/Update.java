package dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Update {

	public static void main(String[] args) {
		try {
			int idValue;
			String nameValue;  // break 
			Scanner scanner=new Scanner(System.in);
			System.out.println("Type id to update name in DB ");
			idValue=scanner.nextInt();
			nameValue=scanner.next();
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/6625","root","root");
			Statement stmt=connection.createStatement();
			String query ="UPDATE `6625`.`user` SET `name` = '"+nameValue+"' WHERE (`id` = '"+idValue+"');"; 
			stmt.executeUpdate(query);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
