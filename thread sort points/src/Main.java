import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		ArrayList<SortPoints> scores = new ArrayList<SortPoints>();
		Scanner input = new Scanner(System.in);
		
		for(int i=0;i<2;i++){
			System.out.println("Enter the match type");
			String match = input.nextLine();
			System.out.println("Enter the points");
			String scoreString = input.nextLine();
			SortPoints obj = new SortPoints(match, scoreString);
			scores.add(obj);
		}
		
		for(SortPoints score:scores){
			score.start();
			score.join();
		}
		
		for(SortPoints score:scores){
			System.out.println("Match : "+score.matchType);
			Integer[] sc = score.getScores();
			for(Integer i : sc){
				System.out.println(i);
			}
			
		}
		input.close();
	}

}
