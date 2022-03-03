package corejava;

import java.util.Scanner;

public class GretaerTest {

	public static void main(String[] args) {

		int a,b,c;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter your number");
		a=scanner.nextInt();
		b=scanner.nextInt();
		c=scanner.nextInt();
		if(a>b )
		{
			if(a>c)
			System.out.println("A is greater");
		}
		else 
		{
			if(b>c)
			System.out.println("B is greater");
		else
		System.out.println("C is greater");
		}
		
		
		
		
	}

}
