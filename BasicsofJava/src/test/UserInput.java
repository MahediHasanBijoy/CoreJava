package test;
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("enter any number: ");
		
		num= input.nextInt();
		input.close();
		
		System.out.println("number= "+num);
		
		String name;
		
		System.out.println("enter your name: ");
		//nextInt() throws a newline which is grabbed by next line so to skip 
		//this input.skip("\\R") is used.
		input.skip("\\R");
		name = input.nextLine();
		
		System.out.print("name: "+name);
		
	}

}
