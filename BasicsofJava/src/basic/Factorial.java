package basic;
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int i, num, fact=1;
		System.out.println("Enter a number: ");
		num  = input.nextInt();
		input.close();
		
		for(i=1; i<=num; i++)
		{
			fact= fact*i;
		}
		
		System.out.println("factorial of "+num+"= "+fact);
		

	}

}
