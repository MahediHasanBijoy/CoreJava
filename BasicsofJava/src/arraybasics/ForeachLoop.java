package arraybasics;
import java.util.*;
public class ForeachLoop {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] arr = new int[5];
		int i, sum=0;
		
		System.out.println("Enter 5 numbers: ");
		
		for(i=0; i<arr.length; i++) {
			arr[i] = input.nextInt(); 
		}
		
		//this is a foreach loop
		for(int x : arr) {
			System.out.println(x);
			sum += x;
		}
		System.out.println("sum = "+sum);
	}
}
