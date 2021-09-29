package stringbasics;

public class DemoStringBuffer {
	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("Mahedi");
		
		System.out.println(s1);
		
		//this method is used to concatenate two string in StringBuffer class
		s1.append(" Hasan ");
		s1.append(26);
		System.out.println(s1);
		
		//delete(starting pos, end pos)
		s1.delete(0, 3);
		System.out.println("Delete a portion of string: "+s1);
		
		
		//to reverse a string
		s1.reverse();
		System.out.println(s1);
		
		//setting a length to string
		s1.setLength(5);
		System.out.println(s1);
	}
}
