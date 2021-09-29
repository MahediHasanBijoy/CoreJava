package arraybasics;
import java.util.*;

public class SortingArray {
	public static void main(String[] args) {
		
		int[] num = {10,-3,5,2,11};
		
		Arrays.sort(num);
		
		for(int i=0; i<5; i++) {
			System.out.print(num[i]+" ");
		}
	}
}
