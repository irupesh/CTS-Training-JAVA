import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class PlayerBO {

	public List<Player> getPlayerDetails(int id,int sid) throws ClassNotFoundException, SQLException {
		//fill the code
	   PlayerDAO pd=new PlayerDAO();
	   List<Player> ls=new ArrayList<Player>();
	   ls=pd.getPlayerDetails(id, sid);
	   return ls;
	
	}
	
	
}
