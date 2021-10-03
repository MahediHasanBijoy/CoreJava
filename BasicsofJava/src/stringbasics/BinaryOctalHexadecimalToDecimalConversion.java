package stringbasics;

public class BinaryOctalHexadecimalToDecimalConversion {
	public static void main(String[] args) {
		//binary to decimal
		String binary = "1010";
		Integer decimal = Integer.parseInt(binary, 2);
		System.out.println("decimal = "+decimal);
		
		//octal to decimal
		String octal ="675";
		Integer decimal2 = Integer.parseInt(octal,8);
		System.out.println("decimal2 = "+decimal2);
		
		//hexadecimal to decimal
		String hexadecimal = "fff";
		Integer decimal3 = Integer.parseInt(hexadecimal, 16);
		System.out.println("decimal3 = "+decimal3);
		
	}
}
