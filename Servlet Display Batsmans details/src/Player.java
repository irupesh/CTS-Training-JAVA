

public class Player {
    
    private int playerId;
    private String name;
    private String country;
    

    public Player() {
    }
    
    public Player(int playerId,String name, String country) {
        this.playerId = playerId;
        this.name = name;
        this.country = country;
    }
    
    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

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

    
}
