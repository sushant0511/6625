package corejava;

import java.util.Scanner;

public class FabSeries {

	public static void main(String[] args) {

			int a,b,c,range;
			Scanner scanner=new Scanner(System.in);
			range=scanner.nextInt();
				
			a=0;
			b=1;
			System.out.println(a);
			System.out.println(b);
			for(int i=1;i<=range-2;i++)  // break 16:30
			{
				c=a+b;
				System.out.println(c);
				a=b;
				b=c;
			}
		
		

	}

}
