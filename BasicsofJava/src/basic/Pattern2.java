package basic;
import java.util.*;
public class Pattern2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n, row, col;
		
		System.out.println("Enter number of line: ");
		n = input.nextInt();
		input.close();
		
		for(row=n; row>=1; row--) {
			for(col=1; col<=row; col++) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
		
		
		
	}
	
	
	
	
	
}
