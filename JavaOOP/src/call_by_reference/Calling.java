package call_by_reference;

public class Calling {
	public static void main(String[] args) {
		
		Reference r1 = new Reference();
		
		r1.name = "bijoy";
		System.out.println(r1.name);
		//in call by reference object will pass in the calling function
		r1.change(r1);
		System.out.println(r1.name);
		
	}
}
