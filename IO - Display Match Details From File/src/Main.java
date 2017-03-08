import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		
		InputStream input = new FileInputStream("matches.txt");
		InputStreamReader inputStreamReader = new InputStreamReader(input);
		int i=1;
		List<Match> matches =  MatchFileStore.obtainMatchFromFile(inputStreamReader);

		System.out.println("The Match Details are :");
		for(Match match : matches){
			match.displayMatch(match, i++);
		}
		inputStreamReader.close();
		
	}

}
