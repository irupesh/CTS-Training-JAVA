package gameDetail;


public class Venue {
private Integer id;
private String name;

public Venue(int id) {
	this.id=id;
	
}

public Venue(int id, String name) {
	this.id=id;
	this.name=name;
}
public Venue() {
	
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

