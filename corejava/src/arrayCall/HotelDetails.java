package arrayCall;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class HotelDetails {

	public void detailsOfHotel()
	{
		System.out.println("Please Enter your Hotel details");
		String nameofHotel;
		Hotel hotel=new Hotel();
		Scanner scanner= new Scanner(System.in);
		System.out.println("Please Enter your Hoel Data");
		nameofHotel=scanner.next();
		hotel.setName(nameofHotel);
		
		
//		cost=scanner.nextFloat();
//		typeofRooms[0]=scanner.next();
//		typeofRooms[1]=scanner.next();
//		typeofRooms[2]=scanner.next();
		
		
	}

}
