package corejava;

class Abc   
{
	public void add()
	{
		int a,b,c;
		a=10;b=20;c=a+b;
		System.out.println("Add="+c);

	}
	public void sub()
	{
		int a,b,c;
		a=10;b=20;c=a-b;
		System.out.println("Sub="+c);

	}
}

public class MainCall {

	public static void main(String[] args) {

		Abc abc=new Abc();
		abc.add();
		abc.sub();
				
	}

}
