import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TeamDAO {

		public void createCity(City city) throws ClassNotFoundException, SQLException{
	        Statement stmnt=DBConnection.getConnection().createStatement();
	        stmnt.executeUpdate("insert into city values("+city.getId()+",'"+city.getName()+"')");
	    }


	public boolean createTeam(Team team) throws SQLException, ClassNotFoundException {
		Statement stmnt = DBConnection.getConnection().createStatement();
		stmnt.executeUpdate("insert into team values(501,'" + team.getName() + "','" + team.getCoach() + "',"
				+ team.getHomeCity().getId() + "," + team.getCaptain() + ")");
		return true;
	}

	public int getPlayerIdByPlayerName(String name) throws ClassNotFoundException, SQLException{
        Statement stmnt=DBConnection.getConnection().createStatement();
        ResultSet rs=stmnt.executeQuery("select id from player where name='"+name+"'");
        int pId = 0;
        while(rs.next()){
            pId=rs.getInt(1);
        }
        return pId;
    }
}
