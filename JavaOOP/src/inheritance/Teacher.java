package inheritance;

public class Teacher extends Person {
	String designation;
	
	private int voterId;
	
	void display2() {
		display1();
		System.out.println("designation = "+designation);
	}
	
	
	public void setVoterId(int voterId) {
		this.voterId = voterId;
	}
	
	public int getVoterId() {
		return voterId;
	}
}
