package static_keyword;

public class Student {
	String name;
	int id;
	static String university = "SEC";
	
	Student(String n, int i){
		name = n;
		id = i;
	}
	
	
	void display() {
		System.out.println("name = "+name);
		System.out.println("id = "+id);
		System.out.println("university = "+university);
	}
}
