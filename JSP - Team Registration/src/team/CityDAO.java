package team;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CityDAO {

    public List<City> obtainAllCities() throws ClassNotFoundException, SQLException {
        
		//fill the code
    	Connection con = DBConnection.getConnection();
    	List<City> cities = new ArrayList<City>();
        
        Statement stmt=con.createStatement(); 
        ResultSet rs=stmt.executeQuery("select id, name from city");  
        while(rs.next()){  
      	  City city = new City(rs.getInt(1),rs.getString(2));
            cities.add(city);
        }
        con.close();
        return cities;
    }
    
    public City getCityByName(String name) throws ClassNotFoundException, SQLException {
    	
       		//fill the code
    	Connection con = DBConnection.getConnection();
        
        Statement stmt=con.createStatement(); 
        ResultSet rs=stmt.executeQuery("select id, name from city where name='"+name+"'");  
        while(rs.next()){  
        	System.out.println("name data= "+rs.getString(2));
      	  return new City(rs.getInt(1),rs.getString(2));  
        }
        System.out.println("nhi milla");
        return null;
    }
    
    public City getCityByID(int id) throws ClassNotFoundException, SQLException {
    	
   		//fill the code
    List<City> cities = obtainAllCities();
    
    for(City city : cities){
    	if(city.getId() == id)
    		return city;
    }
    return null;
}

	
    
    
}


