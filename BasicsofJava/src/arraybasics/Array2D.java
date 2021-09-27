package arraybasics;
import java.util.*;
public class Array2D {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[][] arr = new int[2][3];
		
		System.out.print("Enter numbers: ");
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				arr[i][j] = input.nextInt();
			}
		}
		
		System.out.println("Output numbers: ");
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
