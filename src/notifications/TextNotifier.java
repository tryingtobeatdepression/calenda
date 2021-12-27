package notifications;

public class TextNotifier implements Notifier {

	private String message;
	public TextNotifier(String message) { this.message = message;}

	public String getMessage() {return this.message;}
	public void setMessage(String message) {this.message = message;}

	public void notifyy() { System.out.println("Text Notifier: " + message);}
}