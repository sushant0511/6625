import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class HighestMarks {

	public static void main(String[] args) {

		try {
			int marks1[]=new int[6];
			String topper="null";  // break 
			String name[]=new String[6];
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/6625","root","root");
			Statement stmt=con.createStatement();
			ResultSet resultSet=stmt.executeQuery("SELECT * FROM result ");
			int i=0;  //break 5 
			int max=1;
			while(resultSet.next())
			{
			name[i]=resultSet.getString(2);
			marks1[i]=resultSet.getInt(6);
			if(marks1[i]>max) //75>1  74>75  78>75 99>78   74>99   75>99
			{
				max=marks1[i]; // max=99
				topper=name[i];
			}
			
		//System.out.println(name[i]+"  "+marks1[i]);
		
		}
			System.out.println(topper+" in math marks= "+max);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
