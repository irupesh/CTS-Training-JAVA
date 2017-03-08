import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TeamDAO {

	public Team getTeamByName(String name) throws SQLException, ClassNotFoundException {
	//fill the code
		Connection con = DBConnection.getConnection();
         String selectSQL = "SELECT ID, NAME, COACH FROM team WHERE NAME = ?";
	          PreparedStatement preparedStatement = con.prepareStatement(selectSQL);
	          preparedStatement.setString(1, name);
	          ResultSet rs = preparedStatement.executeQuery();
	          rs.next();
	          return new Team(rs.getInt("ID"),rs.getString("NAME"), rs.getString("COACH"));
	}
	
	public Team getTeamByID(int id) throws SQLException, ClassNotFoundException {
		//fill the code
			Connection con = DBConnection.getConnection();
	         String selectSQL = "SELECT ID, NAME, COACH FROM team WHERE ID = ?";
		          PreparedStatement preparedStatement = con.prepareStatement(selectSQL);
		          preparedStatement.setInt(1, id);
		          ResultSet rs = preparedStatement.executeQuery();
		          rs.next();
		          return new Team(rs.getInt("ID"),rs.getString("NAME"), rs.getString("COACH"));
		}
	
	public List<Team> getAllTeams() throws SQLException, ClassNotFoundException{
		Connection con = DBConnection.getConnection();
		List<Team> teams = new ArrayList<Team>();
        String selectSQL = "SELECT ID, NAME, COACH FROM team";
          PreparedStatement preparedStatement = con.prepareStatement(selectSQL);
          ResultSet rs = preparedStatement.executeQuery();
          Team team = null;
          while (rs.next()) {
        	 team = new Team(rs.getInt("ID"),rs.getString("NAME"), rs.getString("COACH"));
        	 teams.add(team);
          }
          return teams;
	}
	
	

}
