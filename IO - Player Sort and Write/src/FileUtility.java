import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileUtility {
	
	static List<Player> readFileData(BufferedReader br ) throws IOException{
		List<Player> players = new ArrayList<Player>();
		
		String line = br.readLine();
	    while (line != null) {
	    	String[] playerDetail = line.trim().split(",");
	    	Player obj = new Player(Integer.parseInt(playerDetail[0]), playerDetail[1], playerDetail[2], playerDetail[3],Integer.parseInt(playerDetail[4]));
	    	players.add(obj);
	    	line = br.readLine();
	    }
	    br.close();
	    return players;
	}
	
	static void writeDataToFile(List<Player> playerList) throws IOException{
		
		FileWriter file = new FileWriter("output.csv");
		String newLine = System.getProperty("line.separator");

		for(Player player : playerList){
			file.write(player.toString()+newLine);
		}

		file.close();
	}
}
