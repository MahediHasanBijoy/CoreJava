package stringbasics;

public class ConversionBetweenStringAndPrimitiveDataType {
	public static void main(String[] args) {
		//primitive data to string 
		int i = 10;
		String s = Integer.toString(i);
		System.out.println("String = "+s);
		
		double d = 14.5;
		String s2 = Double.toString(d);
		System.out.println("S2 = "+s2);
		
		boolean b = true;
		String s3 = Boolean.toString(b);
		System.out.println("S3 = "+s3);
		
		//String to primitive data type
		String s4 = "32";
		int num = Integer.parseInt(s4);
		int sum = num + 10;
		System.out.println("num = "+num+"\nSum = "+sum);
		//another method of converting string to primitive
		int num2 = Integer.valueOf(s4);
		System.out.println("num2 = "+num2);

	}
}
