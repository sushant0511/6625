import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBTest {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("File Found");
			Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/6625","root","root");
			System.out.println("Database connected successfully");
			Statement stmt=con.createStatement();
			ResultSet resultSet=stmt.executeQuery("SELECT * FROM result");
			System.out.println("Id "+"Name  "+"  Sub1 "+"  mark "+" Sub2  "+" mark");
			while(resultSet.next())
			{
				System.out.println(resultSet.getInt(1)+"  "+resultSet.getString(2)+"  "+resultSet.getString(3)+"  "+resultSet.getString(4)+"  "+resultSet.getString(5)+"  "+resultSet.getString(6));
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
