import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Calc obj = new Calc();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the base value");
		int base = input.nextInt();
		System.out.println("Enter the power value");
		int power = input.nextInt();
		System.out.println("Exponential : "+obj.exponential(base,power));

	}

}
