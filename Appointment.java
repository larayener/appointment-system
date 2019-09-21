
public abstract class Appointment {
	private String description;
	private int year;
	private int month;
	private int day;
	
	public Appointment(String description, int year, int month, int day) {
		this.description = description;
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public abstract boolean occursOn(int year, int month, int day);
	
	public int getYear() {
		return year;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getDay() {
		return day;
	}
	
	public String getDescription() {
		return description;
	}

}
