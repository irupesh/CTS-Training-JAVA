import java.util.HashMap;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		
		HashMap<String,Player> players = new HashMap<String,Player>();
		Scanner input = new Scanner(System.in);
		String choice;
		
		do{
		System.out.println("Enter the player name");
		String name = input.nextLine();
		System.out.println("Enter wickets - seperated by \"|\" symbol.");
		String wickets = input.nextLine();
		
        String[] wicket = wickets.trim().split("\\|");
        
		Player obj = new Player(name, wicket.length);
		players.put(name,obj);
		System.out.println("Do you want to add another player (yes/no)");
		choice = input.nextLine();
		}while(choice.equals("yes"));
		
		do{
			System.out.println("Enter the player name to search");
			String name = input.nextLine();
			
			if(players.containsKey(name)){
				Player obj = players.get(name);
				System.out.println("Player name : "+obj.getBowlerName());
				System.out.println("Wicket Count : "+obj.wicketCount);
			}else
			System.out.println("No player found with the name "+name);
			System.out.println("Do you want to search another player (yes/no)");
			choice = input.nextLine();
			}while(choice.equals("yes"));
		input.close();
	}

}
