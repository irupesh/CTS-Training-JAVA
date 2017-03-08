import java.util.ArrayList;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		input.close();
		char[] nameChar = name.toCharArray();
		
		ArrayList<Character> chars = new ArrayList<Character>();
		
		for(int i=nameChar.length-1;i>=0;i--)
			chars.add(nameChar[i]);
			
		for(Character unit : chars)
			System.out.println(unit);
		
	}

}
