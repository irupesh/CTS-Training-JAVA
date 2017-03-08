import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
public static void main(String[] args) {
		
		int noMatches,totalRuns=0,index=1;
	
		Scanner input = new Scanner(System.in);
		noMatches = input.nextInt();
		ArrayList<Integer> runs = new ArrayList<Integer>(noMatches);
		
		for(int i=0;i<noMatches;i++)
			runs.add(input.nextInt());
		input.close();
		
		for(Integer run : runs){
			if(index%2==0 && run%2==1)
				totalRuns += run;
			if(index%2==1 && run%2==0)
				totalRuns += run;
			index++;		
		}
		
		System.out.println(totalRuns);
	}

}
