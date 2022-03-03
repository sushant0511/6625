package interfacetest;

class Car implements Maruti,Santro,BWM
{

	@Override
	public void tyre() {
		System.out.println("I have four tyres");
	}

	@Override
	public void powerWindows() {
		System.out.println("I have power windows");
		
	}

	@Override
	public void airBags() {
		
		
	}
	
}

public class MainCallInt {

	public static void main(String[] args) {
		
		
   Car car=new Car();
   car.airBags();
   car.powerWindows();
   car.tyre();
		 
	}

}
