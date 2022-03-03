package corejava;

import java.util.Scanner;

public class ConditionTest {

	public static void main(String[] args) {
	
		int marks;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter your marks");
		marks=scanner.nextInt();
		if(marks>=30)//condition
		{
			System.out.println("You are pass");
		}
		else
		{
			System.out.println("You are fail");
		}

	}

}
