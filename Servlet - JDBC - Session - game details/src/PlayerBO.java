import java.sql.SQLException;
import java.util.ArrayList;

public class PlayerBO {
    public ArrayList<Player> obtainAllPlayers(int id) throws ClassNotFoundException, SQLException{
        //fill the code
    	return new PlayerDAO().obtainAllPlayers(id);
    }

	
	
    
}

