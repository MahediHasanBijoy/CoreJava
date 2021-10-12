package inheritance;

public class Person {
	String name;
	int age;
	private int id;
	
	void display1() {
		System.out.println("name = "+name);
		System.out.println("age = "+age);
	}
	
	void setId(int id) {
		this.id = id;
	}
	
	int getId() {
		return id;
	}
}
