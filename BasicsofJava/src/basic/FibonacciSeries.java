package basic;
import java.util.*;
public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int first=0, second=1, n, i, fibo;
		
		System.out.println("Enter the size of fibonacci series: ");
		n = input.nextInt();
		input.close();
		
		System.out.print("fibonacci: "+first+" "+second+" ");
		
		for(i=2; i<n; i++) {
			fibo = first + second;
			first = second;
			second = fibo;
			System.out.print(fibo+" ");
		}
		
	}
}
