package arrayCall;

import java.util.Scanner;

public class FilterElements {

	public static void main(String[] args) {

		int startrange,endrange;
		Scanner scanner=new Scanner(System.in);
		startrange=scanner.nextInt();
		endrange=scanner.nextInt();
		for(int i=startrange;i<=endrange;i++)
		{
			if(i%3==0) // 7%3=1 6%3=0
			{
				System.out.println(i+" number is divided by 3"); //break 16:40
			}
			

			else if(i%4==0)
			{
				System.out.println(i+" number is divided by 4");
			}
			 else
			 {
				 System.out.println(i+" number are not divided by any number");
			 }
		}

	}

}
