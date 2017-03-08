import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		FileInputStream fStream = new FileInputStream("input.txt");
	    DataInputStream in = new DataInputStream(fStream);
	    BufferedReader buffReader = new BufferedReader(new InputStreamReader(in));
	    
	    List<Player> playersList =FileUtility.readFileData(buffReader);
	    
	    Collections.sort(playersList);
	    
	    FileUtility.writeDataToFile(playersList);
	}

}
