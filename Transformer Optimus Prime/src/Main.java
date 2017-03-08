import java.util.Scanner;

class UserMainCode {
	
   static void findLocation(String commands){
	   int x=0,y=0;
	   
	   for(char command : commands.toCharArray()){
		   if(command == 'U')
			   y++;
		   else if(command == 'D')
			   y--;
		   else if(command == 'R')
			   x++;
		   else if(command == 'L')
			   x--;   
	   }
	   
	   System.out.println(x+" "+y);
   }
}

public class Main {	
	 public static void main(String args[]){
			String commands;
			
			 	Scanner input = new Scanner(System.in);
			 	input.nextInt();
			 	input.nextLine();
			    commands = input.nextLine();
			 	UserMainCode.findLocation(commands);
			
		}
}