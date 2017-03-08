package team;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TeamDAO{

    public List<Team> obtainAllTeams() throws ClassNotFoundException, SQLException {
    	List<Team> al=new ArrayList<Team>();
    	DBConnection conn=new DBConnection();
    	   Connection con=conn.getConnection();
    	   Statement str=con.createStatement();
    	   ResultSet rs=str.executeQuery("select id,name,coach from team order by name");
    	   
    	   while(rs.next())
    	   {
    		   al.add(new Team(rs.getInt(1),rs.getString(2),rs.getString(3)));
    	   }
    	   return al;
    	   
    	   
        

		//fill the code
    }


    public Integer deleteTeamById(Integer id) throws SQLException, ClassNotFoundException {
		
	
		DBConnection conn=new DBConnection();
 	   Connection con=conn.getConnection();
 	  PreparedStatement ps=con.prepareStatement("SET FOREIGN_KEY_CHECKS=0;");
		PreparedStatement ps1=con.prepareStatement("delete from team where id=?");
		PreparedStatement ps2=con.prepareStatement("SET FOREIGN_KEY_CHECKS=1;");
		ps.execute();
		ps1.setInt(1, id);
		ps1.execute();
	   ps2.execute();
	   
		return 1;

	}
		
}
    
    



