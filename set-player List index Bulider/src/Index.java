
public class Index implements Comparable<Index> {
	char ch;
	int count;
	
	public Index(char ch, int count) {
		super();
		this.ch = ch;
		this.count = count;
	}
	
	public char getCh() {
		return ch;
	}
	public void setCh(char ch) {
		this.ch = ch;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public int compareTo(Index o) {
		if(this.ch > o.ch)
			return 1;
		else if (this.ch < o.ch)
			return -1;
		else return 0;
		
	}

}
