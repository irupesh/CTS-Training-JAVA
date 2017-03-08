import java.util.Scanner;

public class Main {
	static void menu(){
		System.out.println("1.Four Wheeler\n2.Two Wheeler\nEnter Vehicle Type:");
	}
	
 public static void main(String[] args){
	 menu();
	 Scanner input = new Scanner(System.in);
	 int choice = input.nextInt();
	 input.nextLine();
	 
	 if(choice == 1){
	 System.out.println("Vehicle Make:");
	 String make = input.nextLine();
	 System.out.println("Vehicle Number:");
	 String number = input.nextLine();
	 System.out.println("Fuel Type:\n1.Petrol\n2.Diesel");
	 String type = (input.nextInt()==1?"Petrol":"Diesel");
	 System.out.println("Fuel Capacity:");
	 int capa = input.nextInt();
	 System.out.println("Engine CC:");
	 int cc = input.nextInt();
	 input.nextLine();
	 System.out.println("Audio System:");
	 String audio = input.nextLine();
	 System.out.println("Number of Doors:");
	 int door = input.nextInt();
	 Vehicle v1 = new FourWheeler(make, number, type, capa, cc, audio, door);
	 v1.displayMake();
	 v1.displayBasicInfo();
	 v1.displayDetailInfo();
	 }else{
		 System.out.println("Vehicle Make:");
		 String make = input.nextLine();
		 System.out.println("Vehicle Number:");
		 String number = input.nextLine();
		 System.out.println("Fuel Type:\n1.Petrol\n2.Diesel");
		 String type = ((input.nextInt())==1?"Petrol":"Diesel");
		 System.out.println("Fuel Capacity:");
		 int capa = input.nextInt();
		 System.out.println("Engine CC:");
		 int cc = input.nextInt();
		 input.nextLine();
		 System.out.println("Kick Start Available(yes/no):");
		 boolean kick = (input.nextLine().equals("yes")?true:false);
		 Vehicle v1 = new TwoWheeler(make, number, type, capa, cc, kick);
		 v1.displayMake();
		 v1.displayBasicInfo();
		 v1.displayDetailInfo();
	 }
	 input.close();
 }
}
