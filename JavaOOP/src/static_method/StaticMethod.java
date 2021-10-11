package static_method;

public class StaticMethod {
	void display() {
		System.out.println("This is a non static method.");
	}
	
	static void display2() {
		System.out.println("This is a static method.");
	}
	//static method can't access any non static member
	//static method can't use this and super keyword
	
}
