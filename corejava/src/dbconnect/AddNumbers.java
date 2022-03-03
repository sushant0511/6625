package dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

class Storenumber
{
	
	
	public void addNumber()
	{

		try  
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/6625","root","root");
		Statement stmt=con.createStatement();
			
		ResultSet rs=stmt.executeQuery("select * from numberinput");  // fetching 
		while(rs.next())
		{
			System.out.println(rs.getInt(2)+rs.getInt(3));
		}
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public void displayNumber()
	{
	
		
		try  
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/6625","root","root");
		Statement stmt=con.createStatement();
			
		ResultSet rs=stmt.executeQuery("select * from numberinput");  // fetching 
		while(rs.next())
		{
			System.out.println(rs.getInt(2)+" "+rs.getInt(3));
		}
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
		
	}
	
	
	public void insertNumber()
	{
	
		
		try  
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/6625","root","root");
		Statement stmt=con.createStatement();
		System.out.println("Please enter numbers to add");
		int a,b;
		Scanner scanner=new Scanner(System.in);
		a=scanner.nextInt();
		b=scanner.nextInt();
		stmt.executeUpdate("Insert into numberinput(`num1`,`num2`) VALUES('"+a+"','"+b+"')");
			
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
	}
}

public class AddNumbers {

	public static void main(String[] args) {

Storenumber num=new Storenumber();
System.out.println("Enter your choice");
System.out.println("1----Add");
System.out.println("2----Insert");
System.out.println("3----Dispaly");
System.out.println("Press any number to exit");
int choice;
Scanner scanner=new Scanner(System.in);
choice=scanner.nextInt();
if(choice==1)
{
	num.addNumber();
	AddNumbers.main(args);
}

else if(choice==2)
{
	num.insertNumber();
	AddNumbers.main(args);
}
else if(choice==3)
{
	num.displayNumber();
	AddNumbers.main(args);
}
else
{
	System.exit(1);
}



		
	}

}
