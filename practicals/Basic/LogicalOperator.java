package corejava.basic;
import java.util.Scanner;
public class LogicalOperator {

	public static void main(String[] args) {
		//Creating Scanner class object to take the input from the user
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter first number: ");
				int num1=sc.nextInt();
			
				System.out.println("Enter second number: ");
				int num2=sc.nextInt();
				

				System.out.println("Enter Third number: ");
				int num3=sc.nextInt();
				
				sc.close();
				
				System.out.println("Performing AND operator...");

				//using logical AND to verify 2 constraint
				
				if((num1<num2)&&(num2==num3))
				{
					int sum=num1+num2+num3;
					System.out.println("sum is: " +sum);
				}
				
				else
				
				{
					System.out.println("False...");
				}


				System.out.println("Performing OR operator...");

				//using logical OR to verify 2 constraint
				
				if((num1<num2)||(num2==num3))
				{
					int sum=num1+num2+num3;
					System.out.println("sum is: " +sum);
				}
				
				else
				
				{
					System.out.println("False...");
				}
				

			

				//using logical NOT
				
				System.out.println("Performing NOT Operation");
				
				System.out.println("!(num1<num2)" + !(num1<num2));
				System.out.println("!(num2==num3)" + !(num2==num3));
				

	}
	
	
}
