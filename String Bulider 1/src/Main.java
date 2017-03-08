import java.util.Scanner;

class UserMainCode {
	
   static void display(String fname,String lname){
	   
	   String temp = fname.substring(0, 1);
	   StringBuffer result=new StringBuffer(fname.toLowerCase()); 
	   result.replace(0, 1, temp.toUpperCase());
	   result.append(" ");
	   result.append(lname.toUpperCase());
	   System.out.println(result);
   }
}

public class Main {	
	 public static void main(String args[]){
			String fname,lname;
			
			 	Scanner input = new Scanner(System.in);
			 	fname = input.nextLine();
			 	
			 	lname = input.nextLine();
			 	
			 	UserMainCode.display(fname, lname);
			
		}
}