package team;
import java.sql.SQLException;
import java.util.List;

public class TeamBO {
    public List<Team> obtainAllTeams() throws ClassNotFoundException, SQLException{

		//fill the code
    	return new TeamDAO().obtainAllTeams();
       
    }

	public int createTeam(Team team) throws ClassNotFoundException, SQLException {
		  
		
		//fill the code
		return new TeamDAO().createTeam(team);
		
	}

	
    
}


