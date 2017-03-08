


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.text.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws IOException, ParseException, SQLException, ClassNotFoundException {

      BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
      SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
      Date gameDate;

      System.out.println("Enter the StartDate:");
      gameDate = sdf.parse(inp.readLine());
     
      GameDAO gameDAO = new GameDAO();
      
      List<Game> gameList = gameDAO.listGame(gameDate);
      System.out.println("Winner Team");
  
       //fill your code
      
      for(Game game :gameList){
      	System.out.println(game.getOutcome().getWinnerTeam().getTeamName());
      } 
     

  }

}

