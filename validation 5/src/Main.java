import java.util.Scanner;

class UserMainCode {
	
   static boolean validateTeam(String name){
	   boolean valid = true;
	   
	   if(name.charAt(0)!='*')
		   valid = false;
	   
	  
	  if((Character.isDigit(name.charAt(name.length()-1)))==false || (Character.isDigit(name.charAt(name.length()-2)))==false)
		   valid = false;


	   
	   if(valid){
	   System.out.println("Valid");
	   return true;
	   }
	   System.out.println("Invalid");
	   return false;
   }
}

public class Main {	
	 public static void main(String args[]){
			String name;
			
			 	Scanner input = new Scanner(System.in);
			 	name = input.nextLine();	
			 	UserMainCode.validateTeam(name);
			
		}
}