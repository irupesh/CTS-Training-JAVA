import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		int noMatches,centuary = 0,fifty = 0;
	
		Scanner input = new Scanner(System.in);
		noMatches = input.nextInt();
		ArrayList<Integer> runs = new ArrayList<Integer>(noMatches);
		
		for(int i=0;i<noMatches;i++)
			runs.add(input.nextInt());
		input.close();
		
		for(Integer run : runs){
			if(run>=50 && run <100)
				fifty++;
			else if(run>=100)
				centuary++;
		}

		System.out.printf(fifty+"\n"+centuary);
	}

}