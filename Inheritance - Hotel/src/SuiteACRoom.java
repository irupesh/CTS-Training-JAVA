
public class SuiteACRoom extends HotelRoom{
	private int ratePerSqFeet;
	
     public SuiteACRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		 ratePerSqFeet = 15;
	}
     public void setRatePerSqFeet(int ratePerSqFeet) {
 		this.ratePerSqFeet = ratePerSqFeet;
 	}
    
     int getRatePerSqFeet(){
 		if(hasWifi)
 			return ratePerSqFeet + 2;
 		return ratePerSqFeet;
 	}
     int calculateTariff(){
 		return numberOfSqFeet*this.getRatePerSqFeet();
 	}

	
}