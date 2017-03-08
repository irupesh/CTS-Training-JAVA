
public class InternationalPlayer extends Player {
	private String capNumber;
	private long noOfTestAppearance;
	private long noOfODIAppearance;
	public InternationalPlayer(String name, String country, String capNumber, long noOfTestAppearance,
			long noOfODIAppearance) {
		super(name, country);
		this.capNumber = capNumber;
		this.noOfTestAppearance = noOfTestAppearance;
		this.noOfODIAppearance = noOfODIAppearance;
	}
	void displayDetails(){		
		System.out.println("Player Details:");
		System.out.println("Player name : "+name);
		System.out.println("Country : "+country);
		System.out.println("Cap number : "+capNumber);
		System.out.println("Number of test appearnace : "+noOfTestAppearance);
		System.out.println("Number of ODI appearnace : "+noOfODIAppearance);
	}

}
