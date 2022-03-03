package bean;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CollectionCallMutipleBean {

	public static void main(String[] args) {

List<Learner> list=new LinkedList<Learner>();
		
int id,choice;
String name,address;
Scanner scanner=new Scanner(System.in);
System.out.println("Enter you limit");
choice=scanner.nextInt();
Learner learner;
for(int i=1;i<=choice;i++)
{
	learner=new Learner();
System.out.println("Enter your "+i+" data ");

id=scanner.nextInt();
name=scanner.next();
address=scanner.next();

learner.setId(id);
learner.setName(name);
learner.setAddress(address);
list.add(learner);
}

System.out.println("Output");
		
		for(Learner xyz:list)
		{
			System.out.println(xyz.getId()+" "+xyz.getName()+" "+xyz.getAddress());
		}

		

	}

}
