import java.util.Scanner;

class UserMainCode {
	
   static boolean validatePlayer(String fname, String lname){
	   boolean valid = true;
	   int count = 2; 
	   
	   if((Character.isLetter(fname.charAt(0)))==false || (Character.isLetter(fname.charAt(fname.length()-1)))==false)
		   valid = false;
	   
	   if((Character.isLetter(lname.charAt(0)))==false || (Character.isLetter(lname.charAt(lname.length()-1)))==false)
		   valid = false;
	   
	   for(char temp : fname.toCharArray()){
		   if(count%2==0){
			   if(!(Character.isLetter(temp))){
				   valid = false;
				   break;
			   }
		   }else{
			   if(temp != '*'){
				   valid = false;
				   break;
			   }
		   }
		   count++;
	   }
	   
	   count = 2;
	   
	   for(char temp : lname.toCharArray()){
		   if(count%2==0){
			   if(!(Character.isLetter(temp))){
				   valid = false;
				   break;
			   }
		   }else{
			   if(temp != '#'){
				   valid = false;
				   break;
			   }
		   }
		   count++;
	   }
	   
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
			 	String name_new = name.trim().replaceAll(" +", " ");	
			    String[] split_name = name_new.split("\\s+");
			 	UserMainCode.validatePlayer(split_name[0],split_name[1]);
			
		}
}