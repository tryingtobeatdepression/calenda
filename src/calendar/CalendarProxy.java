package calendar;

import date.Date;

public class CalendarProxy implements ICalendar {
	private CalendarService service;
	private static CalendarProxy instance;
	private CalendarProxy() {}

	public Boolean checkAccess() {
		System.out.println("Grant access?");
		return true;
	}

	public void setTime(String time) { service.setTime(time);}
	public static CalendarProxy getInstance() { return instance;}
}