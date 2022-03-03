package corejava;

import java.util.Scanner;

public class FactorialTest {

	public static void main(String[] args) {

		int fact,res=1;
		Scanner scanner=new Scanner(System.in);
		fact=scanner.nextInt();
		for(int i=fact;i>1;i--)
		{
			res=res*i;
			System.out.println(res);
		}
	
		
		
		

	}

}
