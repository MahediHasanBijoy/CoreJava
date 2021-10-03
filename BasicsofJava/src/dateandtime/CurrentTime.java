package dateandtime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CurrentTime {
	public static void main(String[] args) {
		//time
		LocalTime current = LocalTime.now();
		System.out.println(current);
		
		//formatting time
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
		String time = current.format(formatter);
		System.out.println(time);
		
	}
}
