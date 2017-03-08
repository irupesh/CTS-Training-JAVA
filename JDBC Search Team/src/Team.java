


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Team{
	private Long teamId;
	private String teamName;

	
      public Team()
      {
          
      }
      public Team(Long teamId,String teamName)
      {
          this.teamId=teamId;
          this.teamName = teamName;
        

      }
	public Long getTeamId() {
		return teamId;
	}
	public void setTeamId(Long teamId) {
		this.teamId = teamId;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	
	
}

