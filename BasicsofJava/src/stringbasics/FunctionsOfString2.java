package stringbasics;

public class FunctionsOfString2 {
	public static void main(String[] args) {
		
		String s1 = "Work smart not hard";
		System.out.println(s1);
		
		//string replace
		String s2 = s1.replace('r','a');
		System.out.println(s2);
		
		//split string
		String[] s3 = s1.split(" ");
		for(String x : s3) {
			System.out.println(x);
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
