import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MatchFileStore {
	
	static List<Match> obtainMatchFromFile(InputStreamReader ir ) throws IOException{
		BufferedReader br = new BufferedReader(ir);
		List<Match> result = new ArrayList<Match>();
		
		String line = br.readLine();
	    while (line != null) {
	    	String teamOne = line.substring(0, 5);
	    	String teamTwo = line.substring(5, 10);
	    	String venue = line.substring(10,30);
	    	String date = line.substring(30, line.length());
	    	Match obj = new Match(teamOne.trim(),teamTwo.trim(),venue.trim(),date.trim());
	    	result.add(obj);
	    	line = br.readLine();
	    }
	    br.close();
		return result;
	}

}
