
public class Player implements Comparable<Player>{
	private int id;
	private String name;
	private String country;
	private Team team;
	
	// fill the code
	
	public int getId() {
		return id;
	}
	public Player(int id, String name, String country, Team team) {
		super();
		this.id = id;
		this.name = name;
		this.country = country;
		this.team = team;
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
	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
	}
	@Override
	public int compareTo(Player arg0) {
		return this.name.compareTo(arg0.name);
	}	
}
