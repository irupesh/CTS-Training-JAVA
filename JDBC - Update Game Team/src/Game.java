


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;


public class Game{
	
	private String gameDate;
	private Team team1;
	private Team team2;

      
      public Game()
      {
          
      }
      public Game(String gameDate,Team team1,Team team2)
      {
          this.gameDate = gameDate;
          this.team1=team1;
          this.team2=team2;         
      }

	public String getGameDate() {
		return gameDate;
	}
	public void setGameDate(String gameDate) {
		this.gameDate = gameDate;
	}
	
   public Team getTeam1()
   {
	   return team1;
   }
	
   public void setTeam1(Team team1)
   {
	   this.team1=team1;
   }
   public Team getTeam2()
   {
	   return team2;
   }
	
   public void setTeam2(Team team2)
   {
	   this.team2=team2;
   }
}

	


