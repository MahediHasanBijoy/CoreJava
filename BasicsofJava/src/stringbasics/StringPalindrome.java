package stringbasics;

public class StringPalindrome {
	public static void main(String[] args) {
		String name = "abba";
		
		StringBuffer sb = new StringBuffer(name);
		
		String s2 = sb.reverse().toString();
		
		if(name.equals(s2))
			System.out.println("palindrome.");
		else
			System.out.println("not palindrome");
	}
}
