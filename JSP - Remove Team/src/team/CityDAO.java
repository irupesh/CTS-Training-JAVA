package team;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CityDAO {

    public List<City> obtainAllCities() throws ClassNotFoundException, SQLException {
        
    	List<City> al=new ArrayList<City>();
    	DBConnection conn=new DBConnection();
    	   Connection con=conn.getConnection();
    	   Statement str=con.createStatement();
    	   ResultSet rs=str.executeQuery("select id,name from city order by name");
    	   
    	   while(rs.next())
    	   {
    		   al.add(new City(rs.getInt(1),rs.getString(2)));
    	   }
    	   return al;
        
    }
    
    public City getCityByName(String name) throws ClassNotFoundException, SQLException {
    

    	DBConnection conn=new DBConnection();
 	   Connection con=conn.getConnection();
 	   Statement str=con.createStatement();
 	   ResultSet rs=str.executeQuery("select id,name from city where name='"+name+"'");
 	   City c=null;
 	   
 	   while(rs.next())
 	   {
 		  
    		   
    			   c= new City(rs.getInt(1),rs.getString(2));
    			   // System.out.println(rs.getInt(1));

    		
    	   }
    	   return c;
     
    }

	
    
    
}


