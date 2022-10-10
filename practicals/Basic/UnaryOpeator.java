package corejava.basic;

import java.util.Scanner;

class UnaryOpeator {

	public static void main(String[] args) {

		//Creating Scanner class object to take the input from the user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		int num1=sc.nextInt();
		
		//performing pre Increment operator
		++num1;
		System.out.println("Pre Increment value: "+num1);
		
		//performing post Increment operator
		num1++;
		System.out.println("Post Increment value: "+num1);
		
		//performing pre Decrement operator
		--num1;
		System.out.println("Pre Decrement value: "+num1);
		
		//performing post Decrement operator
		num1--;
		System.out.println("Post Decrement value: "+num1);

	}

}
