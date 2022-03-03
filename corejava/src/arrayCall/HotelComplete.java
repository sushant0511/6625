package arrayCall;

import java.util.Scanner;

public class HotelComplete {

	public static void main(String[] args) {

		
		System.out.println("Please Enter your Hotel details");
		String nameofHotel[]=new String[2];
		float cost[]=new float[2];
		String typeofRooms[]=new String[2];
		Scanner scanner= new Scanner(System.in);
		System.out.println("Please Enter your Hotel Data");
		for(int i=0;i<2;i++)
		{
			System.out.println("Please Enter your "+i+" Hotel Data");
		nameofHotel[i]=scanner.next();
		cost[i]=scanner.nextFloat();
		typeofRooms[i]=scanner.next();
		}
		
		
		for(int i=0;i<2;i++)
		{
		System.out.println(nameofHotel[i]+" "+cost[i]+" "+typeofRooms[i]);
		}

	}

}
