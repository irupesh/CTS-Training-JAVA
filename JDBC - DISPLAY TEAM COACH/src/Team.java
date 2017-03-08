

public class Team {

	private String teamName;
	private String coach;
	
	public Team()
	{}
	
	public Team(String teamName,String coach)
	{
		this.teamName=teamName;
		this.coach=coach;		
	}
	
	public void setTeamName()
	{
		this.teamName=teamName;
	}
	
	public String getTeamName()
	{
		return teamName;
	}
	
	public void setCoach()
	{
		this.coach=coach;
	}
	
	public String getCoach()
	{
		return coach;
	}
}
