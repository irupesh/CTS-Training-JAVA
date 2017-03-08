public class Team {

	private int id;
    private String name;
    private String coach;
    
    
    public Team(int id,String name,String coach) {
        this.name = name;
        this.coach = coach;
        this.id = id;
        
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

    public String getCoach() {
        return coach;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }

}
