package arraybasics;

import java.util.*;

public class DemoArrayList {
	public static void main(String[] args) {
		
		ArrayList<Integer> myNumbers = new ArrayList<Integer>();
		
		//adding elements
		myNumbers.add(10);
		myNumbers.add(20);
		myNumbers.add(40);
		myNumbers.add(3, 50);
		
		System.out.println("List = "+myNumbers);
		System.out.println("Size of list = "+myNumbers.size());
		
		
		//output values with foreach
		System.out.println("List items: ");
		for(int x : myNumbers) {
			System.out.print(" "+x);
		}
		
		
		
		
		
		
		
		
		
		
	}
}
