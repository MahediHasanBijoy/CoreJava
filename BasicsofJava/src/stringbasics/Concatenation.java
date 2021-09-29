package stringbasics;

public class Concatenation {
	public static void main(String[] args) {
		String firstName = "Mahedi";
		String lastName = " Hasan";
		//Concatenation
		String fullName = firstName + lastName;
		
		System.out.println("Full Name= "+fullName);
		
		// concatenate using string function
		fullName = firstName.concat(lastName);
		System.out.println("fullname = "+fullName);
		
		//converting to uppercase
		String upperCase = fullName.toUpperCase();
		System.out.println("Uppercase name: "+upperCase);
		
		String lowerCase = fullName.toLowerCase();
		System.out.println("Lowercase name: "+lowerCase);
		
		//starts with a pattern
		boolean b = firstName.startsWith("Ma");
		System.out.println(b);
		
		//ends with a pattern
		b = lastName.endsWith("an");
		System.out.println(b);
		
		//array of strings
		String[] names = {"bijoy", "sumaia", "bristy", "mahedi", "hasan"};
		
		for(String x : names) {
			System.out.println(x);
		}
		
		
		
	}

}
