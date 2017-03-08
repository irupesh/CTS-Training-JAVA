import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Delivery obj = new Delivery();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Menu\n1.Player details of the delivery\n2.Run details of the delivery");
		int choice = input.nextInt();
		
		if(choice ==1){
			input.nextLine();
			System.out.println("Enter the bowler name");
			String bowler = input.nextLine();
			System.out.println("Enter the batsman name");
			String batsman = input.nextLine();
			obj.displayDeliveryDetails(bowler, batsman);
		}else if(choice == 2){
			System.out.println("Enter the number of runs");
			long runs = input.nextInt();
			obj.displayDeliveryDetails(runs);
		}else
			System.out.println("Invalid input.");
		input.close();

	}

}
