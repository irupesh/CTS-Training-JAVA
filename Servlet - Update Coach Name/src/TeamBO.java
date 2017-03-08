import java.sql.SQLException;


public class TeamBO {

	public Team getTeamById(int id) throws ClassNotFoundException, SQLException {
		// fill the code
		TeamDAO teamdao=new TeamDAO();
		return teamdao.getTeamById(id);
	}

	public int updateCoachName(Integer id, String coach) throws ClassNotFoundException, SQLException {
		// fill the code
		TeamDAO teamdao=new TeamDAO();
		return teamdao.updateCoachName(id, coach);
	}

}
