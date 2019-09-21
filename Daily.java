
public class Daily extends Appointment {
	
	public Daily(String description, int year, int month, int day) {
		super(description, year, month, day);
	}
	
	public boolean occursOn(int year, int month, int day) {
		if (year > getYear()) {
			return true;
		}
		else if (year == getYear() && month > getMonth()) {
			return true;
		}
		else if (year == getYear() && month == getMonth() && day >= getDay()) {
			return true;
		}
		else {
			return false;
		}
	}

}
