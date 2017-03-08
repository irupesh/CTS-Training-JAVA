import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String choice;
		TreeMap<String , Wicket> info = new TreeMap<String,Wicket>();
		
		do{
			System.out.println("Enter the player name");
			String name = input.nextLine();
			System.out.println("Enter wickets - seperated by \"|\" symbol");
			String player_out = input.nextLine();
			System.out.println("Do you want to add another player (yes/no)");
			choice = input.nextLine();
			Bowler b1 = new Bowler(name);
			Wicket wicket = new Wicket(player_out, b1);
			info.put(name, wicket);
		}while(choice.equals("yes"));
		
		
		do{
			System.out.println("Enter the player name to search");
			String name = input.nextLine();
			
			if(info.containsKey(name)){
				Wicket wicket = info.get(name);
				System.out.println("Player Name : "+name);
				String[] wickets = wicket.getPlayerName().trim().split("\\|") ;
				System.out.println("Wickets :");
				for(String w : wickets)
					System.out.println(w);
			}else
				System.out.println("No player found with the name "+name);
			System.out.println("Do you want to search another player (yes/no)");
			choice = input.nextLine();
		}while(choice.equals("yes"));

	}

}
