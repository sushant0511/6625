package corejava;

import java.util.Scanner;

public class MultipleCondition {

	public static void main(String[] args) {
		int physics,sub2,sub3,total;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter your marks");
		physics=scanner.nextInt();
		sub2=scanner.nextInt();
		sub3=scanner.nextInt();
		total=(physics+sub2+sub3)/3;
		System.out.println("Your Average marks is "+total);
		if(total>60)
		{
			System.out.println("Pass with first division");
		}
		
		
		else if(total>45 && total<59)
		{
			System.out.println("Pass with Second division");
		}
		else if(total>30 && total<45)
		{
			System.out.println("Pass with Third division");
		}
		else
		{
			System.out.println("Fail");
		}
		
	}

}
