
public class OutCome {

	
    Long  outcomeId;
    Team  winnerTeam;
    
    
    public OutCome()
    {}
    
    public OutCome(Long outcomeId,Team  winnerTeam)
    {
      this.outcomeId=outcomeId;
      this.winnerTeam=winnerTeam;
    	
   }
    
    public Long getOutcomeId()
    {
    	return outcomeId;
    }
    public void setOutcomeId(Long  outcomeId)
    {
    	this.outcomeId=outcomeId;
    }
    
    
    public Team getWinnerTeam()
    {
    	return winnerTeam;
    }
    public void setWinnerTeam(Team winnerTeam)
    {
    	this.winnerTeam=winnerTeam;
    }
}
