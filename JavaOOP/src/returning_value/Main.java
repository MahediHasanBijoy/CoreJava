package returning_value;

public class Main {
	public static void main(String[] args) {
		ReturnValue obj = new ReturnValue();
		System.out.println("Square of 5 = "+obj.square(5));
		
		ReturnValue obj2 = new ReturnValue();
		System.out.println("Square of 6 = "+obj2.square(6));
	}
}
