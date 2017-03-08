import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		int noMatches,totalRuns=0;
		float average;
	
		Scanner input = new Scanner(System.in);
		noMatches = input.nextInt();
		ArrayList<Integer> runs = new ArrayList<Integer>(noMatches);
		
		for(int i=0;i<noMatches;i++)
			runs.add(input.nextInt());
		input.close();
		
		for(Integer run : runs)
			totalRuns += run;
		
		average = totalRuns/(float)noMatches;
		System.out.println(totalRuns+"\n"+average);
	}

}
