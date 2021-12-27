package date_template;

public class MakeConference extends MakeDate {
	public MakeConference() { super.type = DateType.CONFERENCE; }
	public void conferenceStep() { System.out.println("Conference Step!");}
}