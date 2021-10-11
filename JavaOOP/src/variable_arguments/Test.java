package variable_arguments;

public class Test {
	public static void main(String[] args) {
		Add obj = new Add();
		
		obj.add(1,2,3,4,5);
		obj.add(10,3);
		obj.add(10,20,10);
	}
}
