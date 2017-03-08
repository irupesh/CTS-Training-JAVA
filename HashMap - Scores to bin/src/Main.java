import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {
			
			Histogram hist = new Histogram();
			Scanner input = new Scanner(System.in);
			int count = input.nextInt();
			
			for(int i=0;i<count;i++)
				hist.addScore(input.nextInt());
			
			hist.displayHistogram();
			input.close();
	}

}
