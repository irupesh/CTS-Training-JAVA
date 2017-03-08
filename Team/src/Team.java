
public class Team {
	String name; 
	String coach; 
	String location; 
	String players;
	String captain;
	
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
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getPlayers() {
		return players;
	}
	public void setPlayers(String players) {
		this.players = players;
	}
	public String getCaptain() {
		return captain;
	}
	public void setCaptain(String captain) {
		this.captain = captain;
	}
	
	void displayTeamDetails(){
		System.out.println("Team Details");
	 	System.out.println("Team : "+this.getName());
	 	System.out.println("Coach : "+this.getCoach());
	 	System.out.println("Location : "+this.getLocation());
	 	System.out.println("Players : "+this.getPlayers());
	 	System.out.println("Captain : "+this.getCaptain());
	}

}
