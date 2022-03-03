package arrayCall;

import java.util.Scanner;

public class ArrayFirst {

	public static void main(String[] args) {
	
		int a[]=new int[5];
		int sum=0;
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
			
			
		}
		
		for(int i=0;i<5;i++)
		{
			sum=sum+a[i]; // sum=0+1=1    sum=1+3=4     sum= 4+6=10
				System.out.println(sum);	
			
		}

		System.out.println("Final Sum="+sum);
	}

}
