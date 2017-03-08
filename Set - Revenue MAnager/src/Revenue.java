
public class Revenue implements Comparable<Revenue> {
	String revenueCategory;
	int amount;
	
	public Revenue(String revenueCategory, int amount) {
		super();
		this.revenueCategory = revenueCategory;
		this.amount = amount;
	}
	public String getRevenueCategory() {
		return revenueCategory;
	}
	public void setRevenueCategory(String revenueCategory) {
		this.revenueCategory = revenueCategory;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	@Override
	public int compareTo(Revenue o ) {
		if(this.getAmount() > o.getAmount())
			return 1;
		else if (this.getAmount() < o.getAmount())
			return -1;
		else return 0;
	}

}
