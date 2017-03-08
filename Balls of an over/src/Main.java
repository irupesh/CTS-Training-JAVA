import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		    String over;
		    System.out.println("Enter the over details:");
		 	Scanner input = new Scanner(System.in);
		 	over = input.nextLine();
		 	input.close();
		   	System.out.println("The over details is "+over);
	}

}
