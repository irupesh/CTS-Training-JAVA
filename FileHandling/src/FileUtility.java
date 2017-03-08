import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileUtility {
	static List<Player> readData(BufferedReader br) throws IOException {
        List<Player> players = new ArrayList<Player>();
		
		String line = br.readLine();
	    while (line != null) {
	    	String[] playerDetail = line.split(",");
	    	Player obj = new Player(playerDetail[0], playerDetail[1], playerDetail[2]);
	    	players.add(obj);
	    	line = br.readLine();
	    }
	    br.close();
	    return players;
	}
}
