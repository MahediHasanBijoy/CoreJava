package call_by_reference;

public class Reference {
	String name;
	
	void change(Reference r2) {
		r2.name = "mahedi";
	}
}
