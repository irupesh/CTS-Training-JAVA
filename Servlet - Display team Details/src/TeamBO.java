import java.sql.SQLException;


public class TeamBO {
	public Team getTeamByName(String name) throws ClassNotFoundException, SQLException {
		// fill the code
		TeamDAO td=new TeamDAO();
		return td.getTeamByName(name);
		
	}

}
