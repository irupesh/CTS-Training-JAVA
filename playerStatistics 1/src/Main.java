import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter player name");
		String name = input.nextLine();
		System.out.println("Enter team name");
		String team = input.nextLine();
		System.out.println("Enter number of matches played");
		int played = input.nextInt();
		System.out.println("Enter total raid points");
		long raid = input.nextLong();
		System.out.println("Enter total defence points");
		long defence = input.nextLong();
		
		Player obj = new Player(name, team, played, raid, defence);
		obj.displayKabbadiPlayerDetails();
		input.close();
	}

}
