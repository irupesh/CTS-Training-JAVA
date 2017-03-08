
public class Message {
    String from;
    String to;
    String message;
	public Message(String from, String to, String message) {
		super();
		this.from = from;
		this.to = to;
		this.message = message;
	}
	
	@Override
	public String toString() {
		return "Message sent successfully\nsender : " + from + "\nreceiver : " + to + "\nmessage : " + message;
	}
	
	
	
}
