package constructor_overloading;

public class Teacher {
	String name, gender;
	int phone;
	
	Teacher(){
		System.out.println("no information");
	}
	
	Teacher(String n, String g){
		name = n;
		gender = g;
	}
	
	Teacher(String n, String g, int p){
		name = n;
		gender = g;
		phone = p;
	}
	
	void display() {
		System.out.println("name = "+name);
		System.out.println("gender = "+gender);
		System.out.println("phone = "+phone);
	}
}
