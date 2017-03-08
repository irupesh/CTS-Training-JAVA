import java.util.Scanner;

public class Main {

   static void showMenu(){
		System.out.println("Menu");
		System.out.println("1.Update Player Name");
		System.out.println("2.Update Country Name");
		System.out.println("3.Update Skill");
		System.out.println("4.All informations Correct/Exit");
		System.out.println("Type 1 or 2 or 3 or 4");	
	}
	
	public static void main(String args[]){
		
		 Player obj = new Player();

			
		 	Scanner input = new Scanner(System.in);
		 	
		 	System.out.println("Enter the player name");
		 	obj.setName(input.nextLine());
		 	System.out.println("Enter the country name");
		 	obj.setCountry(input.nextLine());
		 	System.out.println("Enter the skill");
		 	obj.setSkill(input.nextLine());
		 	obj.display();
		 	System.out.println("Verify and Update Player Details");
		 	
		 	showMenu();
		 	int option = input.nextInt();
		 	input.close();
		 	while(true){
		 		switch(option){
		 		case 1: System.out.println("The current player name is "+obj.getName());
		 		        System.out.println("Enter the player name");
		 		        input = new Scanner(System.in);
		 		        obj.setName(input.nextLine());
		 		        showMenu();
		 		        option = input.nextInt();
		 		        input.close();
		 		        break;
		 		case 2: System.out.println("The current country name is "+obj.getCountry());
 		        		System.out.println("Enter the country name");
 		        		input = new Scanner(System.in);
 		        		obj.setCountry(input.nextLine());
 		        		showMenu();
 		        		option = input.nextInt();
 		        		input.close();
 		        		break;
		 		case 3: System.out.println("The current skill is "+obj.getSkill());
	        			System.out.println("Enter the skill");
	        			input = new Scanner(System.in);
	        			obj.setSkill(input.nextLine());
	        			showMenu();
	        			option = input.nextInt();
	        			input.close();
	        			break;
		 		case 4: obj.display();
		 				System.exit(0);
		 				break;
		 		default: showMenu();        
		 		}
		 	}
		 
		 	 	
	}
}
