import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws ParseException{
		Match obj = new Match();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Menu\n1.Match Date\n2.Match Venue\n3.Match Outcome");
		
		int choice = input.nextInt();
		input.nextLine();
		if(choice ==1){
			System.out.println("Enter the date of the match");
			String mdate = input.nextLine();
			SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
			obj.displayMatchDetails(format.parse(mdate.trim()));
		}else if(choice == 2){
			System.out.println("Enter venue of the match");
			String venue= input.nextLine();
			obj.displayMatchDetails(venue);
		}else if(choice == 3){
			System.out.println("Enter the winner team of the match");
			String winner = input.nextLine();
			System.out.println("Enter the number of runs");
			long runs = input.nextLong();
			obj.displayMatchDetails(winner, runs);
		}else
			System.out.println("Invalid input.");
		input.close();
	}

}
