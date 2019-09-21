
public class Monthly extends Appointment {
	
	public Monthly(String description, int year, int month, int day) {
		super(description, year, month, day);
	}
	
	public boolean occursOn(int year, int month, int day) {
		if (year > getYear() && day == getDay()) {
			return true;
		}
		else if (year == getYear() && month >= getMonth() && day == getDay()) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
