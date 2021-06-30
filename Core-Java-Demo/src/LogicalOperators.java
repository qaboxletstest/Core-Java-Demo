
public class LogicalOperators {

	public static void main(String[] args)  {
		
		boolean t = true, f = false;
		
		// && ---> AND
		/*
		 * T && T = T
		 * T && F = F
		 * F && T = F
		 * F && F = F
		 */
		System.out.println("T && F -->"+ (t && f));

		// || ---> OR
		/*
		 * T && T = T
		 * T && F = T
		 * F && T = T
		 * F && F = F
		 */
		System.out.println("T && F -->"+ (t || f));
		
		// ! ---> NOT
		/*
		 * !T = F
		 * !F = T
		 */
		System.out.println("Negate T"+ (!t));
		System.out.println("Negate F"+ (!f));
		
		int a = 10, b = 20, c = 30;
		
		// Use Case
		if(a<b && a<c) {
			System.out.println("a is the smallest number");
		}
	}
}
