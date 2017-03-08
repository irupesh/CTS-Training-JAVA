import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("From Number :");
		String from = input.nextLine();
		System.out.println("To Number :");
		String to = input.nextLine();
		System.out.println("Text Message :");
		String message = input.nextLine();
		
		Message obj1 = new Message(from,to,message);
		System.out.println(obj1.toString());
		input.close();

	}

}
