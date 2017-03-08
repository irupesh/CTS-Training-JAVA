import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;
public class SkillDAO {

	public Skill getSkillByName(String skill) throws ClassNotFoundException, SQLException {
		//  fill the code
        Connection con=DBConnection.getConnection();
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select id,name from skill where name='"+skill+"'");
        Skill s=null;
        while(rs.next())
        {
        	s=new Skill(rs.getInt(1),rs.getString(2));
        	
        }
        System.out.println(s.getId());
        return s;
}
	public Skill getSkillById(int id) throws ClassNotFoundException, SQLException {
	    // fill the code
			Connection con=DBConnection.getConnection();
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select id ,name from skill where id="+id);
			Skill s=null;
			while(rs.next())
			{
		    		s=new Skill(rs.getInt(1),rs.getString(2));
				
			}
			return s;

	
}
	}