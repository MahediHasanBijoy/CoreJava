package super_keyword_example_problem;

public class Car extends Vehicle{
	//inherited color,weight,attributes
	
	int gear;
	
	Car(String c, double w, int g ){
		super(c,w);
		gear = g;
	}
	
	//overriden method
	void attributes() {
		super.attributes();
		System.out.println("gear = "+gear);
	}
}
