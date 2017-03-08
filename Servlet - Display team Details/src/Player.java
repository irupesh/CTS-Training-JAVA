
public class Player {

	private int id;
	private String name;
	private String country;
	private Skill skill;
	private Team team;
	
	// fill the code
	public Player(int id,String name, String country, Skill skill, Team team)
	{
		super();
		setId(id);
		setName(name);
		setCountry(country);
		setSkill(skill);
		setTeam(team);
	}
	public void setId(int id )
	{
		this.id=id;
	}
	
	public void setName(String name)
	{
	this.name=name;
	}
	
	public void setCountry(String country)
	{
		this.country=country;
	}
	public void setSkill(Skill skill)
	{
		this.skill=skill;
	}
    public void setTeam(Team team)
    {
    	this.team=team;
    }
 
    public int getId()
    {return this.id;}
    public String getName()
    {return this.name;}
    public String getCountry()
    {return this.country;}
    public Skill getSkill()
    {return this.skill;}
    public Team getTeam()
    {return this.team;}
    










}
