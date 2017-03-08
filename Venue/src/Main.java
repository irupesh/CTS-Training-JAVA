import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		 
		 Venue obj = new Venue();

			
			 	Scanner input = new Scanner(System.in);
			 	
			 	System.out.println("Enter the venue name");
			 	obj.name = input.nextLine();
			 	
			 	System.out.println("Enter the city name");
			 	obj.city = input.nextLine();
			 	
			 	System.out.println("Venue Details :");
			 	System.out.println("Venue Name : "+obj.name);
			 	System.out.println("City Name : "+obj.city);
			    input.close();
		}


}
