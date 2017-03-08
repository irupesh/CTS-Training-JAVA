
public class Player {
	String name;
	String country;
	String skill;
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
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	
	public void display(){
		System.out.println("Player Details");
	 	System.out.println("Player Name :"+this.getName());
	 	System.out.println("Country Name :"+this.getCountry());
	 	System.out.println("Skill :"+this.getSkill());
	}

}
