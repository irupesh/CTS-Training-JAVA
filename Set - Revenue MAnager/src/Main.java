import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	
	public static void main(String[] args){
		

		Scanner input = new Scanner(System.in);
		String choice;
		int total=0;
		TreeSet<Revenue> revenue = new TreeSet<Revenue>();
		
		do{
			System.out.println("Enter revenue category");
			String category = input.nextLine();
			System.out.println("Enter revenue amount");
			int amount = input.nextInt();
			input.nextLine();
			Revenue obj = new Revenue(category, amount);
			revenue.add(obj);
			System.out.println("Do you want to continue(yes/no):");
			choice = input.nextLine();
		}while(choice.equals("yes"));
		
		 Iterator<Revenue> iterator = revenue.descendingIterator();
		     
		   System.out.println("Top spending categories");
		   System.out.println(String.format("%-15s%-15s","Category", "Amount"));
		   
		   while (iterator.hasNext()){   
			  Revenue obj = iterator.next();
		      System.out.println(String.format("%-15s%-15s",obj.revenueCategory,  obj.amount));
		      total += obj.amount; 
		   }
		System.out.println("Total amount earned: "+total);

	}

}
