package stringbasics;

public class FunctionsOfString {
	public static void main(String[] args) {
		String country = "Bangladesh is my country";
		System.out.println(country);
		
		char ch = country.charAt(0);
		System.out.println("character at 0th position: "+ch);
		
		//return ASCII value
		int value = country.codePointAt(0);
		System.out.println("ASCII value of 0th index: "+value);
		
		// return position of a character
		int pos = country.indexOf('n');
		System.out.println("position of 'n' is = "+pos);
		
		pos = country.lastIndexOf('n');
		System.out.println("position of last 'n' = "+pos);
		
		//to remove white space
		String s1 = "   Hello    world  ";
		String s3 = s1.trim();
		System.out.println(s3);
		
	}
}
