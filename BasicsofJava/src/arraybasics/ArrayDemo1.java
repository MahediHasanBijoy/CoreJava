package arraybasics;

public class ArrayDemo1 {
	public static void main(String[] args) {
		int[] array1;			//declaration of array
		array1 = new int[5];	//instantiation of array
		
		array1[0]=1;			//initialization of array
		array1[1]=2;
		array1[2]=3;
		array1[3]=4;
		array1[4]=5;
		
		System.out.print("Array1 = ");
		for(int i=0; i<5; i++ ) {
			System.out.print(array1[i]+" ");
		}
		System.out.println();
		
		int array2[] = {6,7,8,9,10};	//declare, instantiation, initializing in single line
		
		//printing value of array2
		System.out.print("Array2 = ");
		for(int i=0; i<5; i++ ) {
			System.out.print(array2[i]+" ");
		}
		
		//finding length of array
		int len1 = array1.length;
		int len2 = array2.length;
		
		System.out.println();
		System.out.println("len1 = "+len1+"\n"+"len2 = "+len2);
				
	}
}
