import java.util.Scanner;

class Wicket{
	Long over;
	Long ball;
	String wicketType;
	String playerName;
	String bowlerName;
	
	public Long getOver() {
		return over;
	}
	public void setOver(Long over) {
		this.over = over;
	}
	public Long getBall() {
		return ball;
	}
	public void setBall(Long ball) {
		this.ball = ball;
	}
	public String getWicketType() {
		return wicketType;
	}
	public void setWicketType(String wicketType) {
		this.wicketType = wicketType;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getBowlerName() {
		return bowlerName;
	}
	public void setBowlerName(String bowlerName) {
		this.bowlerName = bowlerName;
	}	
}


public class Main {
	
 public static void main(String args[]){
		 
		 Wicket obj = new Wicket();

			
			 	Scanner input = new Scanner(System.in);
			 	
			 	System.out.println("Enter the over");
			 	obj.setOver(input.nextLong());
			 	
			 	System.out.println("Enter the ball");
			 	obj.setBall(input.nextLong());
			 	input.nextLine();
			 	
			 	System.out.println("Enter the wicket type");
			 	obj.setWicketType(input.nextLine()); 
			 	
			 	System.out.println("Enter the player name");
			 	obj.setPlayerName(input.nextLine());
			 	
			 	System.out.println("Enter the bowler name");
			 	obj.setBowlerName(input.nextLine());
			 	
			 	System.out.println("Wicket Details");
			 	System.out.println("Over : "+obj.getOver());
			 	System.out.println("Ball : "+obj.getBall());
			 	System.out.println("Wicket Type : "+obj.getWicketType());
			 	System.out.println("Player Name : "+obj.getPlayerName());
			 	System.out.println("Bowler Name : "+obj.getBowlerName());
			 	input.close();
			
		}

}
