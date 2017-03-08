import java.util.Arrays;

public class SortPoints extends Thread  {
	String matchType;
	String pointsString;
	Integer[] scores;
	
	public SortPoints(String matchType, String pointsString) {
		super();
		
		String[] str = pointsString.trim().split(",");
	    scores = new Integer[str.length];
	    for (int i=0; i < str.length; i++) {
	        scores[i] = Integer.parseInt(str[i]);
	    }
	    
		this.matchType = matchType;
		this.pointsString = pointsString;
	}
	
	Integer[] getScores(){
		return scores;
	}
	
	@Override
	public void run(){
		Arrays.sort(scores);
	}
}
