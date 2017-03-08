import java.util.Scanner;

public class Main {
	 public static void main(String args[]){
		 
		 Player obj = new Player();

			
			 	Scanner input = new Scanner(System.in);
			 	
			 	System.out.println("Enter the player name");
			 	obj.name = input.nextLine();
			 	
			 	System.out.println("Enter the country name");
			 	obj.country = input.nextLine();
			 	
			 	System.out.println("Enter the skill");
			 	obj.skill = input.nextLine();
			 	
			 	System.out.println("Player Details :");
			 	System.out.println("Player Name : "+obj.name);
			 	System.out.println("Country Name : "+obj.country);
			 	System.out.println("Skill : "+obj.skill);
			
		}

}
