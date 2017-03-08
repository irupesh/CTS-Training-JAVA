
public class Team {
private Integer id;
private String name;
private String coach;
private Player captain;

//fill the code

public Integer getId() {
	return id;
}
public Team(Integer id, String name, String coach, Player captain) {
	super();
	this.id = id;
	this.name = name;
	this.coach = coach;
	this.captain = captain;
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
public Player getCaptain() {
	return captain;
}
public void setCaptain(Player captain) {
	this.captain = captain;
}

}