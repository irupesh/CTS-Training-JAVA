import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		 
		 Venue obj = new Venue();

			
			 	Scanner input = new Scanner(System.in);
			 	
			 	
			 	
			 	System.out.println("Enter the venue details");
			 	String detail = input.nextLine();
			 	
			 	String[] details = detail.split(",");
			 	
			 	obj.name = details[0];
			 	obj.city = details[1];
			 	
			 	System.out.println("Venue Details");
			 	System.out.println("Venue Name : "+obj.name);
			 	System.out.println("City Name : "+obj.city);
			    input.close();
		}


}
