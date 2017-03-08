
public class MembershipCard extends Card {
    private Integer rating;

	public MembershipCard(String holderName, String cardNumber, String expiryDate, Integer rating) {
		super(holderName, cardNumber, expiryDate);
		this.rating = rating;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}
    

    
    
}
