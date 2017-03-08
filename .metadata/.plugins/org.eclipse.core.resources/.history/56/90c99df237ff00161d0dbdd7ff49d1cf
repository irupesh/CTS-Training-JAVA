package skillDetails;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SkillDAO {

	public Skill getSkillById(int id) throws ClassNotFoundException, SQLException {
// fill the code
		Connection con=DBConnection.getConnection();
		Statement stmnt=con.createStatement();
		ResultSet rs=stmnt.executeQuery("select id,name from skill where id="+id);
		Skill skill=null;
		while(rs.next()){
		skill=new Skill(rs.getInt(1), rs.getString(2));
		}
		return skill;
	}
}
