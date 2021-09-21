package basic;
import java.util.*;



public class VowelConsonent {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		char ch;
		System.out.println("enter a character: ");
		//take char input
		ch = input.next().charAt(0);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
				ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		{
			System.out.println("this is a vowel.");
		}
		else
		{
			System.out.println("this is a consonent.");
		}
		
	}
}
