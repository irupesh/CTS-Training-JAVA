package skillDetails;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PlayerDAO {

	public List<Player> getSkillDetails() throws ClassNotFoundException, SQLException {
		// fill the code
		List<Player>players=new ArrayList<>();
		Connection con=DBConnection.getConnection();
		Statement stmnt=con.createStatement();
		ResultSet rs=stmnt.executeQuery("select id,name,country,skill_id from player");
		while(rs.next()){
			players.add(new Player(rs.getInt(1),rs.getString(2),rs.getString(3) ,new SkillBO().getSkillById(rs.getInt(4))));
		}
		return players;
	}

}
