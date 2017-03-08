public class Delivery {
	public Long over;
	public Long ball;
	public Long runs;
	public String batsman;
	public String bowler;
	public String nonStriker;
	
	void displayDeliveryDetails(){
		System.out.println("Delivery Details :");
	 	System.out.println("Over : "+over);
	 	System.out.println("Ball : "+ball);
	 	System.out.println("Runs : "+runs);
	 	System.out.println("Batsman : "+batsman);
	 	System.out.println("Bowler : "+bowler);
	 	System.out.println("NonStriker : "+nonStriker);
	}
}
