import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Main {

public static void main(String[] args) throws IOException {
		
	    FileInputStream fStream = new FileInputStream("input.txt");
	    DataInputStream in = new DataInputStream(fStream);
	    BufferedReader buffReader = new BufferedReader(new InputStreamReader(in));
		int i=1;
		List<Player> players =  FileUtility.readData(buffReader);

		for(Player player : players){
			System.out.println("Player "+(i++));
			System.out.println(player.getName()+" "+player.getTeam()+ " "+player.getSkill());
		}
		buffReader.close();
		
	}

}
