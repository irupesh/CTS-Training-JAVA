import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		int noMatches;
		boolean flag = false;
	
		Scanner input = new Scanner(System.in);
		noMatches = input.nextInt();
		input.nextLine();
		ArrayList<String> info = new ArrayList<String>(noMatches);
		
		for(int i=0;i<noMatches;i++)
			info.add(input.nextLine());
		input.close();
		
		for(String details : info){
			String[] detail = details.trim().split("-");
	
			if(detail[1].equals("0") && detail[2].equals("0")){
				flag = true;
				System.out.println(detail[0]);
			}
		}
		
		if(!flag)
		System.out.printf("No player has scored a duck");
	}

}