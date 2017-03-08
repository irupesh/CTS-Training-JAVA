import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class GameDAO {

	public ArrayList<Game> listGames() throws ClassNotFoundException, SQLException, ParseException {
		Connection con = DBConnection.getConnection();

	     //fill the code
		ArrayList<Game> games = new ArrayList<Game>();
         TeamDAO tdao = new TeamDAO(); 
         VenueDAO vtao = new VenueDAO();
         String selectSQL = "SELECT GAME_DATE, TEAM_ID_1,TEAM_ID_2, VENUE_ID FROM game";
         PreparedStatement preparedStatement = con.prepareStatement(selectSQL);
         ResultSet rs = preparedStatement.executeQuery();
         while (rs.next()) {
       	 Team team1 = tdao.getTeamByID(rs.getInt("TEAM_ID_1")) ;
       	 Team team2 = tdao.getTeamByID(rs.getInt("TEAM_ID_2")) ;
       	 Venue venue = vtao.getVenueById(rs.getInt("VENUE_ID"));
       	DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
       	  Date date = format.parse(rs.getString("GAME_DATE"));
       	     Game game = new Game(date,team1,team2);
       	     games.add(game);
         }
         return games;
	}
	
	public Game viewGameDetails(String date, String teamA, String teamB) throws ClassNotFoundException, SQLException, ParseException{
		Connection con = DBConnection.getConnection();

	     //fill the code
        TeamDAO tdao = new TeamDAO(); 
        VenueDAO vtao = new VenueDAO();
        int id1 = new TeamBO().getTeamByName(teamA).getId();
        int id2 = new TeamBO().getTeamByName(teamB).getId();
        String selectSQL = "SELECT ID, GAME_DATE, TEAM_ID_1,TEAM_ID_2, VENUE_ID FROM game where GAME_DATE= ? and TEAM_ID_1= ? and TEAM_ID_2= ?";
        PreparedStatement preparedStatement = con.prepareStatement(selectSQL);
        preparedStatement.setString(1, date);
        preparedStatement.setInt(2, id1);
        preparedStatement.setInt(3, id2);
        ResultSet rs = preparedStatement.executeQuery();
        
        Game game =null;
        while (rs.next()) {
      	 Team team1 = tdao.getTeamByID(rs.getInt("TEAM_ID_1")) ;
      	 Team team2 = tdao.getTeamByID(rs.getInt("TEAM_ID_2")) ;
      	 Venue venue = vtao.getVenueById(rs.getInt("VENUE_ID"));
      	DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
      	  Date date1 = format.parse(rs.getString("GAME_DATE"));
      	     game = new Game(rs.getInt("ID"),date1,team1,team2,venue);
        }
        return game;
	}

}
