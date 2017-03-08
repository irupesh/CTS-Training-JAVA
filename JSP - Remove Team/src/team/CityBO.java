package team;

import java.sql.SQLException;
import java.util.List;

public class CityBO {
    public List<City> obtainAllCities() throws ClassNotFoundException, SQLException{
       CityDAO cd=new CityDAO();
       return cd.obtainAllCities();

			//fill the code
    }

    public City getCityByName(String name) throws ClassNotFoundException, SQLException{        
        
    	CityDAO cd=new CityDAO();
    	return cd.getCityByName(name);
		//fill the code
    }

    
}


