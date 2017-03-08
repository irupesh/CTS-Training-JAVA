import java.util.Scanner;

class UserMainCode {
	
   static void display(String player,String team){
	   StringBuffer result=new StringBuffer(player);  
	   result.append("#"); 
	   result.append(team); 
	   System.out.println(result);
   }
}

public class Main {	
	 public static void main(String args[]){
			String player_name,player_team;
			
			 	Scanner input = new Scanner(System.in);
			 	
			 	System.out.println("Enter the player name");
			 	player_name = input.nextLine();
			 	
			 	System.out.println("Enter the team name");
			 	player_team = input.nextLine();
			 	
			 	UserMainCode.display(player_name, player_team);
			
		}
}
