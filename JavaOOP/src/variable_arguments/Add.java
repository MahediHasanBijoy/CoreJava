package variable_arguments;

public class Add {

	//variable length arguments
	void add(int ...x) {
		
		int sum = 0;
		//foreach loop
		for(int i : x) {
			sum = sum + i;
		}
		System.out.println(sum);
	}
	
	
}
