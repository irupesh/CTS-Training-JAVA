import java.util.Scanner;

public class Main {

	public static void main(String args[]){
		 
		 Team obj = new Team();

			
			 	Scanner input = new Scanner(System.in);
			 	
			 	System.out.println("Enter the team name");
			 	obj.setName(input.nextLine());
			 	
			 	System.out.println("Enter the coach name");
			 	obj.setCoach(input.nextLine());
			 	
			 	System.out.println("Enter the location name");
			 	obj.setLocation(input.nextLine()); 
			 	
			 	System.out.println("Enter the players name");
			 	obj.setPlayers(input.nextLine());
			 	
			 	System.out.println("Enter the captain name");
			 	obj.setCaptain(input.nextLine());
			 	
			 	obj.displayTeamDetails();
			 	input.close();
			
		}
}
