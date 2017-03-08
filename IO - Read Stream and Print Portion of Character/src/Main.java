import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		 FileReader fr=new FileReader("outcome.txt");    
         BufferedReader br=new BufferedReader(fr);    
		 Scanner input = new Scanner(System.in);
		
		 int start = input.nextInt();
		 int end = input.nextInt();
         int count =start;
         int i; 
         br.skip(start-1);
         while((i=br.read())!=-1){ 
        	 if(count == (end+1))
        		 break;
        	  System.out.print((char)i);
              count++;
         }  
         br.close();    
         fr.close(); 
         input.close();
	}

}
