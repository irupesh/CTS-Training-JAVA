
public class Delivery {

	void displayDeliveryDetails(String bowler,String batsman) {
		String[] tbowler = bowler.trim().split("\\s+");
		String[] tbatsman = batsman.trim().split("\\s+");
		System.out.println("Bowler : "+tbowler[1]);
		System.out.println("Batsman : "+tbatsman[1]);
	}
	
	void displayDeliveryDetails(Long runs){
		System.out.println("Number of runs scored in the delivery : "+runs);
		
		if(runs == 6)
			System.out.println("It is a Sixer.");
		else if(runs == 4)
			System.out.println("It is a Boundary.");
	}
}
