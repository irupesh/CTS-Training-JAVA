


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Main {
  
  public static void main(String ags[])throws Exception{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String name, coach;

    
      System.out.println("Enter team name");
      name = br.readLine();
      System.out.println("Enter coach name");
      coach = br.readLine();
  
    
      System.out.println("Enter the city");
      System.out.println("1.Pune");
      System.out.println("2.Hyderabad");
      System.out.println("3.Delhi");
      Integer choice = Integer.parseInt(br.readLine());
      City cityIns = null;
      CityDAO role = new CityDAO();
    	  
        //fill your code
      String city_name = null;
      
      if(choice == 1)
    	  city_name = "Pune";
      else if(choice== 2)
    	  city_name = "Hyderabad";
      else if(choice == 3)
    	  city_name = "Delhi";
      
      cityIns = role.getCityByName(city_name);
      Team team = new Team(name, coach, cityIns);
      TeamDAO tteam = new TeamDAO();
      tteam.createTeam(team);
      System.out.println("Team Details are:");
      System.out.println(String.format("%-35s%-35s%-15s","Name" ,"Coach","City" ));
      
      List<Team> teamList = tteam.getAllTeams();
      for(Team dteam :teamList){
      	System.out.println(dteam.toString());
      } 
      
      
  }
  
      
}
