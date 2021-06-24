
public class TypeCasting {
	

	public static void main(String[] args)  {
		
		// Widening Casting - Implicit
		int numInt = 10;
		long numLong = numInt;
		double numDouble = numInt;
		
		System.out.println("myInt is "+ numInt);
		System.out.println("numLong is "+ numLong);
		System.out.println("numDouble is "+ numDouble);
		
		// Narrowing Casting - Implicit
		double myDouble = 10.10d;
		long myLong = (long)myDouble;
		int myInt = (int)myDouble; // Manual casting - double to int
		
		System.out.println("myDouble is "+ myDouble);
		System.out.println("myLong is "+ myLong);
		System.out.println("myInt is "+ myInt);
		
	}

}
