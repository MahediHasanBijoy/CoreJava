package basic;
import java.util.*;
public class Patter1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n, row=1, col=1;
		
		System.out.println("Enter line number: ");
		n = input.nextInt();
		input.close();
		
		for(row=1; row<=n; row++) {
			for(col=1; col<=row; col++) {
				System.out.print(col+" ");
			}
			System.out.println();

		}
		
		
	}
}
