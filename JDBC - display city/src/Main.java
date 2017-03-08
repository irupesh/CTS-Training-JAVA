



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;


public class Main {
    
    public static void main(String ags[])throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("List of all City"); 
        List<City> cityList = null;
        CityDAO cityIns = new CityDAO();
     
         
        //fill  your code
        cityList = cityIns.listAllCity();
        int count = 1;
        for(City city :cityList){
        	System.out.println((count++)+") "+city.getSkillName());
        } 
        
    }
}
