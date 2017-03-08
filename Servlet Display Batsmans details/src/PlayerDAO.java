import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class PlayerDAO {

	public List<Player> obtainAllBatsMan() throws ClassNotFoundException, SQLException {
	//fill the code
		Connection con  = DBConnection.getConnection();
        List<Player> players = new ArrayList<Player>();
        
        Statement stmt=con.createStatement(); 
        ResultSet rs=stmt.executeQuery("select id, name,country,skill_id from player order by name");  
        while(rs.next()){  
        	SkillBO skillBO = new SkillBO();
        	Skill skill = skillBO.getSkillById(rs.getInt(4));
        	if(skill.getSkillName().equals("Batting")){
      	       Player player = new Player(rs.getInt(1),rs.getString(2),rs.getString(3));
               players.add(player);
        	}
        }
        con.close();
        return players;
	}

}
