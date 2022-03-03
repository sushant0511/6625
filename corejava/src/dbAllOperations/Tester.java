package dbAllOperations;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {


		Insert insert=new Insert();
		Select select=new Select();
		Update update=new Update(); // break
		System.out.println("Please select Any Option");
		System.out.println("1--- Display Data");
		System.out.println("2--- Insert Data");
		System.out.println("3--- Update Data");
		System.out.println("Any Number to exit");
		Scanner scanner=new Scanner(System.in);
		int choice=scanner.nextInt();
		if(choice==1)
		{
			select.displayData();
			Tester.main(args);
			
		}
		else if(choice==2)
		{
			insert.insertData();
			Tester.main(args);
		}
		else if(choice==3)
		{
			update.updateData();
			Tester.main(args);
			
		}
		else
		{
			
			System.exit(1);
			
			
		}

	}

}
