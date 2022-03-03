package corejava;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {

		int a,b,c;
		float d,e,f;
		Scanner scanner=new Scanner(System.in);
		System.out.println("First number");
		a=scanner.nextInt();
		System.out.println("Second number");
		b=scanner.nextInt();
		c=a+b;
		System.out.println(c);
		d=scanner.nextFloat();
		e=scanner.nextFloat();
		f=d+e;
		System.out.println(f);
		
		

	}

}
