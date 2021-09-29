package stringbasics;

public class StringDemo {
	public static void main(String[] args) {
		String s1 = "Mahedi Hasan";
		String s2 = new String("Mahedi Hasan");
		
		System.out.println("s1 = "+s1);
		System.out.println("s2 = "+s2);
		
		int len = s1.length();
		
		System.out.println("len of s1 = "+len);
		
		if(s1.equals(s2)) {
			System.out.println("Equal");
		}
		else
			System.out.println("Not equal");
	}
}
