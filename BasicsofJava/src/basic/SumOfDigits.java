package basic;
import java.util.Scanner;
public class SumOfDigits {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num, sum=0, rem;
		
		System.out.println("Enter a number: ");
		num = input.nextInt();
		
		while(num!=0) {
			rem = num % 10;
			sum = sum + rem;
			num = num / 10;
		}
		
		System.out.println("Sum of digits= "+sum);
		
		input.close();
		
	}
}
