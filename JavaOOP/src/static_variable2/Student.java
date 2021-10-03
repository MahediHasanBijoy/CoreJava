package static_variable2;

public class Student {
	int count = 0; //non-static variable
	static int cnt = 0; //static variable
	Student(){
		count++;
		cnt++;
	}
	
	void totalStudent() {
		System.out.println("total = "+count);
		System.out.println("Total = "+cnt);
		System.out.println();
	}
}
