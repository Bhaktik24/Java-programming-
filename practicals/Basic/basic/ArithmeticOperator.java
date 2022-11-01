package corejava.basic;
import java.util.Scanner;

public class ArithmeticOperator {

	public static void main(String[] args) {
		//Creating Scanner class objec to take the input from the user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1=sc.nextInt();
	
		System.out.println("Enter second number: ");
		int num2=sc.nextInt();
		
		sc.close();
		
		//writing operation
		int add,sub,mul,mod;
		double div;
		
		add=num1+num2;
		sub=num1-num2;
		mul=num1*num2;
		mod=num1%num2;
		div=num1/num2;
		
		//printing values
		
		System.out.println("Addition: " +add);
		System.out.println("Substraction: " +sub);
		System.out.println("MUltiplication: " +mul);
		System.out.println("Modules: " +mod);
		System.out.println("Divison: " +div);

		

	}

}
