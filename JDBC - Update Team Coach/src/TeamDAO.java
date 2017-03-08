

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;


public class TeamDAO {


public List<Team> getAllTeams() throws ClassNotFoundException, SQLException {
      
       List<Team>Al=new ArrayList();
       Team team=null;
      
          ResourceBundle rb= ResourceBundle.getBundle("mysql");
          
          String url=rb.getString("db.url");
          String user=rb.getString("db.username");
          String pass=rb.getString("db.password");
          Class.forName("com.mysql.jdbc.Driver");
          Connection con = DriverManager.getConnection(url,user,pass);

          //fill your code
          List<Team> teams = new ArrayList<Team>();
          
          String selectSQL = "SELECT name,coach FROM team";
          PreparedStatement preparedStatement = con.prepareStatement(selectSQL);
          ResultSet rs = preparedStatement.executeQuery();
          while (rs.next()) {
        	 team = new Team(rs.getString("name"), rs.getString("coach"));
        	 teams.add(team);
          }
          return teams;
}
    
  
  
  public void updateTeamDetails(String name,String coach) throws ClassNotFoundException, SQLException {
    
	  ResourceBundle rb= ResourceBundle.getBundle("mysql");
      
      String url=rb.getString("db.url");
      String user=rb.getString("db.username");
      String pass=rb.getString("db.password");
      Class.forName("com.mysql.jdbc.Driver");
      Connection con = DriverManager.getConnection(url,user,pass);
      
        
      //fill your code
      String selectSQL = "UPDATE team set coach =? where name =?";
      PreparedStatement preparedStatement = con.prepareStatement(selectSQL);
      preparedStatement.setString(1, coach);
      preparedStatement.setString(2, name);
      preparedStatement.execute();
      
  }
  
  public static void displayTeams(List<Team> teamList){
      System.out.format("%-30s %-15s\n","Name","Coach"); 
    
       //fill your code
        for(Team team : teamList){
        	System.out.format("%-30s %-15s\n",team.getTeamName(),team.getCoachName());
        }
  }
  
}
