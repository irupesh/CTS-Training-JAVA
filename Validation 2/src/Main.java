import java.util.Scanner;

class UserMainCode {
	
   static boolean validateTeam(String team, String aise){
	   
	   String[] teams = {"RCB", "MI", "CSK", "SRH", "KXIP", "DD", "KKR", "RPSG", "GL"};
	   
	   for(String temp : teams){
		   if(team.equals(temp)==true){
			   System.out.println("Valid");
			   return true;
		   }
	   }
	   System.out.println("Invalid");
	   return false;
   }
}

public class Main {	
	 public static void main(String args[]){
			String team;
			
			 	Scanner input = new Scanner(System.in);
			 	team = input.nextLine();
			    String str = team.trim();	
			    String[] split_team = str.split("\\s+");
			 	UserMainCode.validateTeam(split_team[0],"");
			
		}
}