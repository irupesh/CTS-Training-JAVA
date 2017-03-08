import java.util.Date;


	public class Game {
	private Integer id;
	private Date gameDate;
	private Team team1;
	private Team team2;
	private Venue venue;
	
	public Game(Date date,Team team1,Team team2)
	{
	this.gameDate = date;
	this.team1=team1;
	this.team2=team2;
	}
	
	
	public Game() {
		// TODO Auto-generated constructor stub
	}

	public Date getGameDate() {
		return gameDate;
	}
	public void setGameDate(Date gameDate) {
		this.gameDate = gameDate;
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Team getTeam1() {
		return team1;
	}
	public void setTeam1(Team team1) {
		this.team1 = team1;
	}
	public Team getTeam2() {
		return team2;
	}
	public void setTeam2(Team team2) {
		this.team2 = team2;
	}

    public Venue getVenue() {
		return venue;
	}
	public void setVenue(Venue venue) {
		this.venue = venue;
	}


	public Game(Integer id, Date gameDate, Team team1, Team team2, Venue venue) {
		super();
		this.id = id;
		this.gameDate = gameDate;
		this.team1 = team1;
		this.team2 = team2;
		this.venue = venue;
	}
	
	
	

}

