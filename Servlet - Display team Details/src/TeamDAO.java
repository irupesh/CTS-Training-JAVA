import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class TeamDAO {

	public Team getTeamByName(String name) throws SQLException, ClassNotFoundException {
		// fill the code
		 Connection con=DBConnection.getConnection();
	        Statement st=con.createStatement();
	        ResultSet rs=st.executeQuery("select id,name,coach from team where name='"+name+"'");
	        Team t=null;
	        while(rs.next())
	        {
	        	t=new Team(rs.getInt(1),rs.getString(2),rs.getString(3));
	        	
	        }
	        System.out.println(t.getId());
	        return t;

}
	public Team getTeamById(int id) throws ClassNotFoundException, SQLException {
	    // fill the code
			Connection con=DBConnection.getConnection();
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select id ,name,coach from team where id="+id);
			Team t=null;
			while(rs.next())
			{
		    		t=new Team(rs.getInt(1),rs.getString(2),rs.getString(3));
				
			}
			return t;
}
}
