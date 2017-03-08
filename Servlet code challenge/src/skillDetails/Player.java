package skillDetails;

public class Player {
	private int id;
	private String name;
	private String country;
	private Skill skill;
	
	
	public Player(int id, String name, String country, Skill skill) {
		super();
		this.id = id;
		this.name = name;
		this.country = country;
		this.skill = skill;
	}
	public Player() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Skill getSkill() {
		return skill;
	}
	public void setSkill(Skill skill) {
		this.skill = skill;
	}
	
	
}
