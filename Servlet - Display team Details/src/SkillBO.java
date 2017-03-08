import java.sql.SQLException;


public class SkillBO {

	public Skill getSkillByName(String skill) throws ClassNotFoundException, SQLException {
		// fill the code
	    SkillDAO sd=new SkillDAO();
	    return sd.getSkillByName(skill);
	}

}
