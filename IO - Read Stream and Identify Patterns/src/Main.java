import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
   static int countString(String fileName,String query) throws IOException{
	   
		FileInputStream fStream = new FileInputStream(fileName);
	    DataInputStream in = new DataInputStream(fStream);
	    BufferedReader buffReader = new BufferedReader(new InputStreamReader(in));
	    int result=0;
	    String line = buffReader.readLine();
	    
	    while (line != null) {
	      int start = line.indexOf(query);
	      while (start != -1) {
	        result++;
	        start = line.indexOf(query, start+query.length());
	      }
	      line = buffReader.readLine();
	    }
	    buffReader.close();
	    in.close();
	    return result;
	}
   
   static void printFileContent(String fileName) throws IOException{
	   FileInputStream fStream = new FileInputStream(fileName);
	    DataInputStream in = new DataInputStream(fStream);
	    BufferedReader buffReader = new BufferedReader(new InputStreamReader(in));
	   
	    System.out.print("Given string is ");
	    String line = buffReader.readLine();
	    while (line != null) {
	    	System.out.println(line);
	    	line = buffReader.readLine();
	    }
	    buffReader.close();
	    in.close();
   }
	
	

	public static void main(String[] args) throws IOException {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of words");
		int noString = input.nextInt();
		ArrayList<String> strings = new ArrayList<String>(noString);
		input.nextLine();
		String fileName="team.txt";
		
		System.out.println("Enter the strings to be searched");
		for(int i=0;i<noString;i++)
			strings.add(input.nextLine());
		
		printFileContent(fileName);
		
		for(String string : strings){
			int count = countString(fileName, string.trim());
			System.out.println("Word:"+string+" Count:"+count);
		}
		input.close();	
   }
}
