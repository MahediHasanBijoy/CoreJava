package dateandtime;
import java.util.*;
import java.text.*;
public class DateDemo {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println("date = "+date);
		
		//formatting date
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY");
		String currentDate = dateFormat.format(date);
		System.out.println("Current Date = "+ currentDate);
		
		
	}
}
