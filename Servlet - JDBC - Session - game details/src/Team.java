


public class Team {
	private Integer id;
	private String name;
	private String coach;
	
	
	public Team(int id, String name, String coach) {
		this.id= id;
		this.name= name;
		this.coach = coach;
		
	}
	public Team() {
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCoach() {
		return coach;
	}
	public void setCoach(String coach) {
		this.coach = coach;
	}
	

}

