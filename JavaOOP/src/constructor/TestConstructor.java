package constructor;

public class TestConstructor {
	public static void main(String[] args) {
		
		Teacher t1 = new Teacher("anisul", 28, "CSE");
		
		t1.display();
		
		Teacher t2 = new Teacher();
		t2.display();
		
		
		
	}
}
