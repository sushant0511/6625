package edubridgeadmission;

import java.util.Scanner;

class Add
{
	public void addition()
	{Scanner sc=new Scanner(System.in); 
	int range =sc.nextInt();
	int a[]= new int[range];
	
	System.out.println("Enter your array");
	for(int i=0;i<range;i++)
	{
		a[i]=sc.nextInt();
	}
	System.out.println("How many elements you want to sort");
	int choice=sc.nextInt();
	
	
	int saquib=0;
	if(choice>range)
	{
		System.out.println("Not possible to sort");
	}
	else
	{
for(int i=0;i<choice;i++)
{
  for(int k=0;k<choice-1;k++)
  {
	  // i=1,k=1
	  //   33>24
	  if(a[k]>a[k+1])
		{
			saquib=a[k]; 
			a[k]=a[k+1];
			a[k+1]=saquib;
			
		}
	  //sort half array 
  }
	
}
}

System.out.println("Output");
for(int i=0;i<range;i++)
{
  System.out.println(a[i]);
}
	}
}

class Sub
{
	public void subtratcion()
	{
		int a,b,c;
		a=10;
		b=20;
		c=a-b;
		System.out.println("Sub="+c);
	}
}


public class TestMenu {

	public static void main(String[] args) {

		System.out.println("Enter your menu to perofrm operations");
		System.out.println("1---Add");
		System.out.println("2---Sub");
		System.out.println("Press any other number to exit");
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter you choice");
		int choice=scanner.nextInt();
		
		Add add=new Add();
		Sub sub=new Sub();
		if(choice==1)
		{
			add.addition();
			TestMenu.main(args);
		}

		else if(choice==2)
		{
		sub.subtratcion();
		TestMenu.main(args);
		}
	}

}
