import java.sql.SQLException;
import java.util.List;

public class TeamBO {
	public Team getTeamByName(String name) throws ClassNotFoundException, SQLException {
		
		//fill the code
		return new TeamDAO().getTeamByName(name);
		
	}

	public List<Team> getAllTeams() throws ClassNotFoundException, SQLException {
		//fill the code
		return new TeamDAO().getAllTeams();
	}

	
}
