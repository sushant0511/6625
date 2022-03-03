package corejava;

class Maruti
{
	public void tyre()
	{
		System.out.println("I have four tyres");
	}
	
}
class Santro extends Maruti
{
	public void powerWindows()
	{
		System.out.println("I have power windows");
		
	}
}

class BMW extends Santro
{
	public void airBags()
	{
		System.out.println("I have airbags");
	}
	
}




public class InheriTest {

	public static void main(String[] args) {
		
		
		
		BMW bmw=new BMW();
		bmw.airBags();
		bmw.tyre();
		bmw.powerWindows();
		

	}

}
