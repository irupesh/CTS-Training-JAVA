import java.util.HashSet;
import java.util.Scanner;

public class Main {  
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int noPlayer=input.nextInt();
         input.nextLine();
        
        HashSet<String> playerName=new HashSet<>();
        for(int i=0;i<noPlayer;i++){
            playerName.add(input.nextLine());
        }
        
        System.out.println(playerName.size());
        input.close();
    }
}
