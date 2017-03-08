import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter the number of bowlers");
    
    int noBowler=input.nextInt();
    input.nextLine();
    
    TreeSet<String> bowlers=new TreeSet<>();
    
    for(int i=0;i<noBowler;i++)
        bowlers.add(input.nextLine());
    
    Iterator<String>iterator = bowlers.iterator();
    System.out.println("Players list in ascending order");
    
    while(iterator.hasNext())
        System.out.println(iterator.next());
    input.close();
    }
}
