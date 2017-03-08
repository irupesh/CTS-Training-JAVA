import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	
	public static void main(String[] args) {
		
		TreeMap<String,Player> players = new TreeMap<String,Player>();
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of players");
		int number = input.nextInt();
		input.nextLine();
		for(int i=0;i<number;i++){
		System.out.println("Enter the details of the player "+(i+1));
		String jersy_no = input.nextLine();
		String name = input.nextLine();
		String team = input.nextLine();
		String skill = input.nextLine();
		Player obj = new Player(name, team, skill);
		players.put(jersy_no, obj);
		}
		input.close();
		
		for(Map.Entry<String, Player> entry:players.entrySet()){    
	        String key=entry.getKey();  
	        Player obj=entry.getValue();   
	        System.out.println(key+"--"+obj.getName()+"--"+obj.getTeam()+"--"+obj.getSkill());   
	    }  
		
		
	}

}
