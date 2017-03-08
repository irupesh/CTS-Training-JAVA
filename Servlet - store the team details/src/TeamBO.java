import java.sql.Connection;
import java.sql.SQLException;

public class TeamBO {

	public void createCity(City city)throws ClassNotFoundException,SQLException
	{
		TeamDAO te=new TeamDAO();
		te.createCity(city);
		
		
	}
		
		public boolean createTeam(Team team) throws ClassNotFoundException, SQLException
		{
			TeamDAO te=new TeamDAO();
			return te.createTeam(team);
			
		}
		public int getPlayerByIDPlayerName(String name) throws ClassNotFoundException, SQLException
		{
			TeamDAO te=new TeamDAO();
			return te.getPlayerIdByPlayerName(name);
		}
}
