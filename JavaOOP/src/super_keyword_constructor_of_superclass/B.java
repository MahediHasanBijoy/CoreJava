package super_keyword_constructor_of_superclass;

public class B extends A{
	B(){
		//for calling super class constructor
		//this constructor call must be the first statement of constructor B

		super();
		System.out.println("constructor of class B..");
		
		//after any statement here we can't use super class constructor call
	}
}
