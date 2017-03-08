
public class Venue {
	
	Long venueId;
	String venueName;
	
	public Venue()
	{}
	
	public Venue(Long venueId,String venueName)
	{
		this.venueId=venueId;
		this.venueName=venueName;		
	}
	
	public String getVenueName()
	{
		return venueName;
	}
	public void setVenueName(String venueName)
	{
		this.venueName=venueName;
	}


	public void setVenueId(Long venueId)
	{
		this.venueId=venueId;
	}
	public Long getVenueId()
	{
		return venueId;
	}





}

