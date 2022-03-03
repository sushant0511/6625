package corejava;

import java.util.Scanner;

public class Sod {

	public static void main(String[] args) {
		
		int num,a,res=0;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		int hold=num;
		while(num>0)  //123   12   1
		{
		a=num%10;// 123%10=3   12%10  2   1
		res=res*10+a; // 0+3=3   3*10+2=32  32*10+1=321
		num=num/10; // 123/10 12 1  0
		}
		System.out.println("Result="+res);
		
		if(hold==res)
		{
			System.out.println("Number is same");
		}
		else
		{
			System.out.println("Number is diffrent");
		}
	}

}
