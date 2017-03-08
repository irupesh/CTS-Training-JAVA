import java.sql.SQLException;
import java.util.List;

public class TeamBO {

	public List<Team> obtainAllTeams() throws ClassNotFoundException, SQLException{

		//fill the code
        TeamDAO tdao = new TeamDAO();
        return tdao.obtainAllTeams();
    }

	public int deleteTeamById(int id) throws ClassNotFoundException, SQLException
	{
		return new TeamDAO().deleteTeamById(id);
	}
}
