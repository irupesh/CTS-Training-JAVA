import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Player obj;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter player name");
		String name = input.nextLine();
		
		System.out.println("Enter team name");
		String teamName = input.nextLine();
		System.out.println("Enter number of matches");
		long noMatches = input.nextLong();
		
		System.out.println("Menu\n1.Bowler details\n2.Batsman details\nEnter choice");
		int choice = input.nextInt();
		
		if(choice ==1){
			System.out.println("Enter number of wicktes taken");
			long noWicket = input.nextLong();
			obj = new Bowler(name, teamName, noMatches, noWicket);
			obj.displayDetails();
		}else if(choice == 2){
			System.out.println("Enter number of runs scored");
			long noScore = input.nextLong();
			obj = new Batsman(name, teamName, noMatches, noScore);
			obj.displayDetails();
		}else
			System.out.println("Invalid input.");
		input.close();

	}

}
