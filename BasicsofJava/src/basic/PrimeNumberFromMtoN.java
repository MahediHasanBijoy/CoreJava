package basic;
import java.util.*;
public class PrimeNumberFromMtoN {
	public static void main(String[] args)
	{
		Scanner input= new Scanner(System.in);
		
		int m,n,i,count=0;
		System.out.println("Enter first number: ");
		m= input.nextInt();
		System.out.println("Enter second number: ");
		n= input.nextInt();
		
		while(m<=n)
		{
			if(m==1)
				count++;
			for(i=2; i<m; i++)
			{
				if(m%i==0)
				{
					count++;
					break;
				}
			}
			if(count==0)
				System.out.println(m);
			m++;
			count=0;
		}
		
	}
}
