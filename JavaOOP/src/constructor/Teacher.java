package constructor;

public class Teacher {
	String name;
	int age;
	String dept;
	
	Teacher(){
		System.out.println("nothing is here!\n");
	}
	
	Teacher(String n, int a, String d){
		name = n;
		age = a;
		dept = d;
	}
	
	void display() {
		System.out.println("Name = "+name);
		System.out.println("Age = "+age);
		System.out.println("Dept = "+dept);
		System.out.println("\n");
	}
	

}
