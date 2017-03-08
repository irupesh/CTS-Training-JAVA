


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.ResourceBundle;


public class TeamDAO {
  
  public void createTeam(Team team) throws ClassNotFoundException, SQLException {
       ResourceBundle rb= ResourceBundle.getBundle("mysql");
      
      String url=rb.getString("db.url");
      String username=rb.getString("db.username");
      String pass=rb.getString("db.password");
      Class.forName("com.mysql.jdbc.Driver");
      Connection con = DriverManager.getConnection(url,username,pass);
   
      //fill your code
      Statement stmt = con.createStatement();
      
      int id = new Random().nextInt((100 - 50) + 1) + 50;
      
      String sql = "INSERT INTO team " +
                   "VALUES ("+id+", '"+team.getName()+"', '"+team.getCoach()+"', "+team.getCity().getCityId()+", "+50+")";
      stmt.executeUpdate(sql);
      System.out.println("Team has been created");
  }
  
   public List<Team> getAllTeams() throws ClassNotFoundException, SQLException{
      ResourceBundle rb= ResourceBundle.getBundle("mysql");
      
      String url=rb.getString("db.url");
      String user=rb.getString("db.username");
      String pass=rb.getString("db.password");
      Class.forName("com.mysql.jdbc.Driver");
      Connection con = DriverManager.getConnection(url,user,pass);
    
         //fill your code 
      List<Team> teams = new ArrayList<Team>();
      
      Statement stmt=con.createStatement(); 
      ResultSet rs=stmt.executeQuery("select id, name,coach,home_city_id from team order by name");  
      while(rs.next()){  
      	CityDAO skDO = new CityDAO();
      	City city = skDO.getCityByID((long)rs.getInt(4));
    	  Team team = new Team(rs.getString(2),rs.getString(3),city);
          teams.add(team);
      }
      con.close();
      return teams;


  }
  
  
}
