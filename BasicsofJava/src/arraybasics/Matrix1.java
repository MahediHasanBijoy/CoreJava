/*
	Addition of two matrix
 */


package arraybasics;
import java.util.*;


public class Matrix1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[][] A = new int[2][3];
		int[][] B = new int[2][3];
		
		int row, col;
		
		System.out.println("Enter elements for A matrix: ");
		for(row=0; row<2; row++) {
			for(col=0; col<3; col++) {
				System.out.printf("A[%d][%d] = ", row, col);
				A[row][col] = input.nextInt();
			}
		}
		
		System.out.println("Enter elements for B matrix: ");
		for(row=0; row<2; row++) {
			for(col=0; col<3; col++) {
				System.out.printf("B[%d][%d] = ", row, col);
				B[row][col] = input.nextInt();
			}
		}
		
		//Printing A matrix
		System.out.println();
		System.out.print("A = ");
		for(row=0; row<2; row++) {
			for(col=0; col<3; col++) {
				System.out.print("\t"+A[row][col]+" ");
			}
			System.out.println();
		}
		
		//Printing B matrix
		System.out.println();
		System.out.print("B = ");
		for(row=0; row<2; row++) {
			for(col=0; col<3; col++) {
				System.out.print("\t"+B[row][col]+" ");
			}
			System.out.println();
		}

		
		//Sum of two matrix
		System.out.print("\nSum = ");
		for(row=0; row<2; row++) {
			for(col=0; col<3; col++) {
				System.out.print("\t"+(A[row][col]+B[row][col]));
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
	}
}
