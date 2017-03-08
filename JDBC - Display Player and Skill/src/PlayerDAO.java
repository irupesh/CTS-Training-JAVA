

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class PlayerDAO {
    
    
    
    public List<Player> getAllPlayers() throws ClassNotFoundException, SQLException{
        ResourceBundle rb= ResourceBundle.getBundle("mysql");
        
        String url=rb.getString("db.url");
        String user=rb.getString("db.username");
        String pass=rb.getString("db.password");
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,user,pass);
      
        //fill your code
       
        List<Player> players = new ArrayList<Player>();
        
        Statement stmt=con.createStatement(); 
        ResultSet rs=stmt.executeQuery("select id, name,country,skill_id from player order by name");  
        while(rs.next()){  
        	SkillDAO skDO = new SkillDAO();
        	Skill skill = skDO.getSkillByID((long)rs.getInt(4));
      	  Player player = new Player((long)rs.getInt(1),rs.getString(2),rs.getString(3),skill);
            players.add(player);
        }
        con.close();
        return players;
        

    }
    
    
}
