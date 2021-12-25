package calendar;

import date.Date;

import java.util.Calendar;
import java.util.List;

public class CalendarService implements ICalendar {
	public void setTime(String time) {
		System.out.println("Next Date: " + time);
	}
}