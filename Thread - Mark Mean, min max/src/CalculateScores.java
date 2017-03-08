import java.util.Arrays;

public class CalculateScores implements Runnable {
	String matchType;
	String scoreString;
	Integer[] scores;
	double meanScore;
	int minScore;
	int maxScore;
	public CalculateScores(String matchType, String scoreString) {
		super();
		
		String[] str = scoreString.trim().split(",");
	    scores = new Integer[str.length];
	    for (int i=0; i < str.length; i++) {
	        scores[i] = Integer.parseInt(str[i]);
	    }
		
		this.matchType = matchType;
		this.scoreString = scoreString;
	}
	
	public String getMatchType() {
		return matchType;
	}
	public void setMatchType(String matchType) {
		this.matchType = matchType;
	}
	public String getScoreString() {
		return scoreString;
	}
	public void setScoreString(String scoreString) {
		this.scoreString = scoreString;
	}
	public Integer[] getScores() {
		return scores;
	}
	public void setScores(Integer[] scores) {
		this.scores = scores;
	}
	public double getMeanScore() {
		return meanScore;
	}
	public void setMeanScore(double meanScore) {
		this.meanScore = meanScore;
	}
	public int getMinScore() {
		return minScore;
	}
	public void setMinScore(int minScore) {
		this.minScore = minScore;
	}
	public int getMaxScore() {
		return maxScore;
	}
	public void setMaxScore(int maxScore) {
		this.maxScore = maxScore;
	}
	
	@Override
	public void run(){
		Arrays.sort(scores);
		minScore = scores[0];
		maxScore = scores[scores.length-1];
		int total=0;
		for(Integer score:scores)
			total+=score;
		meanScore = total/(double)scores.length;
	}
	
	
}
