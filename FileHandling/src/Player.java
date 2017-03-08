
public class Player {
	String name; 
	String team; 
	String skill;
	
	public Player(String name, String team, String skill) {
		super();
		this.name = name;
		this.team = team;
		this.skill = skill;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	} 
}
