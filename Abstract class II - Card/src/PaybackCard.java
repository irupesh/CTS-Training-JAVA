
public class PaybackCard extends Card{
    
	private Integer pointsEarned;
    private Double totalAmount;
	public PaybackCard(String holderName, String cardNumber, String expiryDate, Integer pointsEarned,
			Double totalAmount) {
		super(holderName, cardNumber, expiryDate);
		this.pointsEarned = pointsEarned;
		this.totalAmount = totalAmount;
	}
	public Integer getPointsEarned() {
		return pointsEarned;
	}
	public void setPointsEarned(Integer pointsEarned) {
		this.pointsEarned = pointsEarned;
	}
	public Double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

    
    
    
    
}
