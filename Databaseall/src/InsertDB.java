import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class InsertDB {

	public static void main(String[] args) {


		try
		{
		String name;
		int m1,m2;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter name follwed by marks");
			name=scanner.next();
			m1=scanner.nextInt();
			m2=scanner.nextInt();
			Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("File Found");
		Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/6625","root","root");
		System.out.println("Database connected successfully");
		Statement stmt=con.createStatement();
		String query="INSERT into result(`name`,`sub name1`,`sub1 marks`,`sub name2`,`sub2 marks`) VALUES('"+name+"','Physics','"+m1+"','Math','"+m2+"')";
		stmt.executeUpdate(query);
		
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		

	}

}
