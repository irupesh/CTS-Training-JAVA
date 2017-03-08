import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		double strikeRate;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the strike rate:");
		strikeRate = input.nextDouble();
	     DecimalFormat layout = new DecimalFormat("##.##");
	     System.out.println("The Strike rate of Dhoni is "+layout.format(strikeRate));
		
	}
}
