import java.util.Scanner;


class OperationTest
{
	
	public void search()
	{
		Scanner sc=new Scanner(System.in); 
		int range =sc.nextInt();
		int a[]= new int[range];
		
		System.out.println("Enter your array");
		for(int i=0;i<range;i++)
		{
			a[i]=sc.nextInt();
		}
		
  
  System.out.println(" Array Output");
  for(int i=0;i<range;i++)
  {
	  System.out.println(a[i]);
  }
  
  System.out.println("Enter item to search");
  int item=sc.nextInt();
  int rakesh=0;
  for(int i=0;i<range;i++)
	  
  
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
	
	
	public void sort()
	{
		
		Scanner sc=new Scanner(System.in); 
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


public class DoubleLoop {

	public static void main(String[] args) {

		OperationTest test=new OperationTest();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enetr your choice");
		System.out.println("1--Sort");
		System.out.println("2--Search");
		System.out.println("3--Exit");
		int choice=scanner.nextInt();
		if(choice==1)
		{
			test.sort();
			DoubleLoop.main(args);
		}
		else if(choice==2)
		{
		test.search();
		DoubleLoop.main(args);
		}
		else if(choice==3)
		{
			System.exit(1);
		}
  
	}

}
