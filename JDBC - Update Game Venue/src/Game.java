

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;


public class Game{
	
	private String gameDate;
	private Venue venue;


      
      public Game()
      {
          
      }
      public Game(String gameDate,Venue venue)
      {
          this.gameDate = gameDate;
          this.venue= venue;
         
      }

	public String getGameDate() {
		return gameDate;
	}
	public void setGameDate(String gameDate) {
		this.gameDate = gameDate;
	}
	public Venue getVenue() {
		return venue;
	}
	public void setVenue(Venue venue) {
		this.venue= venue;
	}

	
}

	


