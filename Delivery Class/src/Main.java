import java.util.Scanner;

public class Main {

	public static void main(String args[]){
		 
		 Delivery obj = new Delivery();

			
			 	Scanner input = new Scanner(System.in);
			 	
			 	System.out.println("Enter the over");
			 	obj.over = input.nextLong();
			 	input.nextLine();
			 	
			 	System.out.println("Enter the ball");
			 	obj.ball = input.nextLong();
			 	input.nextLine();
			 	
			 	System.out.println("Enter the runs");
			 	obj.runs = input.nextLong();
			 	input.nextLine();
			 	
			 	System.out.println("Enter the batsman name");
			 	obj.batsman = input.nextLine();
			 	
			 	System.out.println("Enter the bowler name");
			 	obj.bowler = input.nextLine();
			 	
			 	System.out.println("Enter the nonStriker name");
			 	obj.nonStriker = input.nextLine();
			 	
			 	obj.displayDeliveryDetails();
			 	
			    input.close();
			    
		}
}
