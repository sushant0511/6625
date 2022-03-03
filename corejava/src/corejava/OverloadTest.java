package corejava;
class TestOver
{
	public void show()
	{
		System.out.println("Method 1");
	}
	public void show(int a)
	{
		System.out.println("Method from int overload");
	}
	public void show(char a)
	{
		System.out.println("Method from char overload");
	}
}
public class OverloadTest {

	public static void main(String[] args) {
		
		TestOver over=new TestOver();
		over.show();
		over.show(10);
		over.show('a');
	}

}
