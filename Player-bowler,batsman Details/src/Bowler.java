

public class Bowler extends Player{
	private long noOfWickets;

	public Bowler(String name, String teamName, Long noOfMatches, long noOfWickets) {
		super(name, teamName, noOfMatches);
		this.noOfWickets = noOfWickets;
	}
	
    void displayDetails(){

    	System.out.println("Bowler : "+name);
    	System.out.println("Team : "+teamName);
    	System.out.println("Number of matches : "+noOfMatches);
    	System.out.println("Number of wickets taken : "+noOfWickets);
    	
	}
	

}
