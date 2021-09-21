package basic;
import java.util.*;
public class SwitchCase {
	public static void main(String[] args)
	{
		Scanner input= new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num= input.nextInt();
		
		switch(num) {
		case 10: 
			System.out.println("number= "+num);
			break;
		case 20:
			System.out.println("number= "+num);
			break;
		case 30: 
			System.out.println("number= "+num);
			break;
		default:
			System.out.println("default value is none!");
		}
		
		
	}
}
