

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;


public class GameDAO {
  
  
      List<Game> listGame(Date gameDate) throws SQLException, ClassNotFoundException
      {

              Connection con = null;

              ResourceBundle rb = ResourceBundle.getBundle("mysql");
              String url = rb.getString("db.url");
              String user = rb.getString("db.username");
              String pass = rb.getString("db.password");

                      try {
                          Class.forName("com.mysql.jdbc.Driver");
                      } catch (ClassNotFoundException ex) {
                          Logger.getLogger(GameDAO.class.getName()).log(Level.SEVERE, null, ex);
                      }
              con = DriverManager.getConnection(url,user,pass);
          

       //fill your code
              List<Game> games = new ArrayList<Game>();
              TeamDAO tdao = new TeamDAO(); 
              DateFormat df = new SimpleDateFormat("YYYY-MM-DD");
              String date = df.format(gameDate);
              OutComeDAO outdao = new OutComeDAO();
              
              String selectSQL = "SELECT ID, OUTCOME_ID FROM game WHERE GAME_DATE =?";
	          PreparedStatement preparedStatement = con.prepareStatement(selectSQL);
	          preparedStatement.setString(1, date);
	          ResultSet rs = preparedStatement.executeQuery();
	          while (rs.next()) {
	        	  
	        	  OutCome outcome = outdao.getOutComeByID((long)rs.getInt("OUTCOME_ID"));
	        	 Game game = new Game(gameDate, outcome);
	        	 games.add(game);
	          }
	          return games;

      }
  }



