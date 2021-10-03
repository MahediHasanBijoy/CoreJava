package oopbasic;

public class Teacher {
		String name, gender;
		int phone;

		Teacher(String m, String x, int y) {
			name = m;
			gender = x;
			phone = y;
		}
		
		void setter(String n, String g, int p) {
			name = n;
			gender = g;
			phone = p;
		}
	
		
		
		
		void display() {
			System.out.println("name = "+ name);
			System.out.println("gender = "+ gender);
			System.out.println("phone = "+ phone);
		}
		
		
}
