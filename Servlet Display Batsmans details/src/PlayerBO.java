import java.sql.SQLException;
import java.util.List;


public class PlayerBO {

	public List<Player> obtainAllBatsMan() throws ClassNotFoundException, SQLException {
		PlayerDAO playerdao = new PlayerDAO();
		return playerdao.obtainAllBatsMan();
		
	}

}
