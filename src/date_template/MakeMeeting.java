package date_template;

public class MakeMeeting extends MakeDate {
	public MakeMeeting() { super.type = DateType.MEETING; }
	public void meetingStep() {System.out.println("Meeting Step!");}
}