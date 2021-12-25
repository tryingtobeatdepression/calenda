package date;

public class Meeting extends Date {

	public Meeting() {
		super.dateInfo = "Meeting!";
	}
	public void displayDateInfo() {
		System.out.println(dateInfo);
	}

}