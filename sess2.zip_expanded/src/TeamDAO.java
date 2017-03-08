  


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class TeamDAO {
    
    
    
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
      	  Team team = new Team((long)rs.getInt(1),rs.getString(2),rs.getString(3),city);
            teams.add(team);
        }
        con.close();
        return teams;

    }
    
    
}
