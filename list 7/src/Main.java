import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		
		int index1,index2;
	
		Scanner input = new Scanner(System.in);
		ArrayList<String> teams = new ArrayList<String>(5);
		
		for(int i=0;i<5;i++)
			teams.add(input.nextLine());
		
		System.out.println("Enter swap positons");
		index1 = input.nextInt();
		index2 = input.nextInt();
		input.close();
		
		Collections.swap(teams, index1, index2);
		
		for(String team : teams)
			System.out.println(team);
		
	}

}
