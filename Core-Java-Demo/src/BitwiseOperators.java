
public class BitwiseOperators {

	public static void main(String[] args)  {
		
		int ten = 10; // 1010
		int twenty = 20; // 10100
		
		// Bitwise OR (|) - if either of the bits is 1, it gives 1, else it gives 0
		// 	 1010 
		// |
		//  10100
		// ---------
		//  11110 // Decimal 30
		
		System.out.println("Bitwise OR of 10 and 20 is ---> " + (ten | twenty));
		
		// Bitwise AND (&) - if both bits are 1, it gives 1, else it gives 0
		//	 1010 
		// &
		//  10100
		// ---------
		//  00000 // Decimal 0
		System.out.println("Bitwise AND of 10 and 20 is ---> " + (ten & twenty));
		
		// Bitwise XOR (^) - if corresponding bits are different, it gives 1, else it gives 0
		//	 1010 
		// ^
		//  10100
		// ---------
		//  11110 // Decimal 30
		System.out.println("Bitwise XOR of 10 and 20 is ---> " + (ten ^ twenty));
		
		// Bitwise Complement (~) – inverts all bits, meaning it makes every 0 to 1, and every 1 to 0.
		//  ~1010
		// ---------
		//   0101 // Decimal 5		
		System.out.println("Bitwise COMPLIMENT of 10 is ---> " + (~ten));
		
		// Signed Shift Right (>>) - Shifts the bits of the number to the right and fills the voids left with the sign bit
		//  ten = 1010; ten >> 2 == 0010 // Decimal 2
		System.out.println("Shift Right 10 by 2 is ---> " + (ten >> 2));
		
		// Signed Shift Left (<<) - Shifts the bits of the number to the right and fills the voids left with the sign bit
		//  ten = 1010; ten << 2 == 101000 // Decimal 40
		System.out.println("Shift Left 10 by 2 is ---> " + (ten << 2));
		
	}
}
