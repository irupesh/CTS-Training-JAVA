

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;



public class GameDAO {

	

public List<Game> getAllGameDetails() throws ClassNotFoundException, SQLException {

       List<Game>Al=new ArrayList();
       Game game=null;
      
             
          ResourceBundle rb= ResourceBundle.getBundle("mysql");
          
          String url=rb.getString("db.url");
          String user=rb.getString("db.username");
          String pass=rb.getString("db.password");
          Class.forName("com.mysql.jdbc.Driver");
          Connection con = DriverManager.getConnection(url,user,pass);
       
          //fill your code
          List<Game> games = new ArrayList<Game>();
          VenueDAO vdao = new VenueDAO(); 
          
          String selectSQL = "SELECT GAME_DATE, VENUE_ID from game";
          PreparedStatement preparedStatement = con.prepareStatement(selectSQL);
          ResultSet rs = preparedStatement.executeQuery();
          while (rs.next()) {
        	 Venue venue = vdao.getVenueByID((long)rs.getInt("VENUE_ID")) ;
        	 Game game1 = new Game(rs.getString("GAME_DATE"), venue);
        	 games.add(game1);
          }
          return games;
}

  
  public void updateVenueDetails(Date gameDate,String venue) throws ClassNotFoundException, SQLException, ParseException {
    
	  ResourceBundle rb= ResourceBundle.getBundle("mysql");
      
      String url=rb.getString("db.url");
      String user=rb.getString("db.username");
      String pass=rb.getString("db.password");
      Class.forName("com.mysql.jdbc.Driver");
      Connection con = DriverManager.getConnection(url,user,pass);
      VenueDAO venueIns=new VenueDAO();
      Long venueId=venueIns.getVenueByName(venue).getVenueId();
      
     //fill your code
      VenueDAO vdao = new VenueDAO(); 
      DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
      String date = df.format(gameDate);
      
      
      Venue tvenue = vdao.getVenueByName(venue);
      String selectSQL = "UPDATE game set venue_id =?  WHERE GAME_DATE =?";
      PreparedStatement preparedStatement = con.prepareStatement(selectSQL);
      preparedStatement.setInt(1,tvenue.getVenueId().intValue());
      preparedStatement.setString(2,date);
      preparedStatement.execute();  
  }
  
  public static void displayGame(List<Game> gameList){
      System.out.format("%-15s %-30s\n","Game Date","Venue"); 

     //fill your code
      for(Game game : gameList){
    	  System.out.format("%-15s %-30s\n",game.getGameDate(),game.getVenue().getVenueName());  
      }

  }
	
	
}
