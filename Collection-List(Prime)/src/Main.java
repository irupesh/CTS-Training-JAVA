import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static boolean isPrime(int n) {
	    for(int i=2;2*i<n;i++) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
public static void main(String[] args) {
		
		int noMatches,count=0;
	
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of matches");
		noMatches = input.nextInt();
		ArrayList<Integer> runs = new ArrayList<Integer>(noMatches);
		System.out.println("Enter the runs scored by the team");
		
		for(int i=0;i<noMatches;i++)
			runs.add(input.nextInt());
		input.close();
		
		for(Integer run : runs){
			if(isPrime(run))
				count++;
		}
		
		System.out.println("Number of prime scores : "+count);
		
	}

}
