package super_keyword_example_problem;

public class Vehicle {
	String color;
	double weight;
	
	Vehicle(String c, double w){
		color = c;
		weight = w;
	}
	
	void attributes() {
		System.out.println("color = "+color);
		System.out.println("weight = "+weight);
	}
}
