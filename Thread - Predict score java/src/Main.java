import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter range of numbers");
		int start = input.nextInt();
		int end = input.nextInt();
		
		Scores even = new Scores("EVEN",start,end);
		Scores odd = new Scores("ODD",start,end);
		
		odd.start();
		odd.join();
		
		even.start();
		even.join();
		
		System.out.println("Odd numbers in given range");
		odd.display();
		System.out.println("");
		System.out.println("Even numbers in given range");
		even.display();
		
		input.close();
	}

}
