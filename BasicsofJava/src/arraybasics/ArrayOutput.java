/*
 * 0
 * 1 2
 * 3 4 5
 * 6 7 8 9
 * 
 */



package arraybasics;
import java.util.*;

public class ArrayOutput {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[][] arr= new int[4][4];
		
		int row, col;
		
		System.out.println("Enter numbers: ");
		for(row=0; row<4; row++) {
			for(col=0; col<row+1; col++) {
				arr[row][col] = input.nextInt();
			}
		}
		
		
		for(row=0; row<4; row++) {
			for(col=0; col<row+1; col++) {
				System.out.print(arr[row][col]+" ");
			}
			System.out.println();
		}
		
		
		
		
		
	}
}
