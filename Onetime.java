
public class Onetime extends Appointment{
	
	public Onetime(String description, int year, int month, int day) {
		super(description, year, month, day);
	}
	
	public boolean occursOn(int year, int month, int day) {
		if (getYear() == year && getMonth() == month && getDay() == day) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
