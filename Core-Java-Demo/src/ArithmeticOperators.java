
public class ArithmeticOperators {

	public static void main(String[] args)  {
		
		int num1 = 5;
		int num2 = 2;
		
		// Add
		int add = num1 + num2;
		System.out.println(add);
		
		// Subtract
		int sub = num1 - num2;
		System.out.println(sub);
		
		// Multiply
		int mul = num1 * num2;
		System.out.println(mul);
		
		// Division - Quotient
		int div = num1 / num2;
		float divf = (float)num1/num2;
		System.out.println(div);
		System.out.println(divf);
		
		// Modulus - remainder
		int mod = num1 % num2;
		System.out.println(mod);
		
		// Increment
		int num3 = 99;
		num3++;
//		num3 = num3 + 1;
		System.out.println(num3);	
		
		// Decrement
		int num4 = 100;
		num4--;
//		num4 = num4 - 1;
		System.out.println(num4);	
		
		// 1. increment and decrement (Right to left) ----> ++ --
		//2. multiplicative (Left to right) ----> * / % 
		//3. additive (Left to right) ----> + -
		double res = 2 + 3 * 5 / (double)2 - 4; 
		// 2 + 15 / 2 - 4; --> 2 + 7.5 - 4;
		// 9.5 - 4; res = 5.5
		System.out.println(res);
		
	}
}
