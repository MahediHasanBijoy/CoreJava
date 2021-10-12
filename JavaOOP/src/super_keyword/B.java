package super_keyword;

public class B extends A {
	//int x = 10;   from class A
	
	int x = 5;
	//super keyword refer to super class properties
	void displayInfo() {
		System.out.println("x = "+super.x);
	}
	
	//overriden method
	void display() {
		//for using the method of super class
		super.display();
		
		System.out.println("inside class B....");
	}
	
	
}
