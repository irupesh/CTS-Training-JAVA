import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Team implements Comparable<Team> {
	String name;
	List<Player> playerList;
	
	public Team(String name) {
		super();
		playerList = new ArrayList<Player>();
		this.name = name;
	}

	public Team(String name, List<Player> playerList) {
		super();
		playerList = new ArrayList<Player>();
		this.name = name;
		this.playerList = playerList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public void setPlayerList(List<Player> playerList) {
		this.playerList = playerList;
	}
	
	public void addPlayer(String playername){
		Player obj = new Player(playername);
		this.playerList.add(obj);	
	}
	
	public List<Player> getPlayerList() {
		Collections.sort(playerList);
		return playerList;
	}

	@Override
	public int compareTo(Team o) {
		return this.name.compareTo(o.name);
	}
	
}
