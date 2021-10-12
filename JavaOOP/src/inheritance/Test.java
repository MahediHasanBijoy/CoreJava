package inheritance;

public class Test {
	public static void main(String[] args) {
		Teacher t1 = new Teacher();
		t1.name = "anisul";
		t1.age = 30;
		t1.designation = "lecturer";
		
		t1.display2();
		
		t1.setId(101);
		System.out.println("id = "+t1.getId());
		
		t1.setVoterId(222333444);
		System.out.println("voter id = "+t1.getVoterId());
		
	}
}
