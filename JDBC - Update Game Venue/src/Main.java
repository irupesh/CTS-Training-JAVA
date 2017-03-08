


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;



public class Main {

	 
	  public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException, ParseException {
	      Game team = new Game();
	      GameDAO gameDAO = new GameDAO();
	      System.out.println("Game List");
	      List<Game> gameList = gameDAO.getAllGameDetails();
	      gameDAO.displayGame(gameList);
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	     
	      SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	      Date gameDate;

	      System.out.println("Enter the game date:");
	      gameDate = sdf.parse(br.readLine());
	     
	      System.out.println("Enter the venue to be updated");
	      String venue= br.readLine();
	      gameDAO.updateVenueDetails(gameDate,venue);
	      System.out.println("Updated game list");
	     


              //fill your code
	       gameList = gameDAO.getAllGameDetails();
	      gameDAO.displayGame(gameList);

	  }
	  

	  
	}
