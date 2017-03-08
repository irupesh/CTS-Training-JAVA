import java.util.Calendar;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) throws ParseException{
		
			 	Scanner input = new Scanner(System.in);
			 	int month,year,day;
			 	System.out.println("Enter year in Integer");
			 	year = input.nextInt();
			 	
			 	System.out.println("Enter Month in Integer");
			 	month = input.nextInt();
			 	
			 	System.out.println("Enter date in Integer");
			 	day = input.nextInt();
			    input.close();
			    
			    String temp = month+"/"+day+"/"+year;
			    SimpleDateFormat layout = new SimpleDateFormat("MM/dd/yyyy");
			    Date date = layout.parse(temp);
			    
			    Calendar date1 = Calendar.getInstance();
			    date1.setTime(date);
			    Calendar date2 = Calendar.getInstance();
			    date2.setTime(date);
			    
    
			    while (date1.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY) {
			        date1.add(Calendar.DATE, 1);
			    }

			    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			    System.out.println("Next Saturday : "+sdf.format(date1.getTime()));
			   
			    while (date2.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY) {
			        date2.add(Calendar.DATE, -1);
			    }
			    
			    System.out.println("Previous Saturday : "+sdf.format(date2.getTime()));
	    
		}
}
