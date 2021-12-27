package date_template;

public class MakeEvent extends MakeDate {
	public MakeEvent() { super.type = DateType.EVENT; }
	public void eventStep() { System.out.println("Event Step!");}
}