public class Team {
    private int id;
    private String name;
    private String coach;
    City homeCity;
    int captain;

    public Team( String name, String coach, City homeCity,int captain) {
    
        this.name = name;
        this.coach=coach;
        this.homeCity=homeCity;
        this.captain=captain;
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

	public City getHomeCity() {
		return homeCity;
	}

	public void setHomeCity(City homeCity) {
		this.homeCity = homeCity;
	}

	public int getCaptain() {
		return captain;
	}

	public void setCaptain(int captain) {
		this.captain = captain;
	}

	public Team() {
    }

	public Team(int id, String name, String captain) {
		
		
	}

   
        
}
