package date;

import java.util.ArrayList;
import java.util.List;

public class Date implements IDate {
	protected List<IDate> dates = new ArrayList<>();
	protected String dateInfo = "Date Concrete Class!";

	public void displayDateInfo() {
		System.out.println(dateInfo);
		for (IDate date: dates)
			date.displayDateInfo();
	}

	public void addPartialDate(Date date) { dates.add(date);}

	public void removePartialDate(Date date) { dates.remove(date);}
}