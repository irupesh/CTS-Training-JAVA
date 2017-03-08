

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;


public class Game{
private Date gameDate;
private Venue venue;

      public Game ()
      {

      }
      public Game(Date gameDate,Venue venue)
      {
          this.gameDate = gameDate;
          this.venue= venue;
      }

public Date getGameDate() {
return gameDate;
}
public void setGameDate(Date gameDate) {
this.gameDate = gameDate;
}
public Venue getVenue() {
return venue;
}
public void setVenue(Venue venue) {
this.venue= venue;
}
}
