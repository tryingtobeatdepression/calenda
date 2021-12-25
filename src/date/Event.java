package date;

public class Event extends Date {

	public Event() {
		super.dateInfo = "Event!";
	}

	public void displayDateInfo() {
		System.out.println(dateInfo);
	}

}