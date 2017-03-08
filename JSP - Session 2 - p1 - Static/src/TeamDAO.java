import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TeamDAO {

	
public List<Team> obtainAllTeams() throws ClassNotFoundException, SQLException {
    	
    	Statement statement = DBConnection.getConnection().createStatement();
    	
    	String sql = "select * from team order by name";
    	
    	ResultSet rs = statement.executeQuery(sql);
    	
    	List<Team> teams = new ArrayList<>();
    	int count =0;
    	while(rs.next()) {
    		
    		teams.add(new Team(rs.getInt(1),rs.getString(2),rs.getString(3)));
    		System.out.println(teams.get(count++).getName());
    	}
    	statement.close();
    	rs.close();
    	return teams;
    }
public int deleteTeamById(int id) throws ClassNotFoundException, SQLException
{
	PreparedStatement stmt = DBConnection.getConnection().prepareStatement("delete from team where id=?");
	stmt.setInt(1, id);
	return stmt.executeUpdate();
	
}
}
