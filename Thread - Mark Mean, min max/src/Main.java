import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) throws InterruptedException {
		ArrayList<CalculateScores> scores = new ArrayList<CalculateScores>();
		Scanner input = new Scanner(System.in);
		
		for(int i=0;i<3;i++){
			System.out.println("Enter the match :");
			String match = input.nextLine();
			System.out.println("Enter the scores :");
			String scoreString = input.nextLine();
			CalculateScores obj = new CalculateScores(match, scoreString);
			scores.add(obj);
		}
		
		for(CalculateScores score:scores){
			Thread t1 = new Thread(score);
			t1.start();
			t1.join();
		}
		
		System.out.println("Score Summary");
		for(CalculateScores score:scores){
			System.out.println("Match : "+score.matchType);
			System.out.printf("Mean : %.2f\n",score.getMeanScore());
			System.out.println("Min Score : "+score.getMinScore());
			System.out.println("Max Score : "+score.getMaxScore());
		}
		input.close();
	}

}
