

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;


public class OutComeDAO {
  
  
    public OutCome getOutComeByID(Long id) throws ClassNotFoundException, SQLException {
      ResourceBundle rb= ResourceBundle.getBundle("mysql");
      
      String url=rb.getString("db.url");
      String user=rb.getString("db.username");
      String pass=rb.getString("db.password");
      Class.forName("com.mysql.jdbc.Driver");
      Connection con = DriverManager.getConnection(url,user,pass);
   
  
       //fill your code
      String selectSQL = "SELECT id,winner_team_id FROM outcome WHERE ID = ?";
      PreparedStatement preparedStatement = con.prepareStatement(selectSQL);
      preparedStatement.setInt(1, id.intValue());
      ResultSet rs = preparedStatement.executeQuery();
      Team team = null;
      OutCome outcome = null;
      TeamDAO tdao = new TeamDAO();
      while (rs.next()) {
    	  
    	  team = tdao.getTeamByID((long)rs.getInt("winner_team_id"));
    	  outcome = new OutCome((long)rs.getInt("ID"),team);
    	 
      }
      return outcome;
  }
}
