import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PlayerDAO {

	public List<Player> getAllCaptain() throws ClassNotFoundException, SQLException {
		// fill the code
		Connection con=new DBConnection().getConnection();
		List<Player>al=new ArrayList<>();
		Statement s=con.createStatement();
		ResultSet rs=s.executeQuery("Select captain from team");
		while(rs.next())
		{
			Player p=new PlayerBO().getPlayerById(rs.getInt(1));
			al.add(p);
		}
		return al;
		
	}

	public Player getPlayerById(int id) throws ClassNotFoundException, SQLException {
		
		// fill the code
		Connection con=new DBConnection().getConnection();
		Statement s=con.createStatement();
		ResultSet rs=s.executeQuery("Select id,name,country,team_id from player where id="+id);
		if(rs.next()){
		return new Player(rs.getInt(1), rs.getString(2), rs.getString(3), new TeamBO().getTeamById(rs.getInt(4)));
		}
		return null;
		
}
}
