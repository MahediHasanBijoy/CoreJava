package basic;
import java.util.*;

public class ReverseANumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num, rem, sum = 0;
		
		System.out.println("Enter a number: ");
		num = input.nextInt();
		
		while(num!=0) {
			rem = num % 10;
			sum = sum*10 + rem;
			num = num / 10;
		}
		
		System.out.println("Reverse Number is: "+sum);
		
		input.close();
	}
}
