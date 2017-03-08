import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the input string");
		String sentence = input.nextLine();
		LetterSequence obj = new LetterSequence(sentence);
		TreeMap<Character,Integer> result = obj.computeFrequency();
		obj.displayLetterFrequency(result);
		input.close();
	}

}
