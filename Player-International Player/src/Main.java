import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	   Player obj;
       Scanner input = new Scanner(System.in);
		
		System.out.println("Enter player name ");
		String name = input.nextLine();
		System.out.println("Enter player country");
		String country = input.nextLine();
		System.out.println("Enter the Cap number");
		String capNumber = input.nextLine();
		System.out.println("Enter the number of test appearnace");
		long test = input.nextLong();
		System.out.println("Enter the number of ODI appearnace");
		long odi = input.nextLong();
		
		obj = new InternationalPlayer(name, country, capNumber, test, odi);
		obj.displayDetails();
		input.close();
	}

}
