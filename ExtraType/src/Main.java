import java.util.Scanner;

public class Main {
	
	public static void main(String args[]){
		
		 ExtraType obj = new ExtraType();

			
		 	Scanner input = new Scanner(System.in);
		 	
		 	System.out.println("Enter the extratype details");
		 	String detail = input.nextLine();
		 	
		 	String details[] = detail.split("#");
		 	
		 	obj.setName(details[0]);
		 	obj.setRuns(Long.parseLong(details[1]));
		 	
		 	System.out.println("ExtraType Details");
		 	System.out.println("Extra Type:"+obj.getName());
		 	System.out.println("Runs:"+obj.getRuns());
		 	input.close();
		 	
	}

}
