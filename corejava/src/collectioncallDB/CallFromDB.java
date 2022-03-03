package collectioncallDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

public class CallFromDB { 

	public static void main(String[] args) {

		List<Student> list=new LinkedList<Student>();
		try  
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/6625","root","root");
		Statement stmt=con.createStatement();
			
		
		ResultSet rs=stmt.executeQuery("select * from student");  // fetching 
		while(rs.next())
		{
			Student student=new Student(); //one student only 
			student.setId(rs.getInt("id"));
			student.setName(rs.getString("name"));
			student.setAddress(rs.getString("address"));
			student.setFees(rs.getFloat("fees"));
			list.add(student);
		}
		for(Student stu:list)
		{
			System.out.print(stu.getId()+" ");
			System.out.print(stu.getName()+" ");
			System.out.print(stu.getAddress()+" ");
			System.out.println(stu.getFees()+" ");
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		

	}

}
