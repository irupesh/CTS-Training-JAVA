import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;

public class GameBO {

	public ArrayList<Game> listGames() throws ClassNotFoundException, SQLException, ParseException {
		
	//fill the code
		return new GameDAO().listGames();
		
	}

	public Game viewGameDetails(String date, String teamA, String teamB) throws ClassNotFoundException, SQLException, ParseException {
		
		 	//fill the code
		return new GameDAO().viewGameDetails(date, teamA, teamB);	
	}
	
	

}
