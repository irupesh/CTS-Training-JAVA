
public class Match {
	String teamOne;
	String teamTwo;
	String venue;
	String matchDate;
	
	public Match(String teamOne, String teamTwo, String venue, String matchDate) {
		super();
		this.teamOne = teamOne;
		this.teamTwo = teamTwo;
		this.venue = venue;
		this.matchDate = matchDate;
	}

	public String getTeamOne() {
		return teamOne;
	}

	public void setTeamOne(String teamOne) {
		this.teamOne = teamOne;
	}

	public String getTeamTwo() {
		return teamTwo;
	}

	public void setTeamTwo(String teamTwo) {
		this.teamTwo = teamTwo;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public String getMatchDate() {
		return matchDate;
	}

	public void setMatchDate(String matchDate) {
		this.matchDate = matchDate;
	}
	
	void displayMatch(Match M, Integer i){
		System.out.println("Match "+i);
		 System.out.println("TeamOne : "+teamOne);
		 System.out.println("TeamTwo : "+teamTwo);
		 System.out.println("Venue : "+venue);
		 System.out.println("MatchDate : "+matchDate);
	}
	
}
