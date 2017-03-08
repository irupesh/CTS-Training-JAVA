import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		ArrayList<TitleCaseThread> info = new ArrayList<TitleCaseThread>();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of lines in the summary");
		int number = input.nextInt();
		input.nextLine();
		
		for(int i=0;i<number;i++){
			String string = input.nextLine();
			TitleCaseThread obj = new TitleCaseThread(string);
			info.add(obj);
		}
		
		for(TitleCaseThread title:info){
			Thread t1 = new Thread(title);
			t1.start();
			t1.join();
		}
		
		int count = 1;
		for(TitleCaseThread title:info)
			System.out.println("Sentence "+ (count++) +" : "+title.getModifiedSummary());
		
		input.close();
	}

}
