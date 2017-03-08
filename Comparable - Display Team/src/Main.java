import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		int noPlayers = input.nextInt();
		ArrayList<Team> teams = new ArrayList<Team>(noPlayers);
		
		 input.nextLine();
		for(int i=0;i<noPlayers;i++){
			boolean found = false;
			String tTeam = input.nextLine();
			String[] detailTeam = tTeam.trim().split("\\|");
			
			for(Team team : teams){
				if(team.getName().equals(detailTeam[0])){
					found = true;
					team.addPlayer(detailTeam[1]);
					break;
				}
			}
			
			if(!found){
				Team obj = new Team(detailTeam[0]);
				obj.addPlayer(detailTeam[1]);
				teams.add(obj);
			}
		}
		input.close();
		
		Collections.sort(teams);
		
		
		System.out.println("Teams and Players in ascending order");
		
		Iterator<Team> iterator=teams.iterator();  
		while(iterator.hasNext()){  
			Team info=(Team)iterator.next();  
			System.out.println(info.getName());
			List<Player> players = info.getPlayerList();
			  for(Player p : players){
				  System.out.println("--"+p.getName());
			  }  
		}  
	}

}
