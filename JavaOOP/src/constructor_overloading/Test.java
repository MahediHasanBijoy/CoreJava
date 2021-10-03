package constructor_overloading;

public class Test {
	public static void main(String[] args) {
		Teacher t1 = new Teacher();
		
		Teacher t2 = new Teacher("anisul islam", "male");
		t2.display();
		
		Teacher t3 = new Teacher("fatema tuj johra", "female", 1838200833);
		t3.display();
	}
}
