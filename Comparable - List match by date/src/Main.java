import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
 public static void main(String args[]) throws ParseException {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of matches");
		int noMatches = input.nextInt();
		ArrayList<Match> match = new ArrayList<Match>(noMatches);
		DateFormat df = new SimpleDateFormat("MM-dd-yyyy"); 
		
		 input.nextLine();
		for(int i=0;i<noMatches;i++){
			
			System.out.println("Enter match date in (MM-dd-yyyy)");
			String tMatchDate = input.nextLine();
			Date matchDate = df.parse(tMatchDate);
			
			System.out.println("Enter Team 1");
			String team1 = input.nextLine();
			
			System.out.println("Enter Team 2");
			String team2 = input.nextLine();
			
			Match obj = new Match(matchDate, team1, team2);
			match.add(obj);
		}
		input.close();
		
		System.out.println("Match Details");
		Collections.sort(match);
		
		Iterator<Match> iterator=match.iterator();  
		while(iterator.hasNext()){  
		Match info=(Match)iterator.next();  
		String date = df.format(info.getMatchDate());
		System.out.println("Team 1 "+info.getTeamOne());
		System.out.println("Team 2 "+info.getTeamTwo());
		System.out.println("Match held on "+date);  
		}  
	}
}
