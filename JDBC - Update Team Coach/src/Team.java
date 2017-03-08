

public class Team {

    private String teamName;
    private String coachName;

    public Team(String teamName, String coachName) {
        this.teamName = teamName;
        this.coachName = coachName;
     
    }

    Team() {
        
    }

    
   
    public String getTeamName() {
        return teamName;
    }

 
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

   
    public String getCoachName() {
        return coachName;
    }

    
    public void setCoachName(String coachNamee) {
        this.coachName = coachName;
    }


    
}
