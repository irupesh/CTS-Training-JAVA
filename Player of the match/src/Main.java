import java.util.TreeSet;
import java.util.Iterator;
import java.util.Scanner;
public class Main {

    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        input.nextLine();
        
        TreeSet<String> playerName=new TreeSet<>();
        for(int i=0;i<n;i++){
            playerName.add(input.nextLine());
        }
        
        Iterator<String>iterator=playerName.iterator();
        
        while(iterator.hasNext())
            System.out.println(iterator.next());
        input.close();
    }
}
