import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PlayerBO {
	List<Player> playerList = new ArrayList<Player>();
     public List<Player> getPlayerList() {
				
        Player player;
        player = new Player(1,"Zaheer Khan",getTeamByTeamName("Delhi Daredevils"),17,53,372,121.96);
        playerList.add(player);
        player = new Player(2,"Mohammed Shami",getTeamByTeamName("Delhi Daredevils"),398,124,8064,86.97);
        playerList.add(player);
        player = new Player(3,"CJ Anderson",getTeamByTeamName("Mumbai Indians"),33,131,860,125.54);
        playerList.add(player);
        player = new Player(4,"Rohit Sharma",getTeamByTeamName("Mumbai Indians"),16,98,482,144.74);
        playerList.add(player);
        player = new Player(5,"Angelo Mathews",getTeamByTeamName("Rajasthan Royals"),11,28,144,138.46);
        playerList.add(player);
        player = new Player(6,"Virat Kohli",getTeamByTeamName("Rajasthan Royals"),16,82,505,130.82);
        playerList.add(player);
        player = new Player(7,"Suresh Raina",getTeamByTeamName("Kolkata Knight Riders"),17,62,374,123.02);
        playerList.add(player);
        player = new Player(8,"Dinesh Karthik ",getTeamByTeamName("Kolkata Knight Riders"),16,28,141,120.51);
        playerList.add(player);
        player = new Player(9,"Murali Vijay",getTeamByTeamName("Deccan Chargers"),11,20,74,112.12);
        playerList.add(player);
        player = new Player(10,"Yuvraj Singh",getTeamByTeamName("Deccan Chargers"),14,57,248,118.09);
        playerList.add(player);
        
        return playerList;
    }
     
     public List<Player> getPlayerListByTeam(String teamName){
    	 Iterator<Player> it=playerList.iterator();

		 List<Player> al=new ArrayList();
    	 while(it.hasNext())
    	 {
    		 Player p=it.next();
    		 if(p.getTeam().getName().equals(teamName))
    		 {
    			
    			 al.add(p);
    		 }
    	 }
        return al;
     }
     
     public List<Team> getTeamList() {
				Team team = null;
         List<Team> teamList = new ArrayList<Team>();
         team = new Team(1,"Delhi Daredevils","DD");
         teamList.add(team);
         team = new Team(2,"Mumbai Indians","MI");
         teamList.add(team);
         team = new Team(3,"Rajasthan Royals","RR");
         teamList.add(team);
         team = new Team(4,"Kolkata Knight Riders","KKR");
         teamList.add(team);
         team = new Team(5,"Deccan Chargers","DC");
         teamList.add(team);
         return teamList;
     }
     
     public Team getTeamByTeamName(String teamName){
					List<Team> t=getTeamList();
					Iterator<Team> it=t.iterator();
					while(it.hasNext())
					{
						Team t1=it.next();
						if(t1.getName().equals(teamName))
						{
							return t1;
						}	
						
					}
					return null;
					
     }
}
