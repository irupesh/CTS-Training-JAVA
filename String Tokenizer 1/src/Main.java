import java.util.Scanner;

class UserMainCode {
	
   static void display(String info){
	   
	   String[] details = info.split(",");
	   
	   for(String detail : details)
	   System.out.println(detail);
   }
}

public class Main {	
	 public static void main(String args[]){
			String info;
			
			 	Scanner input = new Scanner(System.in);
			 	info = input.nextLine();
			 	
			 	UserMainCode.display(info);
			
		}
}