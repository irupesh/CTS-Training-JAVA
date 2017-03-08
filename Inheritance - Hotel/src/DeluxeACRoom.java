
public class DeluxeACRoom extends DeluxeRoom {

	public DeluxeACRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi, int ratePerSqFeet) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi, ratePerSqFeet);
	}

	public DeluxeACRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		this.ratePerSqFeet = 12;
	}
	
	int getRatePerSqFeet(){
		return 12;
	}
	
	int calculateTariff(){
		return numberOfSqFeet*this.getRatePerSqFeet();
	}

}
