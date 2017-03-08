

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;


public class Game{
	
	private Date gameDate;
	private OutCome outcome;


      
      public Game()
      {
          
      }
      public Game(Date gameDate,OutCome outcome)
      {
          this.gameDate = gameDate;
          this.outcome= outcome;
         
      }

	public Date getGameDate() {
		return gameDate;
	}
	public void setGameDate(Date gameDate) {
		this.gameDate = gameDate;
	}
	public OutCome getOutcome() {
		return outcome;
	}
	public void setOutcome(OutCome outcome) {
		this.outcome= outcome;
	}

	
}

	


