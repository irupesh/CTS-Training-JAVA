package skillDetails;

import java.sql.SQLException;

public class SkillBO {

	public Skill getSkillById(int id) throws ClassNotFoundException, SQLException {
		SkillDAO skilldao = new SkillDAO();
		return skilldao.getSkillById(id);
		
	}

}
