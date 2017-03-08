import java.util.ArrayList;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		
		int noMatches,count=0;
	
		Scanner input = new Scanner(System.in);
		noMatches = input.nextInt();
		input.nextLine();
		ArrayList<String> stadiums = new ArrayList<String>(noMatches);
		
		for(int i=0;i<noMatches;i++)
			stadiums.add(input.nextLine());
		
		String stadiumFind  = input.nextLine();
		input.close();
		
		
		for(String stadium : stadiums){
			if(stadium.equals(stadiumFind))
				count++;
		}
		System.out.println(count);
		
		
	}

}
