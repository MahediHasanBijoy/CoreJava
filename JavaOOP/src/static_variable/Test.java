package static_variable;

public class Test {
	public static void main(String[] args) {
		
		//accessing nos-static variable from Student::class
		Student s1 = new Student();
		System.out.println("university name = "+s1.university);
		
		
		//accessing static variable from Student class
		System.out.println("Student name = "+Student.studentName);
		
		//assigning value to a static variable in Student class
		Student.age = 25;
		System.out.println("Student age = "+Student.age);
		
		
	}
}
