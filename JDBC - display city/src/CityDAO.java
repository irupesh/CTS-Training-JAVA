


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;


public class CityDAO {

  public List<City> listAllCity() throws ClassNotFoundException, SQLException{
       ResourceBundle rb= ResourceBundle.getBundle("mysql");
      
      String url=rb.getString("db.url");
      String user=rb.getString("db.username");
      String pass=rb.getString("db.password");
      Class.forName("com.mysql.jdbc.Driver");
      Connection con = DriverManager.getConnection(url,user,pass);

     //fill your code
      List<City> cities = new ArrayList<City>();
      
      Statement stmt=con.createStatement(); 
      ResultSet rs=stmt.executeQuery("select id, name from city order by name");  
      while(rs.next()){  
    	  City city = new City((long)rs.getInt(1),rs.getString(2));
          cities.add(city);
      }
      con.close();
      return cities;
      
  }
  
}
