package team;
import java.sql.SQLException;
import java.util.List;

public class CityBO {
    public List<City> obtainAllCities() throws ClassNotFoundException, SQLException{
       

			//fill the code
    	return new CityDAO().obtainAllCities();
    }

    public City getCityByName(String name) throws ClassNotFoundException, SQLException{        
        

		//fill the code
    	return new CityDAO().getCityByName(name);
    }

    
}


