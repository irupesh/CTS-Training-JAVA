import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		
		int count = 1;
		Scanner input = new Scanner(System.in);
		System.out.println("Please provide the number of  players");
		int noMatches = input.nextInt();
		ArrayList<Ranking> team = new ArrayList<Ranking>(noMatches);
		
		for(int i=0;i<noMatches;i++){
			input.nextLine();
			System.out.println("Enter the name of the player "+(i+1));
			String name = input.nextLine();
			System.out.println("Enter the score of the player "+(i+1));
			Long runs = input.nextLong();
			Ranking obj = new Ranking(name, runs);
			team.add(obj);
		}
		input.close();
		
		System.out.println("Player Details by Score(High to Low)");
		Collections.sort(team);
		
		Iterator<Ranking> iterator=team.iterator();  
		while(iterator.hasNext()){  
		Ranking info=(Ranking)iterator.next();  
		System.out.println((count++)+" "+info.getName()+" "+info.getScore());  
		}  
	}

}
