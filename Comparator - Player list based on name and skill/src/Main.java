import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please provide the number of players to be registered");
		int noMatches = input.nextInt();
		ArrayList<Player> team = new ArrayList<Player>(noMatches);
		
		for(int i=0;i<noMatches;i++){
			input.nextLine();
			System.out.println("Please enter player name");
			String name = input.nextLine();
			System.out.println("Please select the skill of the player\n1.All Rounder\n2.Batsman\n3.Bowler");
			int nSkill = input.nextInt();
			String skill ;
			if(nSkill == 1)
				 skill = "All Rounder";
			else if(nSkill==2)
				skill = "Batsman";
			else
				skill = "Bowler";
			
			Player obj = new Player(name, skill);
			team.add(obj);
		}
		
		
		System.out.println("Player Details");
		Collections.sort(team,new PlayerComparator());
		
		Iterator<Player> iterator=team.iterator();  
		while(iterator.hasNext()){  
		Player info=(Player)iterator.next();  
		System.out.println("Player : "+info.getName()+" Skill  : "+info.getSkill());  
		}  
	
		
	}

}
