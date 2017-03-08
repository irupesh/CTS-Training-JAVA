
public class Player implements IKabbadiPlayerStatistics {
	
	private String name;
	private String teamName;
	private int noOfMatches;
	private long totalRaidPoints;
	private long totalDefencePoints;
	

	public Player(String name, String teamName, int noOfMatches, long totalRaidPoints, long totalDefencePoints) {
		super();
		this.name = name;
		this.teamName = teamName;
		this.noOfMatches = noOfMatches;
		this.totalRaidPoints = totalRaidPoints;
		this.totalDefencePoints = totalDefencePoints;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public int getNoOfMatches() {
		return noOfMatches;
	}

	public void setNoOfMatches(int noOfMatches) {
		this.noOfMatches = noOfMatches;
	}

	public long getTotalRaidPoints() {
		return totalRaidPoints;
	}

	public void setTotalRaidPoints(long totalRaidPoints) {
		this.totalRaidPoints = totalRaidPoints;
	}

	public long getTotalDefencePoints() {
		return totalDefencePoints;
	}

	public void setTotalDefencePoints(long totalDefencePoints) {
		this.totalDefencePoints = totalDefencePoints;
	}

	@Override
	public void displayKabbadiPlayerDetails() {
		System.out.println("Player Details");
		System.out.println("Player name : "+name);
		System.out.println("Team name : "+teamName);
		System.out.println("No of matches : "+noOfMatches);
		System.out.println("Total raid points: "+totalRaidPoints);
		System.out.println("Total defence points: "+totalDefencePoints);		
	}
	

}
