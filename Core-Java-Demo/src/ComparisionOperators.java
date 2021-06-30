
public class ComparisionOperators {

	public static void main(String[] args)  {
		
		int num1 = 30, num2 = 40;
		
		// == ---> Equal to
		System.out.println("num1 is equal to num2 -->"+ (num1 == num2));

		// == ---> Not equal to
		System.out.println("num1 is not equal to num2 -->"+ (num1 != num2));
		
		// == ---> Greater than
		System.out.println("num1 is greater than num2 -->"+ (num1 > num2));
		
		// == ---> Less than
		System.out.println("num1 is less than num2 -->"+ (num1 < num2));
		
		// == ---> Greater than or Equal to
		System.out.println("num1 is greater than or equal to num2 -->"+ (num1 >= num2));
		
		// == ---> Less than or Equal to
		System.out.println("num1 is less than or equal to num2 -->"+ (num1 <= num2));
		
		// Use Case
		if(num1 == num2) {
			System.out.println("Num1 is equal to Num2");
		} else {
			System.out.println("Num1 is not equal to Num2");
		}
	}
}
