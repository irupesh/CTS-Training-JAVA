import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of players:");
		int noMatches = input.nextInt();
		ArrayList<Player> players = new ArrayList<Player>(noMatches);
	
		for(int i=0;i<noMatches;i++){
			input.nextLine();
			System.out.println("Enter player "+(i+1)+" detail");
			System.out.println("Enter Name");
			String name = input.nextLine();
			System.out.println("Enter Skill");
			String skill = input.nextLine();
			System.out.println("Enter Cap Number");
			Long capNumber = input.nextLong();

			Player obj = new Player(name, skill, capNumber);
			players.add(obj);
		}
		input.close();
		
		System.out.println("Player list after sorting by cap number in descending order");
		Collections.sort(players);
		
		Iterator<Player> iterator=players.iterator();  
		while(iterator.hasNext()){  
		Player info=(Player)iterator.next();  
		System.out.println(info.getPlayerName()+"-"+info.getCapNumber());
		}  
	}
}
