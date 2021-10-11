package staticblock;

public class StaticBlock {
	
	static int i;
	static String name;
	
	static{
	i = 10;
	name = "mahedi";
	}	
		
	void display() {
		System.out.println("i = "+i);
		System.out.println("name = "+name);
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		StaticBlock obj = new StaticBlock();
		obj.display();
		
	}
}
