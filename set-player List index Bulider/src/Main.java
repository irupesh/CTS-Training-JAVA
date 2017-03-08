import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
public static void main(String[] args){
		

		Scanner input = new Scanner(System.in);
		String choice;
		
		HashSet<Player> players = new HashSet<Player>();
		
		do{
			Iterator<Player> iterator = players.iterator();
			boolean valid=true;
			System.out.println("Enter Player Name:");
			String name = input.nextLine();
			System.out.println("Enter Skill:");
			String skill = input.nextLine();
			Player obj = new Player(name,skill);
			
			while (iterator.hasNext()){   
				Player obj1 = iterator.next();
				if(obj1.getName().equals(name)){
				   System.out.println("Player "+name+" already exist");
				   valid = false;
				   break;
				}
			}
			if(valid){
				players.add(obj);
				}
			
			System.out.println("Do you want to continue(yes/no):");
			choice = input.nextLine();
		}while(choice.equals("yes"));
		
	TreeSet<Index> index = IndexBuilder.buildIndex(players);
	
	IndexBuilder.displayIndex(index);
}

}
