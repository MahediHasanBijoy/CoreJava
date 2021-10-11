/*
 * problem: Create a class called Box that includes three pieces of information as instance variables-
 * height, width and depth(type-double) of two boxes.Your class should have a constructor and initializes
 * three instance variables. Provide a method displayVol that display the volume of two boxes.Suppose, the
 * values of instance variables for the first box's are (10,10,10) and second box's are (20,30,10). Write
 * a test application named BoxVolume that demonstrate class box's capabilities.
 */
package problem_solving;

public class Box {
	double height;
	double width;
	double depth;
	
	Box(double h, double w, double d){
		height = h;
		width = w;
		depth = d;
	}
	
	void displayVol() {
		System.out.println("volume = "+(height*width*depth));
	}
}
