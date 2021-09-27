package arraybasics;
import java.util.*;
public class SumAndAvg {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sum=0;
		float avg;
		int[] arr = new int[30];
		
		System.out.println("Enter 5 numbers: ");
		for(int i=0; i<5; i++) {
			arr[i] = input.nextInt();
		}
		input.close();
		
		for(int i=0; i<5; i++) {
			sum = sum + arr[i];
		}
		System.out.println("Sum = "+sum);
		
		avg = (float)sum/5;
		System.out.println("Avg = "+avg);
		
	}
	

}
