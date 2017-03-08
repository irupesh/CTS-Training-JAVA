import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of teams:");
		int noMatches = input.nextInt();
		ArrayList<Team> team = new ArrayList<Team>(noMatches);
		
		for(int i=0;i<noMatches;i++){
			input.nextLine();
			System.out.println("Enter team "+(i+1)+" detail");
			System.out.println("Enter Name");
			String name = input.nextLine();
			System.out.println("Enter number of matches");
			long matches = input.nextLong();
			Team obj = new Team(name, matches);
			team.add(obj);
		}
		
		System.out.println("Team list after sort by number of matches");
		Collections.sort(team,new TeamComparator());
		
		Iterator<Team> iterator=team.iterator();  
		while(iterator.hasNext()){  
		Team t=(Team)iterator.next();  
		System.out.println(t.getName()+"-"+t.getNumberOfMatches());  
		}  
	
		
	}

}
