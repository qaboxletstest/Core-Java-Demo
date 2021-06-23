
public class VariablesPrimitiveTypes {
	
	static int classVar; // Class Variable
	private int instanceVar; // Instance Variable
	

	public static void main(String[] args)  { // Argument
		// Creating Variable - Two Step Process ---> Declaration + Initialization
		int age; // Local Variable
		age = 20;
		System.out.println(age);
		
		
		// Types of Variables - Local, Instance, Class and Arguments
		
		// Variable & static typing = Vary + Able
		age = 30;
//		age = true
		
		// Default Value - Local variable must be initialized, Class and Instance get default values if not initialized
		float percentage = 0;
		System.out.println(percentage);
		System.out.println("Class Variable " + VariablesPrimitiveTypes.classVar);
		System.out.println("Instance Variable " + new VariablesPrimitiveTypes().instanceVar);
		
		// Types & Ranges
		byte num1 = 127; // -128 to 127 ----->  1 Byte
		short num2 = 32767; // -32,768 to 32,767 ----->  2 Bytes
		int num3 = 2_147_483_647;
		long num4 = 9999999999L;
		
		boolean isMale = true;
		char charA = 'A';
		char char20 = 70;
		System.out.println(charA);
		System.out.println(char20);
		
		float num5 = 12.3f;
		double num6 = 32.67889d;
		
		
		//A primitive data type specifies the size and type of variable values, and it has no additional methods.
		//		age.
		Integer age1 = 30;
		
		// CONSTANT
		final int NUMBER = 20;
//		number = 30;
		final float PI = 3.14159f;
	

	}

}

/* Naming Convention
1. Names can contain letters, digits, underscores, and dollar signs
2. Names must begin with either letter, or $ or _
3. Names should start with a lowercase letter and it cannot contain whitespace
4. Names should be camel cased in case it is formed by more than one word
5. Names are case sensitive ("classVar" and "classvar" are different variables)
6. Reserved words (like Java keywords, such as int or boolean) cannot be used as names
 */
