public class Player {
    private int id;
    private String name;
    private Team team;
    private int matches;
    private int highestScore;
    private int runs;
    private Double strikeRate;

    public Player() {
    }
   
    public Player(int id, String name, Team team, int matches, int highestScore, int runs, Double strikeRate) {
        this.id = id;
        this.name = name;
        this.team = team;
        this.matches = matches;
        this.highestScore = highestScore;
        this.runs = runs;
        this.strikeRate = strikeRate;
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

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public int getMatches() {
        return matches;
    }

    public void setMatches(int matches) {
        this.matches = matches;
    }

    public int getHighestScore() {
        return highestScore;
    }

    public void setHighestScore(int highestScore) {
        this.highestScore = highestScore;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public Double getStrikeRate() {
        return strikeRate;
    }

    public void setStrikeRate(Double strikeRate) {
        this.strikeRate = strikeRate;
    }
            
    
}
