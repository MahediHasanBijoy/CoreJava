package arraybasics;

import java.util.*;




public class MaxAndMinOfArray {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		int i, max, min;
		
		System.out.print("Enter 5 numbers: ");
		for(i=0; i<arr.length; i++) {
			arr[i] = input.nextInt();
		}
		input.close();
		min = arr[0];
		max = arr[0];
		for(i=1; i<arr.length; i++) {
			if(arr[i]<min)
				min = arr[i];
			if(arr[i]>max)
				max = arr[i];
		}
		
		System.out.println("Minimum = "+min+"\nMax = "+max);
		
		
		
		
		
	}
}
