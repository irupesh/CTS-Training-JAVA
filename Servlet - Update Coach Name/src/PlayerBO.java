import java.sql.SQLException;
import java.util.List;


public class PlayerBO {

	public List<Player> getAllCaptain() throws ClassNotFoundException, SQLException {
		// fill the code
		PlayerDAO playerdao=new PlayerDAO();
		return playerdao.getAllCaptain();
	}

	public Player getPlayerById(int id) throws ClassNotFoundException, SQLException {
		// fill the code
		PlayerDAO playerdao=new PlayerDAO();
		return playerdao.getPlayerById(id);
	}

	
}
