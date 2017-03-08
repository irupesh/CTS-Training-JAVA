
  
  

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public class Main {
    public static void main(String ags[])throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("List of all team and their city"); 
        System.out.println(String.format("%-15s%-30s%-30s%-15s","Id", "Name", "Coach","CityName"));
        List<Team> teamList = null;
        TeamDAO teamIns = new TeamDAO();
    
        //fill your code
        teamList = teamIns.getAllTeams();
        
        for(Team team :teamList){
        	System.out.println(team.toString());
        } 
    }
}
