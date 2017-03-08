package team;



import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TeamBO {
    public List<Team> obtainAllTeams() throws ClassNotFoundException, SQLException{
    	
    	TeamDAO tdd=new TeamDAO();
    	return tdd.obtainAllTeams();
          // fill  the code
    }
	public Integer deleteTeamById(Integer id) throws ClassNotFoundException, SQLException {
	   // fill  the code
		TeamDAO td=new TeamDAO();
		return td.deleteTeamById(id);
		
	}


		
	

	
    
}

