import java.util.Scanner;

public class Main {
	 public static void main(String args[]){
		 
		 Player obj = new Player();

			
			 	Scanner input = new Scanner(System.in);
			 	
			 	System.out.println("Enter the player details");
			 	String details = input.nextLine();
			 	
			 	String[] detail = details.split(",");
			 	
			 	obj.name = detail[0];
			 	obj.country = detail[1];
			 	obj.skill = detail[2];
			 	
			 	System.out.println("Player Details :");
			 	System.out.println("Player Name : "+obj.name);
			 	System.out.println("Country Name : "+obj.country);
			 	System.out.println("Skill : "+obj.skill);
			    input.close();
		}

}
