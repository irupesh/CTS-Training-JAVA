import java.util.ArrayList;
import java.util.List;


public class MatchBO {

	public List<Match> obtainAllMatches() {

	        List<Match> userList = new ArrayList<Match>();
	        Match matchIns = new Match();
	        matchIns = new Match("Gujarat Lions","Royal Challengers","158","159/9");
	        userList.add(matchIns);
	        matchIns = new Match("Sunrisers Hyderabad","Kolkata Knight Riders","168/8","140/8");
	        userList.add(matchIns);
	        matchIns = new Match("Gujarat Lions","Sunrisers Hyderabad","162/7","163/6");
	        userList.add(matchIns);
	        matchIns = new Match("Royal Challengers","Sunrisers Hyderabad","200/7","208/7");
	        userList.add(matchIns);
	        return userList;
	}
	}


