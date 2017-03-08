

import java.sql.SQLException;
import java.util.List;

public class Main {

	public static void main(String argsp[]) throws ClassNotFoundException, SQLException
	{
		
		VenueDAO venueDAO=new VenueDAO();
		
		List<Venue> venueList= venueDAO.display();

		
		//System.out.println("Venue in which maximum number of matches played");
		//fill your code
		venueList = venueDAO.display();
        for(Venue venue :venueList){
        	System.out.println(venue.getVenueName());
        } 
	}
	
	
}
