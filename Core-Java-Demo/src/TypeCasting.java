
public class TypeCasting {
	

	public static void main(String[] args)  {
		
		// Widening Casting - Implicit
		int numInt = 10;
		double numDouble = numInt;
		
		System.out.println("myInt is "+ numInt);
		System.out.println("numDouble is "+ numDouble);
		
		// Narrowing Casting - Implicit
		double myDouble = 10.10d;
		int myInt = (int)myDouble; // Manual casting - double to int
		
		System.out.println("myDouble is "+ myDouble);
		System.out.println("myInt is "+ myInt);
		
	}

}
