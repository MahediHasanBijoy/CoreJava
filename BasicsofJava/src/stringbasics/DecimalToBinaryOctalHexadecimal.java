package stringbasics;

public class DecimalToBinaryOctalHexadecimal {
	public static void main(String[] args) {

		int i = 100;
		System.out.println("decimal = "+i);
		
		//decimal to binary
		String binary = Integer.toBinaryString(i);
		System.out.println("binary = "+binary);
		
		//decimal to octal
		String octal = Integer.toOctalString(i);
		System.out.println("octal = "+octal);
		
		//decimal to hexadecimal
		String hexadecimal = Integer.toHexString(i);
		System.out.println("hexadecimal = "+hexadecimal);
	}
}
