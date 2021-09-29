package stringbasics;

public class StringPalindrom2 {
	public static void main(String[] args) {
		String s1 = "abbas";
		
		int i=0, j= s1.length()-1, chk=0;
		
		while(i<j) {
			if(s1.charAt(i)!=s1.charAt(j))
			{
				chk = 1;
				break;
			}
			i++;
			j--;
		}
		if(chk==1)
			System.out.println("Not palindrome");
		else
			System.out.println("Palindrome");
	}
}
