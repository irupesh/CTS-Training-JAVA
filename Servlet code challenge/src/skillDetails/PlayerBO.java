package skillDetails;

import java.sql.SQLException;
import java.util.List;

public class PlayerBO {
	public List <Player> getSkillDetails() throws ClassNotFoundException, SQLException{
		PlayerDAO playerdao = new PlayerDAO();
		return playerdao.getSkillDetails();
	}

}
