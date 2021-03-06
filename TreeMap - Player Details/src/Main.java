import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	
	public static void main(String[] args) {
		
		TreeMap<Integer,Player> players = new TreeMap<Integer,Player>();
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of players");
		int number = input.nextInt();
		
		for(int i=0;i<number;i++){
		System.out.println("Enter the details of the player "+(i+1));
		Integer cap_no = input.nextInt();
		input.nextLine();
		String name = input.nextLine();
		String team = input.nextLine();
		String skill = input.nextLine();
		Player obj = new Player(name, team, skill);
		players.put(cap_no, obj);
		}
		input.close();
		
		System.out.println("Player Details");
		for(Map.Entry<Integer, Player> entry:players.entrySet()){    
	        int key=entry.getKey();  
	        Player obj=entry.getValue();   
	        System.out.println(key+"--"+obj.getName()+"--"+obj.getTeam()+"--"+obj.getSkill());   
	    }  
		
		
	}

}
