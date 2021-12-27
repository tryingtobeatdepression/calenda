package date_template;

import date.Date;
import date.Event;
import date.Meeting;

public class MakeDate {
	private Date date = null;
	protected DateType type = DateType.DATE;
	public Date make() {
		Date date = null;
		switch (type) {
			case DATE: date = new Date(); dateStep(); break;
			case EVENT: date = new Event(); eventStep(); break;
			case MEETING: date = new Meeting(); meetingStep(); break;
			case CONFERENCE: date = new Meeting(); conferenceStep(); break;
		}
		return date;
	}
	protected void dateStep() { System.out.println("Date Step!");}
	protected void meetingStep() {}
	protected void eventStep() {}
	protected void conferenceStep() {}
}