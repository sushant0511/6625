package corejava;

class Test
{
	public void show()
	{
		System.out.println("I am from SHOW");
	}

	public void show(int a) // parameter
	{
		System.out.println("I am from SHOW with int variable");
	}
	public void show(char a) // parameter
	{
		System.out.println("I am from SHOW with char variable");
	}
}

public class ClassDef {

	public static void main(String[] args) {
		
		Test test=new Test();
		test.show();
		test.show(10);
		test.show('s');

	}

}
