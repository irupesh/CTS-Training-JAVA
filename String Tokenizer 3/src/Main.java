import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		String sentence;
		
		 	Scanner input = new Scanner(System.in);
		 	sentence = input.nextLine();
		 	String sentence_new = sentence.trim().replaceAll(" +", " ");	
		    String[] words = sentence_new.split("\\s+"); 	
		    for(String word:words)
		    	System.out.println(word);
		    input.close();
		
	}

}
