

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

      System.out.println("Enter the game date:");
      gameDate = sdf.parse(inp.readLine());
     
      GameDAO gameDAO = new GameDAO();
      
  

     //fill your code
      List<Game> games =gameDAO.listOrders(gameDate);
      
      for(Game game :games){
      	System.out.println(game.getTeam1().getTeamName() + " Vs "+ game.getTeam2().getTeamName());
      } 

  }

}

