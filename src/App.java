// Arrays
public class App {

	public static void main(String[] args) {
		
		int number = 7;
		System.out.println(number);
		
		// Can initialize array only when don't give size
		int[] arrayInt = {1,2,3};
		
		// Can also initialize size of array with new constructor
		// Unlike C++, there is an initial value put into each element
		arrayInt = new int[3];
		System.out.println(arrayInt[0]);
		System.out.println(arrayInt[1]);		
		System.out.println(arrayInt[2]);
		
		// Can iterate over array, array.length gives length of array.
		for (int i = 0; i < arrayInt.length; i++) {
			System.out.println(arrayInt[i]);
		}
		
	}

}
