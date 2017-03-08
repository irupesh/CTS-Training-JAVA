  

public class Team {
    
    private Long teamId;
    private String name;
    private String coach;
    private City city;
    

    public Team() {
    }
    
    public Team(Long teamId,String name, String coach,City city) {
        this.teamId = teamId;
        this.name = name;
        this.coach = coach;            
        this.city = city;
    }
    
    public Long getTeamId() {
        return teamId;
    }

    public void setTeamId(Long teamId) {
        this.teamId = teamId;
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

  
   
    
    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
    
    @Override
    public String toString() {
        
        return String.format("%-15s%-30s%-30s%-15s",teamId,name ,coach,city );
    }
    
}
