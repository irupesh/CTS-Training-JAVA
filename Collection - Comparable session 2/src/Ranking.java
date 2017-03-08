
public class Ranking implements Comparable<Ranking> {
	String name;
	Long score;
	
	public Ranking(String name, long score) {
		super();
		this.name = name;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getScore() {
		return score;
	}
	public void setScore(Long score) {
		this.score = score;
	}

	@Override
	public int compareTo(Ranking o) {
		return o.getScore().compareTo(this.getScore());		
	}

}
