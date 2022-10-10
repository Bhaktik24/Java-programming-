package corejava.basic;

import java.util.Scanner;

 class BitwiseOperatorPractical
{

	public static void main(String[] args) {
		//Creating Scanner class object to take the input from the user
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter first number: ");
				int num1=sc.nextInt();
			
				System.out.println("Enter second number: ");
				int num2=sc.nextInt();
				sc.close();
				
				        // Bitwise AND operator
						System.out.println("num1&num2="+(num1 & num2));
						// 1 0 0 1 = 9
				        // 1 0 0 0 = 8
						//--------
						// 1 0 0 0 = 8  
						
						//Bitwise OR operator
						System.out.println("num1|num2="+(num1 | num2));
						// 1 0 0 1 = 9
				        // 1 0 0 0 = 8
						//--------
						// 1 0 0 1 = 9
						
						//Bitwise XOR operator
						System.out.println("num1^num2="+(num1 ^ num2));
						// 1 0 0 1 = 9
				        // 1 0 0 0 = 8
						//--------
						// 0 0 0 1 = 1 
	}

}
