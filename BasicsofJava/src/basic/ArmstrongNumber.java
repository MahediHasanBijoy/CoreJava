package basic;
import java.util.*;

public class ArmstrongNumber {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num, rem, count=0, temp, sum=0;
		
		System.out.println("Enter a number: ");
		
		num = input.nextInt();
		input.close();
		
		temp = num;
		while(temp!=0) {
			temp = temp/10;
			count++;
		}
		temp = num;
		while(num!=0) {
			rem = num % 10;
			sum = sum + calculatePower(rem, count) ;
			num = num / 10;
		}
		
		if(sum == temp)
			System.out.println("Armstrong number.");
		else
			System.out.println("Not a Armstrong number!");
		
		
	}
	
	public static int calculatePower(int n, int m) {
		
		int i, sum=1;
		for(i=1; i<=m; i++)
		{
			sum = sum*n;
		}
		return sum;
	}
}
