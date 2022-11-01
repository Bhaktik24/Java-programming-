package corejava.basic;

import java.util.Scanner;

class AssignmentOperator {

	public static void main(String[] args) {
		//Creating Scanner class object to take the input from the user
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter first number: ");
				int num1=sc.nextInt();
			
				System.out.println("Enter second number: ");
				int num2=sc.nextInt();
				sc.close();
				
				//Adding and Assigning value
				num1+=num2;
				System.out.println("num1=num1+num2:" +num1);
				//Adding and Assigning value
				num1-=num2;
				System.out.println("num1=num1-num2:" +num1);
				num1*=num2;
				System.out.println("num1=num1*num2:" +num1);
				num1/=num2;
				System.out.println("num1=num1/num2:" +num1);
				num1%=num2;
				System.out.println("num1=num1%num2:" +num1);
		


	}

}
