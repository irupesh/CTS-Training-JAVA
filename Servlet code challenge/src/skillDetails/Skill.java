package skillDetails;

public class Skill {
private Integer id;
private String name;


public Skill(Integer id, String name) {
	super();
	this.id = id;
	this.name = name;
}
public Skill() {
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


}
