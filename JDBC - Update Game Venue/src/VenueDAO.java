
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;




public class VenueDAO{
	
public Venue getVenueByID(Long id) throws ClassNotFoundException, SQLException {
    ResourceBundle rb= ResourceBundle.getBundle("mysql");
    
    String url=rb.getString("db.url");
    String user=rb.getString("db.username");
    String pass=rb.getString("db.password");
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection(url,user,pass);

    //fill your code
    String selectSQL = "SELECT ID, NAME FROM venue WHERE ID = ?";
    PreparedStatement preparedStatement = con.prepareStatement(selectSQL);
    preparedStatement.setInt(1, id.intValue());
    ResultSet rs = preparedStatement.executeQuery();
    Venue venue = null;
    while (rs.next()) {
    	 venue = new Venue((long)rs.getInt("ID"), rs.getString("NAME"));
    }
    return venue;

 }

public Venue getVenueByName(String name) throws ClassNotFoundException, SQLException {
    ResourceBundle rb= ResourceBundle.getBundle("mysql");
    
    String url=rb.getString("db.url");
    String user=rb.getString("db.username");
    String pass=rb.getString("db.password");
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection(url,user,pass);

    //fill your code
    String selectSQL = "SELECT ID, NAME FROM venue WHERE NAME = ?";
    PreparedStatement preparedStatement = con.prepareStatement(selectSQL);
    preparedStatement.setString(1, name);
    ResultSet rs = preparedStatement.executeQuery();
    Venue venue = null;
    while (rs.next()) {
    	 venue = new Venue((long)rs.getInt("ID"), rs.getString("NAME"));
    }
    return venue;

 }

}
