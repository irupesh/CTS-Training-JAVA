import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class TeamDAO {

	public Team getTeamById(int id) throws ClassNotFoundException, SQLException {
		// fill the code
		Connection con=new DBConnection().getConnection();
		Statement s=con.createStatement();
		ResultSet rs=s.executeQuery("Select id,name,coach,captain from team where id="+id);
		rs.next();
		return new Team(rs.getInt(1), rs.getString(2), rs.getString(3), null);
	}

	public int updateCoachName(Integer id, String coach) throws ClassNotFoundException, SQLException {
	// fill the code
		Connection con=new DBConnection().getConnection();
		Statement s=con.createStatement();
		int update=s.executeUpdate("update team set coach='"+coach+"' where id="+id);;
		
		return update;
		
	}
	
	

}
