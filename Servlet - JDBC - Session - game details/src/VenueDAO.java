import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class VenueDAO {
	

	public Venue getVenueById(int id) throws SQLException, ClassNotFoundException {


	//fill the code
		Connection con = DBConnection.getConnection();
		String selectSQL = "SELECT ID, NAME FROM venue WHERE ID = ?";
	    PreparedStatement preparedStatement = con.prepareStatement(selectSQL);
	    preparedStatement.setInt(1, id);
	    ResultSet rs = preparedStatement.executeQuery();
	    Venue venue = null;
	    while (rs.next()) {
	    	 venue = new Venue(rs.getInt("ID"), rs.getString("NAME"));
	    }
	    return venue;
       
}
}
