import java.text.SimpleDateFormat;
import java.util.Date;

public class Match {
	void displayMatchDetails(Date matchDate){
		
		SimpleDateFormat target = new SimpleDateFormat("MM-dd-yyyy");
		System.out.println("Match Date : "+target.format(matchDate));
		
	}
	void displayMatchDetails(String venue){
		String[] tvenue = venue.trim().split(",");
		System.out.println("Match Venue :");
		System.out.println("Stadium : "+tvenue[0]);
		System.out.println("City : "+tvenue[1]);
		
	}
	void displayMatchDetails(String winnerTeam,long runs){
		System.out.println("Match Outcome :");
		System.out.println(winnerTeam+" won by "+runs+" runs");
	}
	

}
