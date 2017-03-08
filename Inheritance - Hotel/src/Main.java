import java.util.Scanner;

public class Main {

	static void menu(){
	   System.out.println("Hotel Tariff Calculator\n1. Deluxe Room\n2. Deluxe AC Room\n3. Suite AC Room\nSelect Room Type:");
	}
	public static void main(String[] args) {
		 HotelRoom room;
		 menu();
		 Scanner input = new Scanner(System.in);
		 int choice = input.nextInt();
		 input.nextLine();
		 

		System.out.println("Hotel Name:");
		String name = input.nextLine();
		System.out.println("Room Square Feet Area:");
		int area = input.nextInt();
		input.nextLine();
		System.out.println("Room has TV (yes/no):");
		boolean tv = (input.nextLine().equals("yes")?true:false);
		System.out.println("Room has Wifi (yes/no):");
		boolean wifi = (input.nextLine().equals("yes")?true:false);
		input.close();
		
		if(choice==1)
			 room = new DeluxeRoom(name, area, tv, wifi);
		else if(choice==2)
			room = new DeluxeACRoom(name, area, tv, wifi);
		else
			room = new SuiteACRoom(name, area, tv, wifi);
			
		System.out.println("Room Tariff per day is:"+room.calculateTariff());

	}

}
