



public class Team {
	
	Long teamId;
	String teamName;
	
	public Team()
	{}
	
	public Team(Long teamId,String teamName)
	{
		this.teamId=teamId;
		this.teamName=teamName;		
	}
	
	public String getTeamName()
	{
		return teamName;
	}
	public void setTeamName(String teamName)
	{
		this.teamName=teamName;
	}


	public void setTeamId(Long teamId)
	{
		this.teamId=teamId;
	}
	public Long getTeamId()
	{
		return teamId;
	}





}

