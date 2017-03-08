import java.sql.SQLException;

public class VenueBO {
	public Venue getVenueById(int id) throws ClassNotFoundException, SQLException {
		
	//fill the code
		return new VenueDAO().getVenueById(id);

	}

}
