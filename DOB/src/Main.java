import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws ParseException{
		String idob;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the DOB:");
		idob = input.nextLine();
		
		SimpleDateFormat orginal = new SimpleDateFormat("MM/dd/yyyy");
		SimpleDateFormat target = new SimpleDateFormat("MMMM dd,yyyy");
		Date result = orginal.parse(idob);
		idob = target.format(result);
		System.out.println("Dhoni was born on "+idob);
	}

}
