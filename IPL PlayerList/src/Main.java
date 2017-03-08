import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static void printList(ArrayList<String> team){
		for(String player : team)
			System.out.println(player);
	}
	
	static void showMenu(){
		System.out.println("Menu\n1.Insert Players\n2.Delete Players");
	}
	
public static void main(String[] args) {
	
		String choice;
		int option,noPlayer;
		Scanner input = new Scanner(System.in);
		noPlayer =  input.nextInt();
		input.nextLine();
		ArrayList<String> team = new ArrayList<String>(noPlayer);
		
		for(int i=0;i<noPlayer;i++)
			team.add(input.nextLine());
		
		do{
			showMenu();
			option = input.nextInt();
			input.nextLine();
			if(option==1){
				team.add(input.nextLine());
				System.out.println("Player details after insertion");
				printList(team);
			}
			else if(option==2){
				team.remove(input.nextLine());
				System.out.println("Player details after deletion");
				printList(team);
			}else
				System.out.println("Invalid");
			System.out.println("Do you want to continue");
			choice = input.nextLine();		
		}while(choice.equals("Yes"));
	}

}
