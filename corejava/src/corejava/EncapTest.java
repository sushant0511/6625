package corejava;


 class Encap {

	protected void testen()
	{
		System.out.println("Access in protected zone");
	}
}

public class EncapTest {
	
	private void testen()
	{
		System.out.println("Access in private zone");
	}
		public static void main(String[] args) {

			EncapTest obj=new EncapTest();
		obj.testen();
	}

}
