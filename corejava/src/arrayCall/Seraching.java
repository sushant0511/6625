package arrayCall;

import java.util.Scanner;

public class Seraching {

	public static void main(String[] args) {

		int a[]=new int[5];
		int item;
		int rakesh=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Input array");
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
						
		}
		System.out.println("Input item to serach");
		item=sc.nextInt();
		for(int i=0;i<5;i++)
		{
		if(a[i]==item)
		{
			rakesh=1;
			break;
			
		}
		
		}
		if(rakesh==1)
		{
			System.out.println("Find Item");
			
		}
		
		else
		{
			System.out.println("Not found Item");
		}
		
		

	}

}
