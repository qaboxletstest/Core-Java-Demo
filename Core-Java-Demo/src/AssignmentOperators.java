
public class AssignmentOperators {

	public static void main(String[] args)  {
		
		// "="
		int age = 30;
		
		// Compound Statement ----> +=, -=, *=, /=, %=
		
		// "+=" --> This operator is a compound of ‘+’ and ‘=’ operators.
		int num1 = 100, num2 = 20; // Setup multiple variables in one line
		num1 += num2;
		// num1 = num1 + num2
		System.out.println(num1);
	
		// "-=" --> This operator is a compound of ‘-’ and ‘=’ operators.
		int num3 = 100, num4 = 20;
		num3 -= num4;
		// num3 = num3 - num4
		System.out.println(num3);

		// "*=" --> This operator is a compound of ‘*’ and ‘=’ operators.
		int num5 = 100, num6 = 20;
		num5 *= num6;
		// num5 = num5 * num6
		System.out.println(num5);
		
		// "/=" --> This operator is a compound of ‘/’ and ‘=’ operators.
		int num7 = 100, num8 = 20;
		num7 /= num8;
		// num7 = num7 / num8
		System.out.println(num7);
		
		// "%=" --> This operator is a compound of ‘%’ and ‘=’ operators.
		int num9 = 101, num10 = 20;
		num9 %= num10;
		// num9 = num9 % num10
		System.out.println(num9);
		
	}
}
