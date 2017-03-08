
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Venue{
private Long venueId;
private String venueName;


      public Venue()
      {

      }
      public Venue(Long venueId,String venueName)
      {
          this.venueId=venueId;
          this.venueName = venueName;


      }
public Long getVenueId() {
return venueId;
}
public void setVenueId(Long venueId) {
this.venueId = venueId;
}
public String getVenueName() {
return venueName;
}
public void setVenueName(String venueName) {
this.venueName = venueName;
}


}
