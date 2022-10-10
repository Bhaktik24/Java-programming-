package corejava.basic;

import java.util.Scanner;

public class RelationalOperator {

	public static void main(String[] args) {
		//Creating Scanner class object to take the input from the user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1=sc.nextInt();
	
		System.out.println("Enter second number: ");
		int num2=sc.nextInt();
		sc.close();
		 
		//performing Equal To operation
		
		System.out.println("Num1==Num2:" +(num1==num2));
		
		//performing is not Equal To operation
		
		System.out.println("Num1!=Num2:" +(num1!=num2));
				
				
		//performing grater than operation
				
        System.out.println("Num1>Num2:" +(num1>num2));		
       
        //performing less than operation
		
        System.out.println("Num1<Num2:" +(num1<num2));	
        
       //performing grater than equal to operation
		
       System.out.println("Num1<=Num2:" +(num1<=num2));	
       //performing grater than equal to operation
		
       System.out.println("Num1>=Num2:" +(num1>=num2));	
		
		
		 


	}

}
