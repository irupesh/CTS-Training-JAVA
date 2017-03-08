

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;


public class VenueDAO {

	
	
	
	public List<Venue> display() throws ClassNotFoundException, SQLException
	{
		
	       ResourceBundle rb= ResourceBundle.getBundle("mysql");
	       
	       String url=rb.getString("db.url");
	       String user=rb.getString("db.username");
	       String pass=rb.getString("db.password");
	       Class.forName("com.mysql.jdbc.Driver");
	       Connection con = DriverManager.getConnection(url,user,pass);
	
                   //fill your code
	       
	      String sql =  "select venue.name from venue where id in "+ "("
	       +"  select v.id from venue v join game g on"
	       +"  g.venue_id = v.id"
	       +" group by v.id having count(g.id) ="
	       +" ("
	       +" select max(mycount) from ("
	        +"select count(g.id) as mycount from venue v join game g on"
	        +" g.venue_id = v.id"
	        + "   group by v.id"
	        + "  )as tab"
	        +" )"
	       +") order by venue.name";

	       
	       
	       List<Venue> venues = new ArrayList<Venue>();
	          Statement stmt=con.createStatement(); 
	          ResultSet rs=stmt.executeQuery(sql);  
	          while(rs.next()){  
	        	  Venue venue = new Venue(rs.getString(1));  
	        	  venues.add(venue);
	          }
	          con.close();
	          return venues;


		
	}
	

	
}
