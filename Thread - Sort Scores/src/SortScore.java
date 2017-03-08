import java.util.Arrays;

public class SortScore extends Thread  {
	String matchType;
	String scoreString;
	Integer[] scores;
	
	public SortScore(String matchType, String scoreString) {
		super();
		
		String[] str = scoreString.trim().split(",");
	    scores = new Integer[str.length];
	    for (int i=0; i < str.length; i++) {
	        scores[i] = Integer.parseInt(str[i]);
	    }
	    
		this.matchType = matchType;
		this.scoreString = scoreString;
	}
	
	Integer[] getScores(){
		return scores;
	}
	
	@Override
	public void run(){
		Arrays.sort(scores);
	}
}
