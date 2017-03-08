import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class PlayerDAO {

	public List<Player> getPlayerDetails(int  tid,int sid) throws ClassNotFoundException, SQLException {
	//fill the code
	List<Player> ls=new ArrayList<Player>();
    Connection con=DBConnection.getConnection();
    Statement st=con.createStatement();
    ResultSet rs=st.executeQuery("select id,name,country,skill_id,team_id from player "
    		+"where skill_id="+sid+" And team_id="+tid
    		+ " order by name");
     while(rs.next())
    {
        
    	ls.add(new Player(rs.getInt(1),rs.getString(2),rs.getString(3),new SkillDAO().getSkillById(rs.getInt(4)),new TeamDAO().getTeamById(rs.getInt(5))));
    	
    }
    return ls;	
	
}
	
}

