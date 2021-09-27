package basic;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int num, i, count=0;
		
		
		System.out.println("Enter a positive number: ");
		num= input.nextInt();
		input.close();
		
		for(i=2; i<num; i++) {
			if(num%i==0)
				count++;
		}
		if(count==0)
			System.out.println("this number is prime....");
		else
			System.out.println("this is not a prime number....");
		
		
	}
}
