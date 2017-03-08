import java.util.Scanner;

public class Main {
	
	public static void main(String args[]){
		 
		 Innings obj = new Innings();

			
			 	Scanner input = new Scanner(System.in);
			 	
			 	System.out.println("Enter the innings number");
			 	obj.number = input.nextLine();
			 	
			 	System.out.println("Enter the BattingTeam");
			 	obj.battingTeam = input.nextLine();
			 	
			 	System.out.println("Enter the runs scored");
			 	obj.runs = input.nextLong();
			 	
			 	obj.displayInningsDetails();
			 	
			    input.close();
			    
		}

}
