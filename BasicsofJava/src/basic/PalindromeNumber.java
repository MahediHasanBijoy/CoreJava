package basic;
import java.util.*;
public class PalindromeNumber {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num, temp, sum=0, rem;
		
		System.out.println("Enter a number: ");
		num = input.nextInt();
		
		temp = num;
		
		while(num!=0) {
			
			rem = num%10;
			sum = sum * 10 + rem;
			num = num / 10;
		}
		
		if(sum==temp)
			System.out.println("Palindrome....");
		else
			System.out.println("Not a Palindrome!");
		
		
		
		
		
		input.close();
	}

}
