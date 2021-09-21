package basic;

public class BitwiseOperator {
	public static void main(String[] args) {
		int a=32;
		int b=12;
		
		int c;
		//bitwise operators= AND(&), OR(|), XOR(^), NOT(~), RightShift(>>),
		//LeftShift(<<)
		
		c=a&b;
		System.out.println("And operation: "+c);
		
		c=a|b;
		System.out.println("Or operation: "+c);
		
		c=~a;
		System.out.println("NOT operation: "+c);
		
		c=a^b;
		System.out.println("XOR operation: "+c);
		
		c=a>>2;
		System.out.println("Right shift operation: "+c);
		
		c=a<<2;
		System.out.println("Left shift operation: "+c);
		
		
		
		
		
		
		
		
		
		
	}
}
