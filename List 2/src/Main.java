import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
		
		int noMatches;
	
		Scanner input = new Scanner(System.in);
		noMatches = input.nextInt();
		ArrayList<Integer> runs = new ArrayList<Integer>(noMatches);
		
		for(int i=0;i<noMatches;i++)
			runs.add(input.nextInt());
		input.close();
		
		Collections.sort(runs);
		
		for(Integer run : runs)
			System.out.println(run);
		
	}

}
