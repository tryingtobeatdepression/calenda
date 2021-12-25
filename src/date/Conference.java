package date;

public class Conference extends Date {

	public Conference() {
		super.dateInfo = "Conference!";
	}

	public void displayDateInfo() {
		System.out.println(dateInfo);
		for(IDate date: super.dates)
			date.displayDateInfo();
	}

}