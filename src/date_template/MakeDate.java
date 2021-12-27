package date_template;

import date.Date;

public class MakeDate {
	protected DateType type = DateType.DATE;
	public Date make() {
		Date date = new Date();
		switch (type) {
			case DATE: dateStep(); break;
			case EVENT: eventStep(); break;
			case MEETING: meetingStep(); break;
			case CONFERENCE: conferenceStep(); break;
		}
		return date;
	}
	protected void dateStep() { System.out.println("Date Step!");}
	protected void meetingStep() {}
	protected void eventStep() {}
	protected void conferenceStep() {}
}