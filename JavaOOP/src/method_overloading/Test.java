package method_overloading;

public class Test {
	public static void main(String[] args) {
		Overload obj = new Overload();
		obj.add(5,10);
		
		obj.add(5.5,9.5);
		
		obj.add(1,2,3);
		
		obj.add();
		
	}
}
