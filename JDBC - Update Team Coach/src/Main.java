
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.List;

public class Main {

 
  public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
      Team team = new Team();
      TeamDAO teamDAO = new TeamDAO();
      System.out.println("Team List");
      List<Team> teamList = teamDAO.getAllTeams();
      teamDAO.displayTeams(teamList);
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter the teamname you want update");
      String name = br.readLine();
      System.out.println("Enter the new coachname you want update");
      String coach = br.readLine();
      teamDAO.updateTeamDetails(name,coach);
      System.out.println("Updated team list");
 

       //fill your code
      teamList  = teamDAO.getAllTeams();
      teamDAO.displayTeams(teamList);

  }
  

  
}
