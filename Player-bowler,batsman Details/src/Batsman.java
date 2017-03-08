
public class Batsman extends Player {
	private long noOfRuns;

	public Batsman(String name, String teamName, Long noOfMatches, long noOfRuns) {
		super(name, teamName, noOfMatches);
		this.noOfRuns = noOfRuns;
	}
	
    void displayDetails(){
    	System.out.println("Bowler : "+name);
    	System.out.println("Team : "+teamName);
    	System.out.println("Number of matches : "+noOfMatches);
    	System.out.println("Number of runs scored : "+noOfRuns);
		
	}
}
