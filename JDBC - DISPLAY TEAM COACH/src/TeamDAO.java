

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;


public class TeamDAO {

	
	List<Team> listTeams(String teamName) throws SQLException, ClassNotFoundException
    {

            Connection con = null;

            ResourceBundle rb = ResourceBundle.getBundle("mysql");
            String url = rb.getString("db.url");
            String user = rb.getString("db.username");
            String pass = rb.getString("db.password");

                    try {
                        Class.forName("com.mysql.jdbc.Driver");
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(TeamDAO.class.getName()).log(Level.SEVERE, null, ex);
                    }
            con = DriverManager.getConnection(url,user,pass);
        
   //fill your code
            List<Team> teams = new ArrayList<Team>();
            String selectSQL = "SELECT NAME, COACH FROM team WHERE NAME = ?";
	          PreparedStatement preparedStatement = con.prepareStatement(selectSQL);
	          preparedStatement.setString(1, teamName);
	          ResultSet rs = preparedStatement.executeQuery();
	          Team team = null;
	          while (rs.next()) {
	        	 team = new Team(rs.getString("NAME"), rs.getString("COACH"));
	        	 teams.add(team);
	          }
	          return teams;


 }
}
