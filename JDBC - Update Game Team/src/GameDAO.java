


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
          TeamDAO tdao = new TeamDAO(); 
          
          String selectSQL = "SELECT GAME_DATE, TEAM_ID_1,TEAM_ID_2 FROM game";
          PreparedStatement preparedStatement = con.prepareStatement(selectSQL);
          ResultSet rs = preparedStatement.executeQuery();
          while (rs.next()) {
        	 Team team1 = tdao.getTeamByID((long)rs.getInt("TEAM_ID_1")) ;
        	 Team team2 = tdao.getTeamByID((long)rs.getInt("TEAM_ID_2")) ;
        	  game = new Game(rs.getString("GAME_DATE"), team1, team2);
        	 games.add(game);
          }
          return games;
}
  
  public void updateTeamDetails(Date gameDate,String team1,String team2) throws ClassNotFoundException, SQLException, ParseException {
    
	  ResourceBundle rb= ResourceBundle.getBundle("mysql");
      
      String url=rb.getString("db.url");
      String user=rb.getString("db.username");
      String pass=rb.getString("db.password");
      Class.forName("com.mysql.jdbc.Driver");
      Connection con = DriverManager.getConnection(url,user,pass);

        //fill your code
      DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
      String date = df.format(gameDate);
      TeamDAO tdao = new TeamDAO();
      Team team_1 = tdao.getTeamByName(team1);
      Team team_2 = tdao.getTeamByName(team2);
      
      String selectSQL = "UPDATE game set team_id_1 =? , team_id_2 = ?  WHERE GAME_DATE =?";
      PreparedStatement preparedStatement = con.prepareStatement(selectSQL);
      preparedStatement.setInt(1,team_1.getTeamId().intValue());
      preparedStatement.setInt(2,team_2.getTeamId().intValue());
      preparedStatement.setString(3,date);
      preparedStatement.execute();  
      
  }
  public static void displayGame(List<Game> gameList){
      System.out.format("%-15s %-30s %-30s\n","Game Date","Team 1","Team 2"); 

      //fill your code
      for(Game game : gameList){
    	  System.out.format("%-15s %-30s %-30s\n",game.getGameDate(),game.getTeam1().getTeamName(),game.getTeam2().getTeamName());  
      }
      
      }
  }
	
	
