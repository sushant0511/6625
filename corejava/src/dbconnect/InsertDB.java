package dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class InsertDB {

	public static void main(String[] args) {
		try {
			int idValue;
			String nameValue;
			Scanner scanner=new Scanner(System.in);
			System.out.println("Type value to enter in DB ");
			idValue=scanner.nextInt();
			nameValue=scanner.next();
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/6625","root","root");
			Statement stmt=connection.createStatement();
			String query ="INSERT into user(`id`,`name`) VALUES('"+idValue+"','"+nameValue+"')"; 
			stmt.executeUpdate(query);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
