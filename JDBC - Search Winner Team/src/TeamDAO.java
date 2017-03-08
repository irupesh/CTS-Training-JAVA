

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;


public class TeamDAO {
  
  
    public Team getTeamByID(Long id) throws ClassNotFoundException, SQLException {
      ResourceBundle rb= ResourceBundle.getBundle("mysql");
      
      String url=rb.getString("db.url");
      String user=rb.getString("db.username");
      String pass=rb.getString("db.password");
      Class.forName("com.mysql.jdbc.Driver");
      Connection con = DriverManager.getConnection(url,user,pass);
   
        //fill your code
      String selectSQL = "SELECT ID, NAME FROM team WHERE ID = ?";
      PreparedStatement preparedStatement = con.prepareStatement(selectSQL);
      preparedStatement.setInt(1, id.intValue());
      ResultSet rs = preparedStatement.executeQuery();
      Team team = null;
      while (rs.next()) {
    	 team = new Team((long)rs.getInt("ID"), rs.getString("NAME"));
      }
      return team;

  }
}
