package method_overriding;

public class Teacher extends Person {
	String designation;
	
	//override method
	void displayInformation() {
		System.out.println("name = "+name);
		System.out.println("age = "+age);
		System.out.println("designation = "+designation);
	}
}
