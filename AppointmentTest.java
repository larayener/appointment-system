import java.util.Scanner;

public class AppointmentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter a date so we can check whether or not you have an appointment.");
		Onetime o = new Onetime("broken leg", 2019, 4, 21);
		Daily d = new Daily("walk dog", 2019, 7, 23);
		Monthly m = new Monthly("call aunt", 2019, 5, 4);
		Scanner s = new Scanner(System.in);
		Appointment[] yay = new Appointment[5];
		yay[0] = o;
		yay[1] = d;
		yay[2] = m;
		yay[3] = new Daily("brush teeth", 2000, 8, 21);
		yay[4] = new Monthly("talk to therapist", 2006, 4, 23);
		String date = s.nextLine();
		String[] a = date.split("-");
		int useryear = Integer.parseInt(a[0]);
		int usermonth = Integer.parseInt(a[1]);
		int userday = Integer.parseInt(a[2]);
		for ( Appointment ab : yay ) {
			if (ab.occursOn(useryear, usermonth, userday)) {
				System.out.println(ab.getDescription());
			}
		}
	}

}
