package method_overriding;

public class Test {
	public static void main(String[] args) {
		Person p = new Person();
		Teacher t = new Teacher();
		
		p.name = "Mahedi";
		p.age = 25;
		p.displayInformation();
		
		t.name = "bijoy";
		t.age = 30;
		t.designation = "unemployed";
		t.displayInformation();
	}
}
